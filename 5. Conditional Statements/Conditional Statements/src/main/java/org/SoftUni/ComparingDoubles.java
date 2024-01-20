package org.SoftUni;

public class ComparingDoubles {
    public static void main(String[] args) {
       double one = 1.0;
       double sum = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 +
               0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(one == sum);
        System.out.println(Math.abs(one - sum) < 0.000001);
    }
}