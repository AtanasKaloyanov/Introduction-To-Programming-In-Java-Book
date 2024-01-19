package org.SoftUni;

import java.io.IOException;

public class Exo {
    public static void main(String[] args) throws IOException {
       int ch;
      while ((ch = System.in.read()) != '\n') {
          System.out.println((char) ch);
      }
    }
}