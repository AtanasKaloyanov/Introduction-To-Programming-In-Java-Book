package org.example.Tasks.P02GSM;

import java.util.ArrayList;
import java.util.List;

public class Display {
    private int width;
    private List<Colours> colours = new ArrayList<>();

    public Display(int width) {
        this.width = width;
    }
    public Display(int width, List<Colours> colours) {
        this(width);
        this.colours = colours;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<Colours> getColours() {
        return colours;
    }

    public void setColours(List<Colours> colours) {
        this.colours = colours;
    }
}
