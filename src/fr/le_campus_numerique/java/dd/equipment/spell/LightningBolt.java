package fr.le_campus_numerique.java.dd.equipment.spell;

/**
 * Represents a Lightning Bolt spell in the game.
 * This class extends the Spell class to create a specific type of offensive spell.
 */
public class LightningBolt extends Spell {

    /**
     * Constructs a new LightningBolt spell.
     * Initializes the spell with default values:
     * - Type: Sort
     * - Attack Level: 2
     * - Name: Éclair
     */
    public LightningBolt() {
        super("Sort", 2, "Éclair");
    }
}