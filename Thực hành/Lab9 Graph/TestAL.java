import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;

/**
 * TestAM
 */
public class TestAL {

    public static AdjacencyList readAMfromFile(String filePath) {
        AdjacencyList graph;
        try {
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            int vertices = sc.nextInt();
            graph = new AdjacencyList(vertices);
            sc.nextLine(); // error nextInt() not read '\n'
            for (int i = 0; i < vertices; i++) {
                String[] neighbors = sc.nextLine().split(" ");
                // System.out.println(Arrays.toString(neighbors));
                int u = Integer.parseInt(neighbors[0]);
                for (String neighbor : neighbors) {
                    int v = Integer.parseInt(neighbor);
                    if (u == v)
                        continue;
                    graph.addEdge(u, v);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new FileSystemNotFoundException("File not found");
        }
        return graph;
    }

    // public static int getVertices(AdjacencyMatrix matrix) {
    // return matrix.
    // }

    public static void main(String[] args) {
        String filePath = "ALformat.txt";
        AdjacencyList matrix = readAMfromFile(filePath);

        // ex1a
        matrix.printGraph();

        // ex1b
        int countOfVertices = matrix.getVertices();
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
        int v = 3;
        boolean isHas = matrix.getEgde(u, v);
        if (isHas) {

            System.out.println(String.format("has edge %d - %d", u, v));
        } else {

            System.out.println(String.format("hasn't edge %d - %d", u, v));
        }
    }
}