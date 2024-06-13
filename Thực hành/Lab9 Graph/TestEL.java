import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestEL {
    public static EdgeList readAMfromFile(String filePath) throws FileNotFoundException {
        EdgeList graph = new EdgeList();
        File f = new File(filePath);
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            int weight = sc.nextInt();
            int source = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(weight, source, dest);
        }

        sc.close();
        return graph;
    }

    public static void main(String[] args) throws FileNotFoundException {
        EdgeList matrix = readAMfromFile("ELformat.txt");

        // ex1a
        matrix.printGraph();

        int countOfVertices = matrix.getVertices();
        // ex1b
        System.out.println("Count the number of vertices " + countOfVertices);

        // ex1c
        int countOfEdges = matrix.getEdges();
        System.out.println("Count the number of edges " + countOfEdges);

        // ex1d
        int u = 1;
        int[] neighbors = matrix.getNeighborsOfVertex(u);
        System.out.print("neighbors: " + u);
        for (int i = 0; i < neighbors.length; i++) {
            System.out.print("->" + neighbors[i]);
        }
        System.out.println("");

        // ex1e
        u = 1;
        int v = 4;
        int weight = matrix.getEgde(u, v);
        if (weight != 0) {
            System.out.println(String.format("has edge %d - %d", u, v));
        } else {
            System.out.println(String.format("hasn't edge %d - %d", u, v));
        }
    }
}
