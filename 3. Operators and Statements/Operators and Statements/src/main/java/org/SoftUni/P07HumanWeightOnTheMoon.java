package org.SoftUni;

import java.util.Scanner;

public class P07HumanWeightOnTheMoon {
    private static final double EARTH_ACCELERATION = 9.81;

    private static double weightOnTheMoon(double weightOnEarth) {
        double m = weightOnEarth / 9.81;
        double moonAcceleration = 0.17 * EARTH_ACCELERATION;
        return m * moonAcceleration;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightOnTheEarth = Double.parseDouble(scanner.nextLine());

        double moonWeight = weightOnTheMoon(weightOnTheEarth);
        System.out.println(moonWeight);
    }
}
