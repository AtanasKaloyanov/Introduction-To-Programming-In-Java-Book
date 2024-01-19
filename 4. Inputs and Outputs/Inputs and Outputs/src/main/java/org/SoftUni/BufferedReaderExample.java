package org.SoftUni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String firstName = bf.readLine();
        String lastName = bf.readLine();

        System.out.printf("My name is %s %s.", firstName, lastName);
    }
}
