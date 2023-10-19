package Directory;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class DirectoryTraversingBFS {
    public static void main(String[] args) {
        traverseBFS("D:\\Programming\\SoftUni\\");
    }
    private static void traverseBFS(String startingPath) {
        Queue<File> visitedDirsQueue = new LinkedList<>();
        visitedDirsQueue.add(new File(startingPath));

        while (!visitedDirsQueue.isEmpty()) {
            File currentFile = visitedDirsQueue.remove();
            System.out.println(currentFile.getAbsolutePath());

            File[] currentFileChildren = currentFile.listFiles();
            if (currentFileChildren != null) {
                for (File currentFileChild : currentFileChildren) {
                    if (currentFileChild.isDirectory()) {
                        visitedDirsQueue.add(currentFileChild);
                    }
                }
            }
        }
    }
}
