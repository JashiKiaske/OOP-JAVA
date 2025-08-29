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
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new
         Scanner(System.in);       
        System.out.println("Enter first number: ");
          int firstnum =  sc.nextInt();
        System.out.println("Enter second number:");
          int secondnum =  sc.nextInt();
        System.out.println("Enter Third number: ");  
           int thirdnum =  sc.nextInt();
           
           
           
          int sum = firstnum + secondnum;
          System.out.println(firstnum + " + " + secondnum + " = " + sum);
          int diff = firstnum - secondnum;
          System.out.println(firstnum + " - " + secondnum + " = " + diff);
          int quot = firstnum * secondnum;
          System.out.println(firstnum + " * " + secondnum + " = " + quot);
          int product = firstnum / secondnum;
          System.out.println(firstnum + " / " + secondnum + " = " + product); 
          int mod = firstnum % secondnum;
          System.out.println(firstnum + " % " + secondnum + " = " + mod); 
    }
    
}
