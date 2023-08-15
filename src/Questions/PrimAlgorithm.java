package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class PrimAlgorithm {
    private int V; // Number of vertices in the graph

    public PrimAlgorithm(int v) {
        V = v;
    }

    // Utility function to find the vertex with minimum key value,
    // from the set of vertices not yet included in MST
    private int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    // Function to print the constructed MST
    private void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "    " + graph[i][parent[i]]);
        }
    }

    // Function to construct and print MST for a graph represented using adjacency matrix representation
    public void primMST(int[][] graph) {
        int[] parent = new int[V]; // Array to store constructed MST
        int[] key = new int[V]; // Key values used to pick minimum weight edge in cut
        boolean[] mstSet = new boolean[V]; // To represent set of vertices not yet included in MST

        // Initialize all keys as INFINITE
        Arrays.fill(key, Integer.MAX_VALUE);

        // Always include first 0th vertex in MST
        key[0] = 0; // Make key 0 so that this vertex is picked as first vertex
        parent[0] = -1; // First node is always the root of MST

        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet); // Pick the minimum key vertex from the set of vertices not yet included in MST
            mstSet[u] = true; // Add the picked vertex to the MST set

            // Update key value and parent index of the adjacent vertices of the picked vertex
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        int[][] graph = new int[V][V];

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        PrimAlgorithm prim = new PrimAlgorithm(V);
        prim.primMST(graph);

        scanner.close();
    }
}
