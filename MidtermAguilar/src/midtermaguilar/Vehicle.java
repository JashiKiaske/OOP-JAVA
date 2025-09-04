/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermaguilar;

/**
 *
 * @author User
 */
public class Vehicle {
    public String make;
    public String model;
    public int year;
    public String color;
            
    public Vehicle(String make, String model, int year, String color ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color + '\'' +
                '}';
    }
}
