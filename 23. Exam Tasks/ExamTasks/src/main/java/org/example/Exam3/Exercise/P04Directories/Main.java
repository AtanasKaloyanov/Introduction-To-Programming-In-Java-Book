package org.example.Exam3.Exercise.P04Directories;

import java.io.File;

public class Main {
    private final static String directoryPath = "D:\\Programming\\SoftUni\\1. Programming Basics with Java";

    public static void main(String[] args) {
        File file = new File(directoryPath);

        dfs(file, " ");
    }

    private static void dfs(File file, String space) {
        if (file.isDirectory()) {
            System.out.println(space + file.getName());
            for (File f : file.listFiles()) {
                dfs(f, space + " ");
            }
        }
    }


}
