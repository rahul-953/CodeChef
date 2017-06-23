
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//https://www.hackerearth.com/notes/segment-tree-and-lazy-propagation/
//
//void updateRange(int node, int start, int end, int l, int r, int val)
//{
//    if(lazy[node] != 0)
//    { 
//        // This node needs to be updated
//        tree[node] += (end - start + 1) * lazy[node];    // Update it
//        if(start != end)
//        {
//            lazy[node*2] += lazy[node];                  // Mark child as lazy
//            lazy[node*2+1] += lazy[node];                // Mark child as lazy
//        }
//        lazy[node] = 0;                                  // Reset it
//    }
//    if(start > end or start > r or end < l)              // Current segment is not within range [l, r]
//        return;
//    if(start >= l and end <= r)
//    {
//        // Segment is fully within range
//        tree[node] += (end - start + 1) * val;
//        if(start != end)
//        {
//            // Not leaf node
//            lazy[node*2] += val;
//            lazy[node*2+1] += val;
//        }
//        return;
//    }
//    int mid = (start + end) / 2;
//    updateRange(node*2, start, mid, l, r, val);        // Updating left child
//    updateRange(node*2 + 1, mid + 1, end, l, r, val);   // Updating right child
//    tree[node] = tree[node*2] + tree[node*2+1];        // Updating root with max value 
//}
//
//int queryRange(int node, int start, int end, int l, int r)
//{
//    if(start > end or start > r or end < l)
//        return 0;         // Out of range
//    if(lazy[node] != 0)
//    {
//        // This node needs to be updated
//        tree[node] += (end - start + 1) * lazy[node];            // Update it
//        if(start != end)
//        {
//            lazy[node*2] += lazy[node];         // Mark child as lazy
//            lazy[node*2+1] += lazy[node];    // Mark child as lazy
//        }
//        lazy[node] = 0;                 // Reset it
//    }
//    if(start >= l and end <= r)             // Current segment is totally within range [l, r]
//        return tree[node];
//    int mid = (start + end) / 2;
//    int p1 = queryRange(node*2, start, mid, l, r);         // Query left child
//    int p2 = queryRange(node*2 + 1, mid + 1, end, l, r); // Query right child
//    return (p1 + p2);
//}

class DIVMAC_3 {
	static int leastPrimeDivisor[] = new int[1000001];

	public static void init() {
		int i = 2;
		leastPrimeDivisor[0]=1;
		leastPrimeDivisor[1]=1;
		for (; i <= 1000000; i++) {
			leastPrimeDivisor[i]=leastPrime(i);
		}
	}

	public static int leastPrime(int num) {

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

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		long start = System.nanoTime();
		init();
		long end = System.nanoTime();
		//System.out.println("Total time is : "+(float)((end-start)/(1000000000.00F)));
		String input[];
		int n, m;
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

			for (i = 0; i < m; i++) {
				input = br.readLine().split(" ");
				type = Integer.parseInt(input[0]);
				l = Integer.parseInt(input[1])-1;
				r = Integer.parseInt(input[2])-1;

				if (type == 0) {
					// update(l,r);
					for(j=l;j<=r;j++){
						original[j] /= leastPrimeDivisor[original[j]];
					}
				} else {
					// System.out.println(get(l,r));
					int max=1;
					for(j=l;j<=r;j++){
						max=(int)Math.max(max,leastPrimeDivisor[original[j]]);
					}
					System.out.print(max+" ");
				}
			}
			System.out.println();
		}
	}
}