/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinalaguilar;

/**
 *
 * @author User
 */
public abstract class Character {
    // Properties
    private String name;
    private int level;
    private int health;
    private Weapon weapon;

    // Constructor
    public Character(String name, int level, int health, Weapon weapon) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.weapon = weapon;
    }

    // Getters and Setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // toString method for representing the character's state
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", weapon=" + weapon +
                '}';
    }

    // Abstract methods to be implemented by subclasses
    public abstract void attack();
    public abstract void defend();
}
