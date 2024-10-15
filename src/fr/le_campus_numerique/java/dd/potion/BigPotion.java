package fr.le_campus_numerique.java.dd.potion;

/**
 * Represents a big potion in the game.
 * This class extends the Potion class to create a more powerful healing item.
 */
public class BigPotion extends Potion {

    /**
     * Constructs a new BigPotion.
     * Initializes the potion with default values for a big potion:
     * - Type: "Potion"
     * - Name: "Grande potion"
     * - Healing value: 5
     */
    public BigPotion() {
        super("Potion", "Grande potion", 5);
    }
}