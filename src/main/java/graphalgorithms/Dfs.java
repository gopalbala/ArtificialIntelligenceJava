package graphalgorithms;

import java.util.Stack;

/**
 * Created by fax6 on 02/11/17.
 */
public class Dfs {
    public void dfs(Vertex vertex) {
        Stack<Vertex> vertexStack = new Stack<>();
        if (vertex != null) {
            vertex.setVisited(true);
        }
        vertexStack.push(vertex);
        System.out.println(vertex);
        while (!vertexStack.isEmpty()) {
            Vertex vertex1 = vertexStack.pop();
            for (Vertex neighbor : vertex1.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    System.out.println(neighbor);
                    vertexStack.push(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }
}
