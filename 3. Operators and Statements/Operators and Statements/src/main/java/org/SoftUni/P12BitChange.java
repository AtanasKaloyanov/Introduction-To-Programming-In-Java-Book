package org.SoftUni;

import java.util.Scanner;

public class P12BitChange {
    public static int setBit(int n, int v, int p) {
        int template = 1 << p;
        return v == 0 ? (~template) & n : template | n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int v = Integer.parseInt(scanner.nextLine());

        System.out.println(setBit(n, p, v));
    }

    /*
      Indexes - 543210
       n = 35 - 100011
       v = 0
       p = 5 => n - 000011 , n = 3

      Indexes - 543210
       n = 35 - 100011
       v = 1
       p = 2 => n - 100111 , n = 39

     */
}
