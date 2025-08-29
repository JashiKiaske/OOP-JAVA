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
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 60 * 24;

        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}

