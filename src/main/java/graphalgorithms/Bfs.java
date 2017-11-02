package graphalgorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by gbalasubramanian on 02/11/17.
 */
public class Bfs {
    public void bfs(Vertex root) {
        Queue<Vertex> vertexQueue = new LinkedList<>();
        if (root != null) {
            root.setVisited(true);
        }
        vertexQueue.add(root);
        while (!vertexQueue.isEmpty()) {
            Vertex vertex = vertexQueue.remove();
            System.out.println(vertex);
            for (Vertex neighbor : vertex.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    neighbor.setVisited(true);
                    vertexQueue.add(neighbor);
                }
            }
        }
    }
}
