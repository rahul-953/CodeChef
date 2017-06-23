import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Program for range minimum query using segment
class DIVMAC {

	static int leastPrimeDivisor[] = new int[1000001];
	static int n, m;
	static int max_size, x, temp = 0;

	// array to store segment tree
	static int st[];
	static int lazy[];

	public static void init() {
		int i = 2;
		leastPrimeDivisor[0] = 1;
		leastPrimeDivisor[1] = 1;
		for (; i <= 1000000; i++) {
			leastPrimeDivisor[i] = getLeastPrime(i);
		}
	}

	public static int getLeastPrime(int num) {

		if (num % 2 == 0)
			return 2;

		int sqrt = (int) Math.sqrt(num);
		for (int i = 3; i <= sqrt; i++) {
			if (num % i == 0) {
				return i;
			}
		}
		return num;
	}

	public static void main(String[] args) throws IOException {

		init();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		String input[];

		int i, j;
		int type, l, r;

		while (t-- > 0) {
			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			m = Integer.parseInt(input[1]);

			int[] original = new int[n];
			input = br.readLine().split(" ");

			for (i = 0; i < n; i++)
				original[i] = Integer.parseInt(input[i]);

			constructST(original, n);

			for (i = 0; i < m; i++) {
				input = br.readLine().split(" ");
				type = Integer.parseInt(input[0]);
				l = Integer.parseInt(input[1]) - 1;
				r = Integer.parseInt(input[2]) - 1;

				if (type == 0) {
					// update(l,r);
					// update_tree(0, 0, n - 1, l, r);
					for (j = l; j <= r; j++) {
						original[j] /= leastPrimeDivisor[original[j]];
					}
					constructST(original, n);
				} else {
					// System.out.println(get(l,r));
					// int max = 1;
					//
					// for (j = l; j <= r; j++) {
					// max = (int) Math.max(max,
					// leastPrimeDivisor[original[j]]);
					// }
					System.out.print(query_tree(0, 0, n - 1, l, r) + " ");
				}
			}
			System.out.println();
		}
	}

	// A utility function to get the middle index from corner
	// indexes.
	static int getMid(int s, int e) {
		return s + (e - s) / 2;
	}

	static void update_lazy(int node_index, int node_start, int node_end) {
		st[node_index] /= lazy[node_index];

		if (node_start != node_end) {
			lazy[node_index * 2 + 1] *= leastPrimeDivisor[st[2 * node_index + 1]];
			lazy[node_index * 2 + 2] *= leastPrimeDivisor[st[2 * node_index + 2]];
		}

		lazy[node_index] = 1;
	}

	static void update_tree(int node_index, int node_start, int node_end, int query_start, int query_end) {
		if (lazy[node_index] != 1)
			update_lazy(node_index, node_start, node_end);

		if (node_start > node_end || node_start > query_end || node_end < query_start)
			return;

		if (node_start >= query_start && node_end <= query_end) {
			st[node_index] /= leastPrimeDivisor[st[node_index]];
			if (node_start != node_end) {
				lazy[node_index * 2 + 1] *= leastPrimeDivisor[st[node_index]];
				lazy[node_index * 2 + 2] *= leastPrimeDivisor[st[node_index]];
			}
			return;
		}
		int mid = getMid(node_start, node_end);
		update_tree(node_index * 2 + 1, node_start, mid, query_start, query_end);
		update_tree(2 + node_index * 2, 1 + mid, node_end, query_start, query_end);

		st[node_index] = (int) Math.max(st[node_index * 2], st[node_index * 2 + 1]);
	}

	static int query_tree(int node_index, int node_start, int node_end, int query_start, int query_end) {

		if (lazy[node_index] != 1)
			update_lazy(node_index, node_start, node_end);

		if (node_start > node_end || node_start > query_end || node_end < query_start)
			return 1;
		else if (node_start >= query_start && node_end <= query_end)
			return st[node_index];

		int mid = getMid(node_start, node_end);
		int left = query_tree(node_index * 2 + 1, node_start, mid, query_start, query_end);
		int right = query_tree(node_index * 2 + 2, mid + 1, node_end, query_start, query_end);

		return (int) Math.max(left, right);
	}

	/*
	 * A recursive function to get the minimum value in a given range of array
	 * indexes. The following are parameters for this function.
	 * 
	 * st --> Pointer to segment tree index --> Index of current node in the
	 * segment tree. Initially 0 is passed as root is always at index 0 ss & se
	 * --> Starting and ending indexes of the segment represented by current
	 * node, i.e., st[index] qs & qe --> Starting and ending indexes of query
	 * range
	 */
	int RMQUtil(int ss, int se, int qs, int qe, int index) {
		// If segment of this node is a part of given range, then
		// return the min of the segment
		if (qs <= ss && qe >= se)
			return st[index];

		// If segment of this node is outside the given range
		if (se < qs || ss > qe)
			return 1;

		// If a part of this segment overlaps with the given range
		int mid = getMid(ss, se);
		return (int) Math.max(RMQUtil(ss, mid, qs, qe, 2 * index + 1), RMQUtil(mid + 1, se, qs, qe, 2 * index + 2));
	}

	// Return minimum of elements in range from index qs (quey
	// start) to qe (query end). It mainly uses RMQUtil()
	int RMQ(int n, int qs, int qe) {
		// Check for erroneous input values
		if (qs < 0 || qe > n - 1 || qs > qe) {
			System.out.println("Invalid Input");
			return -1;
		}

		return RMQUtil(0, n - 1, qs, qe, 0);
	}

	// A recursive function that constructs Segment Tree for
	// array[ss..se]. si is index of current node in segment tree st
	static void constructSTUtil(int arr[], int node_start, int node_end, int node_index) {

		if (node_start == node_end) {
			st[node_index] = leastPrimeDivisor[arr[node_start]];
			return;
		}

		int mid = getMid(node_start, node_end);
		constructSTUtil(arr, node_start, mid, node_index * 2 + 1);
		constructSTUtil(arr, mid + 1, node_end, node_index * 2 + 2);
		st[node_index] = (int) Math.max(leastPrimeDivisor[st[2 * node_index + 1]],
				leastPrimeDivisor[st[2 * node_index + 2]]);
	}

	/*
	 * Function to construct segment tree from given array. This function
	 * allocates memory for segment tree and calls constructSTUtil() to fill the
	 * allocated memory
	 */
	static void constructST(int arr[], int n) {
		// Allocate memory for segment tree

		// Height of segment tree
		x = (int) (Math.ceil(Math.log(n) / Math.log(2)));

		// Maximum size of segment tree
		max_size = 2 * (int) Math.pow(2, x) - 1;
		st = new int[max_size]; // allocate memory
		lazy = new int[max_size];
		for (int i = 0; i < max_size; i++) {
			lazy[i] = 1;
			st[i] = 1;
		}

		// Fill the allocated memory st
		constructSTUtil(arr, 0, n - 1, 0);
	}

	// Driver program to test above functions
	public static void driver(String args[]) {
		int arr[] = { 1, 3, 2, 7, 9, 11 };
		int n = arr.length;
		DIVMAC tree = new DIVMAC();

		// Build segment tree from given array
		tree.constructST(arr, n);

		int qs = 1; // Starting index of query range
		int qe = 5; // Ending index of query range

		// Print minimum value in arr[qs..qe]
		System.out.println("Minimum of values in range [" + qs + ", " + qe + "] is = " + tree.RMQ(n, qs, qe));
	}
}