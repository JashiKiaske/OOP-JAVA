/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinalaguilar;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Create warrior without weapon, expect attack error
        Warrior warrior = new Warrior(1000, "Sasuke", 1500);
        System.out.println(warrior);
        try {
            warrior.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Assign weapon and attack
        Weapon Susano = new Weapon(1000, 2, "Susano");
        warrior.setWeapon(Susano);
        warrior.attack();
        warrior.defend();
        System.out.println();

        // Create Mage without weapon
        Mage mage = new Mage(1000, "Naruto", 1000);
        System.out.println(mage);

        try {
            mage.attack();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Assign weapon and attack
        Weapon SageArtBigMassiveRassenShureken = new Weapon(1000, 5, "Sage Art BigMassive Rassen Shureken");
        mage.setWeapon(SageArtBigMassiveRassenShureken);
        mage.attack();
        mage.defend();
        mage.defend(); // second defend to show mana depletion effect

        System.out.println(mage);
    }
}
