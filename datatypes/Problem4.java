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
public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input weight in pounds: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Input height in inches: ");
        double height = scanner.nextDouble();
        
        double bmi = (weight / (height * height)) * 703;
        
        System.out.println("Body Mass Index is " + bmi);
        
        scanner.close();
    }
}

