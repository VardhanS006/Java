//Adjacency list
/*Graph without weight */
// import java.util.*;
// public class Graph {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s ;
//             this.dest = d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>graph[]) {
//         for(int i =0; i<graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();//har array p ek empty arraylist create ho gayi null hata kk
//         }
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 2));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));
//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 2));

//     }
//     public static void main(String[] args) {
//         int v = 4; // vertex

//         ArrayList<Edge>graph[] = new ArrayList[v];
//         createGraph(graph);
//         //print neighbour of 2
//         for(int i= 0; i<graph[2].size();i++) {
//             Edge e = graph[2].get(i);
//             System.out.println(e.dest);
//         }
//     }
// }

/*Graph with weight */
// import java.util.*;
// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s ;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>graph[]) {
//         for(int i =0; i<graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();//har array p ek empty arraylist create ho gayi null hata kk
//         }
//         graph[0].add(new Edge(0, 2,2));

//         graph[1].add(new Edge(1, 2,10));
//         graph[1].add(new Edge(1, 3,0));

//         graph[2].add(new Edge(2, 0,2));
//         graph[2].add(new Edge(2, 1,10));
//         graph[2].add(new Edge(2, 3,-1));

//         graph[3].add(new Edge(3, 1,-1));
//         graph[3].add(new Edge(3, 2,0));

//     }
//     public static void main(String[] args) {
//         int v = 4; // vertex

//         ArrayList<Edge>graph[] = new ArrayList[v];
//         createGraph(graph);
//         //print neighbour of 2
//         for(int i= 0; i<graph[2].size();i++) {
//             Edge e = graph[2].get(i);
//             System.out.println(e.dest+" "+e.wt);
//         }
//     }
// }

//BFS
// import java.util.*;

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));

//         graph[3].add(new Edge(3, 5, 1));
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));
//         graph[5].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge> graph[], int V) {
//         //1.crete queue 2.visited create
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[V];
//         q.add(0);
//         while(!q.isEmpty()) {
//             int curr = q.remove();
//             if(vis[curr] == false) {
//                 System.out.println(curr+" ");
//                 vis[curr] = true;

//                 for(int i = 0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }

//     }

//     public static void main(String args[]) {
//         /*
//           1 --- 3
//         /       | \
//        0        |  5 -- 6
//         \       | /
//          2 ---- 4
//          */
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         bfs(graph, V);
//         System.out.println();
//     }
// }

//DFS
// TimeComplexity = ((V+E))
// import java.util.*;

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));

//         graph[3].add(new Edge(3, 5, 1));
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));
//         graph[5].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge> graph[], int V) {
//         //1.crete queue 2.visited create
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[V];
//         q.add(0);
//         while(!q.isEmpty()) {
//             int curr = q.remove();
//             if(vis[curr] == false) {
//                 System.out.println(curr+" ");
//                 vis[curr] = true;

//                 for(int i = 0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }

//     }
// public static void dfs(ArrayList<Edge> graph[], int curr , boolean vis[]) {
//     System.out.println(curr+" ");
//     vis[curr] = true;

//     for(int i =0; i<graph[curr].size(); i++) {
//         Edge e = graph[curr].get(i);
//         if(vis[e.dest] == false){
//         dfs(graph, e.dest, vis);
//     }
// }
// }
//     public static void main(String args[]) {
//         /*
//           1 --- 3
//         /       | \
//        0        |  5 -- 6
//         \       | /
//          2 ---- 4
//          */
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         boolean vis[] = new boolean[V];
//         createGraph(graph);
//         dfs(graph, 0, vis);
//         System.out.println();
//     }
// }

//All paths from source to target
// import java.util.*;

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));

//         graph[3].add(new Edge(3, 5, 1));
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));
//         graph[5].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge> graph[], int V) {
//         // 1.crete queue 2.visited create
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[V];
//         q.add(0);
//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             if (vis[curr] == false) {
//                 System.out.println(curr + " ");
//                 vis[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }

//     }

//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//         System.out.println(curr + " ");
//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (vis[e.dest] == false) {
//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }

//     public static void printAllPaths(ArrayList<Edge> graph[], int src, int tar, String path, boolean vis[]) {
//         if (src == tar) {
//             System.out.println(path);
//             return;
//         }
//         for (int i = 0; i < graph[src].size(); i++) {
//             Edge e = graph[src].get(i);
//             if (!vis[e.dest]) {
//                 vis[e.dest] = true;
//                 printAllPaths(graph, e.dest, tar, path + "->" + e.dest, vis);
//                 vis[e.dest] = false;
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         int src = 0;
//         int tar = 5;
//         boolean vis[] = new boolean[V];
//         vis[src] = true;
//         printAllPaths(graph, src, tar, ""+src, vis);
//         }
//     }

//Detect cycle in directed graph
// import java.util.*;

// public class Graph {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     // graph1 - true
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 0));
//         graph[2].add(new Edge(2, 3));
//         graph[3].add(new Edge(3, 0));
//     }
//     // graph2 - false
//     // static void createGraph(ArrayList<Edge> graph[]) {
//     // for(int i=0; i<graph.length; i++) {
//     // graph[i] = new ArrayList<>();
//     // }
//     // graph[0].add(new Edge(0, 1));
//     // graph[0].add(new Edge(0, 2));

//     // graph[1].add(new Edge(1, 3));
//     // graph[2].add(new Edge(2, 3));
//     // }
//     public static boolean isCyclicUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
//         vis[curr] = true;
//         stack[curr] = true;
//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (stack[e.dest]) { // cycle exists
//                 return true;
//             } else if (!vis[e.dest] && isCyclicUtil(graph, e.dest, vis, stack)) {
//                 return true;
//             }
//         }
//         stack[curr] = false;
//         return false;
//     }

//     // O(V + E)
//     public static boolean isCyclic(ArrayList<Edge>[] graph) {
//         boolean vis[] = new boolean[graph.length];
//         for (int i = 0; i < graph.length; i++) {
//             if (vis[i] == false) {
//                 boolean cycle = isCyclicUtil(graph, i, vis, new boolean[vis.length]);
//                 if (cycle) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         int V = 4;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         System.out.println(isCyclic(graph));
//     }
// }

//Undirected graph cycle detection
import java.util.*;

public class Graph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case1
            if (vis[e.dest] && e.dest != par) {
                return true;
            } 
            else if (!vis[e.dest]) {
                // case 3
                if (isCyclicUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        /*
         * 0 ------- 3
         * / | |
         * / | |
         * 1 | 4
         * \ |
         * \ |
         * 2
         */
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCyclicUtil(graph, new boolean[V], 0, -1));
    }
}