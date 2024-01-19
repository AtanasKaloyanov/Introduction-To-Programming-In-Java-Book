package org.SoftUni;

import java.util.Scanner;

public class P03CompanyData {
    private static String information(String address,
                                     String number, String fax, String site, String manager) {
        return String.format("Data info: %s, %s, %s, %s, %s.", address, number, fax, site, manager);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        String number = scanner.nextLine();
        String fax = scanner.nextLine();
        String site = scanner.nextLine();
        String manager = scanner.nextLine();

        System.out.println(information(address, number, fax, site, manager));
    }
}
