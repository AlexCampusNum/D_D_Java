package fr.le_campus_numerique.java.dd.equipment.weapon;

/**
 * Represents a SledgeHammer in the game.
 * This class extends the Weapon class to create a specific type of weapon.
 */
public class SledgeHammer extends Weapon {

    /**
     * Constructs a new SledgeHammer.
     * Initializes the sledgehammer with default values:
     * - Type: Arme
     * - Attack Level: 3
     * - Name: Massue
     */
    public SledgeHammer() {
        super("Arme", 3, "Massue");
    }
}