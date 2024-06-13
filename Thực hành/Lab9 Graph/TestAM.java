import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;

/**
 * TestAM
 */
public class TestAM {

    public static AdjacencyMatrix readAMfromFile(String filePath) {
        AdjacencyMatrix graph;
        try {
            File f = new File(filePath);
            Scanner sc = new Scanner(f);
            int vertices = sc.nextInt();
            graph = new AdjacencyMatrix(vertices);
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    int weight = sc.nextInt();
                    graph.setEgde(i, j, weight);
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
        String filePath = "AMformat.txt";
        AdjacencyMatrix matrix = readAMfromFile(filePath);

        // ex1a
        matrix.printGraph();

        // // ex1b
        // int countOfVertices = matrix.getVertices();
        // System.out.println("Count the number of vertices " + countOfVertices);

        // // ex1c
        // int countOfEdges = matrix.getEdges();
        // System.out.println("Count the number of edges " + countOfEdges);

        // // ex1d
        // int u = 1;
        // int[] neighbors = matrix.neighborsOfVertex(u);
        // System.out.print("neighbors: " + u);
        // for (int i = 0; i < neighbors.length; i++) {
        // System.out.print("->" + neighbors[i]);
        // }
        // System.out.println("");

        // // ex1e
        // u = 1;
        // int v = 4;
        // int weight = matrix.getEgde(u, v);
        // if (weight != 0) {

        // System.out.println(String.format("has edge %d - %d", u, v));
        // } else {

        // System.out.println(String.format("hasn't edge %d - %d", u, v));
        // }

        // ex4
        // ex4a
        int s = 3;
        System.out.print("BFS: ");
        matrix.BFS(s);
        System.out.println("");

        // ex4b
        System.out.print("DFS: ");
        matrix.DFS(s);
        System.out.println("");

        // ex4c
        System.out.print("DFS2: ");
        matrix.DFS2(s);
        System.out.println("");

        // ex4d
        int u = 1;
        int v = 9;
        System.out.println(matrix.IsReachable(u, v) ? "True" : "False");

        // ex5
        AdjacencyList matrix2 = matrix.convertToAL();
        matrix2.printGraph();
    }
}