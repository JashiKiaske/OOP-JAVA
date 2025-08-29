/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();

        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        double totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        double speedInMetersPerSecond = distance / totalTimeInSeconds;
        double speedInKmPerHour = speedInMetersPerSecond * 3.6;
        double speedInMilesPerHour = speedInMetersPerSecond * 2.23694;

        System.out.printf("Your speed in meters/second is %.8f%n", speedInMetersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", speedInKmPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", speedInMilesPerHour);
        
        scanner.close();
    }
}

