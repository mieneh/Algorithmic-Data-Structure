import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

public class EdgeList {
    private Vector<IntegerTriple> edges;

    public EdgeList() {
        edges = new Vector<IntegerTriple>();
    }

    public void addEdge(int w, int u, int v) {
        edges.add(new IntegerTriple(w, u, v));
    }

    public void printGraph() {
        for (int i = 0; i < edges.size(); i++) {
            System.out.println(edges.get(i));
        }
    }

    public int getEdges() {
        return edges.size();
    }

    public Vector<Integer> neighbors(int u) {
        Vector<Integer> x = new Vector<>();
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource() == u) {
                x.add(edges.get(i).getDest());
            }
            if (edges.get(i).getDest() == u) {
                x.add(edges.get(i).getSource());
            }
        }
        return x;
    }

    public Boolean check(int u, int v) {
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource() == u && edges.get(i).getDest() == v) {
                return true;
            }
            if (edges.get(i).getSource() == v && edges.get(i).getDest() == u) {
                return true;
            }
        }
        return false;
    }

    public int[] getNeighborsOfVertex(int u) {
        LinkedList<Integer> store = new LinkedList<>();
        for (int index = 0; index < edges.size(); ++index) {
            IntegerTriple line = edges.get(index);
            int sourceVertex = line.getSource();
            int destVertex = line.getDest();

            if (sourceVertex == u) {
                store.add(destVertex);
            }
            if (destVertex == u) {
                store.add(sourceVertex);
            }
        }
        int[] neighbors = new int[store.size()];
        for (int i = 0; i < store.size(); ++i) {
            neighbors[i] = store.get(i);
        }
        return neighbors;
    }

    public int getEgde(int u, int v) {
        for (int index = 0; index < edges.size(); ++index) {
            IntegerTriple line = edges.get(index);
            int sourceVertex = line.getSource();
            int destVertex = line.getDest();
            int weight = line.getWeight();

            if (sourceVertex == u && destVertex == v) {
                return weight;
            }
            if (sourceVertex == v && destVertex == u) {
                return weight;
            }
        }
        return 0;
    }

    public int getVertices() {
        Set<Integer> vertexs = new HashSet<>();
        for (int index = 0; index < edges.size(); ++index) {
            IntegerTriple line = edges.get(index);
            int sourceVertex = line.getSource();
            int destVertex = line.getDest();
            vertexs.add(sourceVertex);
            vertexs.add(destVertex);
        }
        return vertexs.size();
    }
}
