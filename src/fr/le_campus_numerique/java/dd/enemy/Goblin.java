package fr.le_campus_numerique.java.dd.enemy;

/**
 * Represents a Goblin enemy in the game.
 * This class extends the Enemy class to create a specific type of enemy with predefined attributes.
 */
public class Goblin extends Enemy {

    /**
     * Constructs a new Goblin.
     * Initializes the goblin with default values:
     * - Name: Gobelin
     * - Attack Strength: 1
     * - Health Points: 15
     */
    public Goblin() {
        super("Gobelin", 1, 15);
    }
}