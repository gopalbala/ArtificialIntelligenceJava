package graphalgorithms;

import java.util.Stack;

/**
 * Created by gbalasubramanian on 02/11/17.
 */
public class IterativeDeepeningDfs {
    int currentDepth;
    boolean isTargetFound;

    public void iddfs(Vertex root, Vertex targetVertx) {
        int depth = 0;
        while (!isTargetFound) {
            System.out.println();
            dfs(root, targetVertx, depth);
            depth++;
        }
    }

    private void dfs(Vertex root, Vertex nodeToSearch, int depthLevel) {
        Stack<Vertex> vertexStack = new Stack<>();
        vertexStack.add(root);
        while (!vertexStack.isEmpty()) {
            Vertex currentNode = vertexStack.pop();
            System.out.print(currentNode + " ");
            if (currentNode.getData() == nodeToSearch.getData()) {
                System.out.println(nodeToSearch);
                isTargetFound = true;
                return;
            }
            if (currentNode.getDepth() >= depthLevel) {
                continue;
            }
            for (Vertex n : currentNode.getNeighbors()) {
                n.setDepth(currentNode.getDepth() + 1);
                vertexStack.push(n);
            }
        }
    }

}
