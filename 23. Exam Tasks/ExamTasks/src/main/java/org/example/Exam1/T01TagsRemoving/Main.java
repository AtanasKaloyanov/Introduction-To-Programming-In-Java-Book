package org.example.T01TagsRemoving;

import java.io.*;

public class Main {
    private static final String INPUT_NAME_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\T01TagsRemoving\\Problem1.html";
    private static final String OUTPUT_NAME_PATH = "D:\\Programming\\Projects\\Introduction to Programming With Java - Book\\23. Exam Tasks\\ExamTasks\\src\\main\\java\\org\\example\\T01TagsRemoving\\Result.txt";
    private static final String CHARSET = "utf-8";

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(INPUT_NAME_PATH);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, CHARSET);
        PrintWriter printWriter = new PrintWriter(OUTPUT_NAME_PATH, CHARSET);

        try {
            int currentChar = inputStreamReader.read();
            StringBuilder sb = new StringBuilder();
            boolean inTag = false;
            while (currentChar != -1) {
                char curentCharAsChar = (char) currentChar;
                if (curentCharAsChar == '<') {
                    printing(sb, printWriter);
                    sb.setLength(0);
                    inTag = true;
                } else if (curentCharAsChar == '>') {
                    inTag = false;
                } else {
                    if (!inTag) {
                        sb.append(curentCharAsChar);
                    }
                }

                currentChar = inputStreamReader.read();
            }
        } finally {
            fileInputStream.close();
            inputStreamReader.close();
            printWriter.close();
        }

    }

    private static void printing(StringBuilder sb, PrintWriter printWriter) {
        String text = sb.toString();
        text = text.trim();
        text = text.replaceAll("\n\\s++", "\n");

        if (text.length() != 0) {
            printWriter.println(text);
        }

    }

}

 /*
        Input 1:

        <html>
        <head><title>Welcome to our site!</title></head>
        <body>
        <center>
         <img src="/en/img/logo.gif" width="130" height="70" alt="Logo">
         <br><br><br>
         <font size="-1"><a href="/index.html">Home</a>
         <a href="/contacts.html">Contacts</a>
         <a href="/about.html">About</a></font><p>
         </center>
         </body>
         </html>

         Output 1:

         Welcome to our site!
         Home
         Contacts
         About

        Input 2:

        <html><body>
        Click<a href="info.html">on this
        link</a>for more info.<br />
        This is<b>bold</b>text.
        </body></html>

        Output 2:

        Click
        on this
        link
        for more info.
        This is
        bold
        text.
         */