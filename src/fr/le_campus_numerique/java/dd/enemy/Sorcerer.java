package fr.le_campus_numerique.java.dd.enemy;

/**
 * Represents a Sorcerer enemy in the game.
 * This class extends the Enemy class to create a specific type of enemy with predefined attributes.
 */
public class Sorcerer extends Enemy {

    /**
     * Constructs a new Sorcerer.
     * Initializes the sorcerer with default values:
     * - Name: Sorcier
     * - Attack Strength: 2
     * - Health Points: 20
     */
    public Sorcerer() {
        super("Sorcier", 2, 20);
    }
}