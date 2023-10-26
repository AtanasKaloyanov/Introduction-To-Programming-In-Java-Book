package Graph;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private int[][] vertices;

    public Graph(int[][] vertices) {
        this.vertices = vertices;
    }

    public void addEdge(int i, int j) {
        this.vertices[i][j] = 1;
    }

    public void removeEdge(int i, int j) {
        this.vertices[i][j] = 0;
    }

    public boolean hasEdge(int i, int j) {
        return this.vertices[i][j] == 1;
    }

    public List<Integer> successorsByIndex(int i) {
        List<Integer> successors = new LinkedList<>();
        for (int j = 0; j < this.vertices[i].length; j++) {
            if (vertices[i][j] == 1) {
                successors.add(j);
            }
        }

        return successors;
    }

}
