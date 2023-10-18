package Directory;

import java.io.File;

public class DirectoryTraverseDFS {

    public static void main(String[] args) {
        dfsTraversing("D:\\Programming\\SoftUni");
    }

    private static void dfsTraversing(String directoryPath) {
        dfsTraversing(new File(directoryPath), " ");
    }

    private static void dfsTraversing(File directory, String spaces) {
// if (current element is a directory, we get all its
// subdirectories and files
        if (directory.isDirectory()) {
            System.out.println(spaces + directory.getAbsolutePath());
            String[] subDirectories = directory.list();

// for each child go and visit its subtree
                for (String subDirectory : subDirectories) {
                    dfsTraversing(new File(directory, subDirectory), spaces + " ");
                }
            }
        }
    }

