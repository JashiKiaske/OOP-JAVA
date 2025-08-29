/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in); //to accept user input
          System.out.println("Input first number:");
          int firstnum =  sc.nextInt();
        System.out.println("Input second number:");
          int secondnum =  sc.nextInt();
          int product = firstnum * secondnum;
          System.out.println(firstnum + " * " + secondnum + " = " + product);
    }
}