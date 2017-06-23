

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class CHFNFRN {
	
	public static void main(String[] args) throws IOException {

//		int G[][] = { { 0, 0, 0, 0 }, { 0, 0, 1, 1 }, { 0, 1, 0, 1 }, { 0, 1,1, 0 }
//		
//		 };
//		 System.out.println("Graph is \n" + G);
//		 Bipartite b = new Bipartite();
//		 if (b.isBipartite(G, 0))
//		 System.out.println("Yes");
//		 else
//		 System.out.println("No");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		String input[];
		int n, m;
		int ai, bi;
		int i, j;

		while (t-- > 0) {
			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			m = Integer.parseInt(input[1]);

			int graph[][] = new int[n][n];
			int compliment[][] = new int[n][n];

			for (i = 0; i < m; i++) {
				input = br.readLine().split(" ");
				ai = Integer.parseInt(input[0]) - 1;
				bi = Integer.parseInt(input[1]) - 1;
				graph[bi][ai] = graph[ai][bi] = 1;
			}

			for (i = 0; i < n; i++) {
				for (j = i + 1; j < n; j++) {
					if (graph[i][j] != 1) {
						compliment[i][j] = 1;
						compliment[j][i] = 1;
					}
				}
			}

			for (i = 0; i < n; i++) {
				compliment[i][i] = 0;
			}

			Bipartite bpt = new Bipartite();
			if (bpt.isBipartite(compliment, 0))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

class Bipartite {
	int V; // No. of Vertices
	int visited[];

	// This function returns true if graph G[V][V] is Bipartite, else false
	boolean isBipartite(int G[][], int src) {
		// Create a color array to store colors assigned to all veritces.
		// Vertex number is used as index in this array. The value '-1'
		// of colorArr[i] is used to indicate that no color is assigned
		// to vertex 'i'. The value 1 is used to indicate first color
		// is assigned and value 0 indicates second color is assigned.
		V=G.length;
		visited= new int[V];
		int colorArr[] = new int[V];
		for (int i = 0; i < V; ++i)
			colorArr[i] = -1;

		// Assign first color to source
		colorArr[src] = 1;

		// Create a queue (FIFO) of vertex numbers and enqueue
		// source vertex for BFS traversal
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(src);

		// Run while there are vertices in queue (Similar to BFS)
		while (!allVisited(visited)) {

			// Dequeue a vertex from queue
			if (q.size() != 0) {

				int u = q.poll();
				visited[u] = 1;
				// Find all non-colored adjacent vertices
				for (int v = 0; v < V; ++v) {
					// An edge from u to v exists and destination v is
					// not colored
					if (G[u][v] == 1 && colorArr[v] == -1) {
						// Assign alternate color to this adjacent v of u
						colorArr[v] = 1 - colorArr[u];
						q.add(v);
					}

					// An edge from u to v exists and destination v is
					// colored with same color as u
					else if (G[u][v] == 1 && colorArr[v] == colorArr[u])
						return false;
				}

			} else {
				for (int i = 0; i < V; i++) {
					if (visited[i] != 1) {
						q.add(i);
						break;
					}
				}
			}
		}
		// If we reach here, then all adjacent vertices can
		// be colored with alternate color
		return true;
	}

	public static boolean allVisited(int[] G) {

		int len = G.length;
		for (int i = 0; i < len; i++)
			if (G[i] != 1)
				return false;
		return true;
	}
}