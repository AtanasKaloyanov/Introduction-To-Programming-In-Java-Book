package org.example;
import java.util.Scanner;

public class P05ProtocolServerResource {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split("://");
        String serverAndResource = array[1];
        int splitterIndex = serverAndResource.indexOf("/");

        String protocol = array[0];
        String server = serverAndResource.substring(0, splitterIndex);
        String resource = serverAndResource.substring(splitterIndex);
        System.out.println(protocol);
        System.out.println(server);
        System.out.println(resource);
    }
}
