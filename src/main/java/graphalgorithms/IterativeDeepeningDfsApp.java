package graphalgorithms;

/**
 * Created by fax6 on 04/11/17.
 */
public class IterativeDeepeningDfsApp {
    public static void main(String[] args) {

        Vertex vertex0 = new Vertex(1);
        Vertex vertex1 = new Vertex(2);
        Vertex vertex2 = new Vertex(3);
        Vertex vertex3 = new Vertex(4);
        Vertex vertex4 = new Vertex(5);

        vertex0.addNeighbor(vertex1);
        vertex0.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex3);
        vertex3.addNeighbor(vertex4);

        IterativeDeepeningDfs algorithm = new IterativeDeepeningDfs();
        algorithm.iddfs(vertex0, vertex4);
    }
}
