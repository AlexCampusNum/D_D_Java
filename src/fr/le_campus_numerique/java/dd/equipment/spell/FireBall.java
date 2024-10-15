package fr.le_campus_numerique.java.dd.equipment.spell;

/**
 * Represents a Fireball spell in the game.
 * This class extends the Spell class to create a specific type of powerful offensive spell.
 */
public class FireBall extends Spell {

    /**
     * Constructs a new FireBall spell.
     * Initializes the spell with default values:
     * - Type: Sort
     * - Attack Level: 7
     * - Name: Boule de feu
     */
    public FireBall() {
        super("Sort", 7, "Boule de feu");
    }
}