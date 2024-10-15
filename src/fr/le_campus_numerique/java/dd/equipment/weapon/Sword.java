package fr.le_campus_numerique.java.dd.equipment.weapon;

/**
 * Represents a Sword in the game.
 * This class extends the Weapon class to create a specific type of weapon.
 */
public class Sword extends Weapon {

    /**
     * Constructs a new Sword.
     * Initializes the sword with default values:
     * - Type: Arme
     * - Attack Level: 5
     * - Name: Épée
     */
    public Sword() {
        super("Arme", 5, "Épée");
    }
}