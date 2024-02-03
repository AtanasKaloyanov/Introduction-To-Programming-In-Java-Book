package org.example;

import java.util.Scanner;

public class P03UpcaseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(toUpperCase(text));
    }

    private static String toUpperCase(String text) {
        String beginPattern = "<upcase>";
        int begin = text.indexOf(beginPattern);

        while (begin != -1) {
            String endPattern = "</upcase>";
            int end = text.indexOf(endPattern, begin + 1);
            int realBegin = begin + 8;
            String oldString = text.substring(realBegin, end);
            text = text.replace(oldString, oldString.toUpperCase());
            begin = text.indexOf(beginPattern, begin + 1);
        }

        text = text.replaceAll("<upcase>", "");
        text = text.replaceAll("</upcase>", "");
        return text;
    }
}
