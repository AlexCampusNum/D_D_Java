package fr.le_campus_numerique.java.dd.enemy;

/**
 * Represents a Dragon enemy in the game.
 * This class extends the Enemy class to create a specific type of powerful enemy with predefined attributes.
 */
public class Dragon extends Enemy {

    /**
     * Constructs a new Dragon.
     * Initializes the dragon with default values:
     * - Name: Dragon
     * - Attack Strength: 4
     * - Health Points: 26
     */
    public Dragon() {
        super("Dragon", 4, 26);
    }
}