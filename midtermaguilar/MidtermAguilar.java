/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermaguilar;

/**
 *
 * @author User
 */
public class MidtermAguilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Vehicle[] vehicles = new Vehicle[3];
        
        vehicles[0] = new Vehicle("Toyota", "Camry", 2020, "Red");
        vehicles[1] = new Vehicle("Honda", "Civic", 2019, "blue");
        vehicles[2] = new Vehicle("Ford", "Mustang", 2021, "Black");
        
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
      }
}

