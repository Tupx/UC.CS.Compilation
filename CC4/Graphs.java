package kruskal1;

import java.util.*;
import java.lang.*;
import java.io.*;

class Graphs {

    static int a;

    // A class to represent a graph edge 
    class Edge implements Comparable<Edge> {

        int src, dest, weight;

        // Comparator function used for sorting edges  
        // based on their weight 
        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    };

    // A class to represent a subset for union-find 
    class subset {

        int parent, rank;
    };

    int V, E;    // V-> no. of vertices & E->no.of edges 
    Edge edge[]; // collection of all edges 

    // Creates a graph with V vertices and E edges 
    Graphs(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i) {
            edge[i] = new Edge();
        }
    }

    // A utility function to find set of an element i 
    // (uses path compression technique) 
    int find(subset subsets[], int i) {
        // find root and make root as parent of i (path compression) 
        if (subsets[i].parent != i) {
            subsets[i].parent = find(subsets, subsets[i].parent);
        }

        return subsets[i].parent;
    }

    // A function that does union of two sets of x and y 
    // (uses union by rank) 
    void Union(subset subsets[], int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        // Attach smaller rank tree under root of high rank tree 
        // (Union by Rank) 
        if (subsets[xroot].rank < subsets[yroot].rank) {
            subsets[xroot].parent = yroot;
        } else if (subsets[xroot].rank > subsets[yroot].rank) {
            subsets[yroot].parent = xroot;
        } // If ranks are same, then make one as root and increment 
        // its rank by one 
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    // The main function to construct MST using Kruskal's algorithm 
    void KruskalMST() {
        Edge result[] = new Edge[V];  // Tnis will store the resultant MST 
        int e = 0;  // An index variable, used for result[] 
        int i = 0;  // An index variable, used for sorted edges 
        for (i = 0; i < V; ++i) {
            result[i] = new Edge();
        }

        // Step 1:  Sort all the edges in non-decreasing order of their 
        // weight.  If we are not allowed to change the given graph, we 
        // can create a copy of array of edges 
        Arrays.sort(edge);

        // Allocate memory for creating V ssubsets 
        subset subsets[] = new subset[V];
        for (i = 0; i < V; ++i) {
            subsets[i] = new subset();
        }

        // Create V subsets with single elements 
        for (int v = 0; v < V; ++v) {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        i = 0;  // Index used to pick next edge 

        // Number of edges to be taken is equal to V-1 
        while (e < V - 1) {
            // Step 2: Pick the smallest edge. And increment  
            // the index for next iteration 
            Edge next_edge = new Edge();
            next_edge = edge[i++];

            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);

            // If including this edge does't cause cycle, 
            // include it in result and increment the index  
            // of result for next edge 
            if (x != y) {
                result[e++] = next_edge;
                Union(subsets, x, y);
            }
            // Else discard the next_edge 
        }

        // print the contents of result[] to display 
        // the built MST 
        System.out.println("Following are the edges in "
                + "the constructed MST");
        for (i = 0; i < e; ++i) {
            System.out.println(numb(result[i].src) + " -- "
                    + numb(result[i].dest) + " = " + result[i].weight);
        }
    }

    // Driver Program 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V = scan.nextInt();
        System.out.println("Enter number of Edges:");
        int E = scan.nextInt();
        Graphs graph = new Graphs(V, E);

        for (int i = 0, j = 0; i < E && j != 3; i++) {

            System.out.println("Enter V1:");
            String src = scan.next();
            ABC(src);
            graph.edge[i].src = a;
            System.out.println("Enter V2:");
            String dest = scan.next();
            ABC(dest);
            graph.edge[i].dest = a;
            System.out.println("Enter edge/weight");
//                    String edge = scan.next();                   
//                    graph.edge[i].weight = a; 
            graph.edge[i].weight = scan.nextInt();

        }
        graph.KruskalMST();
    }

    public static void ABC(String c) {

        if (c.equalsIgnoreCase("a")) {
            a = 0;
        } else if (c.equalsIgnoreCase("b")) {
            a = 1;
        } else if (c.equalsIgnoreCase("c")) {
            a = 2;
        } else if (c.equalsIgnoreCase("d")) {
            a = 3;
        } else if (c.equalsIgnoreCase("e")) {
            a = 4;
        } else if (c.equalsIgnoreCase("f")) {
            a = 5;
        } else if (c.equalsIgnoreCase("g")) {
            a = 6;
        } else if (c.equalsIgnoreCase("h")) {
            a = 7;
        } else if (c.equalsIgnoreCase("i")) {
            a = 8;
        } else if (c.equalsIgnoreCase("j")) {
            a = 9;
        }
    }

    public static String numb(int c) {
        if (c == 0) {
            return "A";
        } else if (c == 1) {
            return "B";
        } else if (c == 2) {
            return "C";
        } else if (c == 3) {
            return "D";
        } else if (c == 4) {
            return "E";
        } else if (c == 5) {
            return "F";
        } else if (c == 6) {
            return "G";
        } else if (c == 7) {
            return "H";
        } else if (c == 8) {
            return "I";
        } else if (c == 9) {
            return "J";
        } else {
            return "no letter";
        }
    }
}