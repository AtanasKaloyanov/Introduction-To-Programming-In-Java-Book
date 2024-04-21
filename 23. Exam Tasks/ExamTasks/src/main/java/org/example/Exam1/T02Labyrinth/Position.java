package org.example.T02Labyrinth;

public class Position {
    private int row;
    private int column;
    private int distance;

    public Position(int row, int column, int distance) {
        this.row = row;
        this.column = column;
        this.distance = distance;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "row: " + this.row + "\ncolumn: " + this.column + "\ndistance: " + distance;
    }
}
