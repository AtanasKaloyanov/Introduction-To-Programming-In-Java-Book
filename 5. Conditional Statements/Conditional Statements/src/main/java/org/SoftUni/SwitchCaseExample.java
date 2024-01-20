package org.SoftUni;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 5:
            case 7:
                System.out.println("5 or 7");
                break;

            case 10:
            case 12:
                System.out.println("10 or 12");
                break;

            default:
                System.out.println("Another number");
        }


    }
}
