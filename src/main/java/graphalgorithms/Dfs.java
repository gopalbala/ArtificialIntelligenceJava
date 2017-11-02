package graphalgorithms;

import java.util.Stack;

/**
 * Created by fax6 on 02/11/17.
 */
public class Dfs {

    public void dfs(Vertex vertex) {
        Stack<Vertex> vertexStack = new Stack<>();
        vertexStack.push(vertex);
        if (vertex != null) {
            vertex.setVisited(true);
        }

        //System.out.println(vertex);
        while (!vertexStack.isEmpty()) {
            Vertex vertex1 = vertexStack.pop();
            System.out.println(vertex1);
            for (Vertex neighbor : vertex1.getNeighbors()) {
                if (!neighbor.isVisited()) {
                    neighbor.setVisited(true);
                    vertexStack.push(neighbor);
                }
            }
        }
    }

    public void dfsRecursive(Vertex vertex) {
        System.out.println(vertex);
        for (Vertex neighbor : vertex.getNeighbors()) {
            if (!neighbor.isVisited()) {
                neighbor.setVisited(true);
                dfsRecursive(neighbor);
            }
        }
    }
}
