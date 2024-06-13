import java.util.*;

public class AdjacencyList {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    public AdjacencyList(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<Integer>();
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            System.out.print("head");
            for (Integer v : adj[i]) {
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }

    public int getVertices() {
        return adj.length;
    }

    public int getEdges() {
        // because adj is array so we dot length
        // and adj[i] is linkedlist so we dot size()
        int edges = 0;
        for (int i = 0; i < adj.length; ++i) {
            edges += adj[i].size();
        }
        return (edges - adj.length) / 2;
    }

    public int[] getNeighborsOfVertex(int u) {
        int[] neighbors = new int[adj[u].size()];
        for (int i = 0; i < adj[u].size(); ++i) {
            neighbors[i] = adj[u].get(i);
        }
        return neighbors;
    }

    public boolean getEgde(int u, int v2) {
        for (int i = 0; i < adj[u].size(); i++) {
            if (adj[u].get(i) == v2) {
                return true;
            }
        }
        return false;
    }
}
