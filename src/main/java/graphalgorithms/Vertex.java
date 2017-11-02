package graphalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fax6 on 02/11/17.
 */
public class Vertex {
    public Vertex(int data){
        this.data = data;
        neighbors = new ArrayList<>();
    }
    private int data;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    private boolean visited;
    List<Vertex> neighbors;

    public void addNeighbor(Vertex vertex){
        neighbors.add(vertex);
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
