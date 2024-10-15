package fr.le_campus_numerique.java.dd.potion;

/**
 * Represents a standard potion in the game.
 * This class extends the Potion class to create a basic healing item.
 */
public class StandardPotion extends Potion {

    /**
     * Constructs a new StandardPotion.
     * Initializes the potion with default values for a standard potion.
     */
    public StandardPotion() {
        super("Potion", "Potion standard", 2);
    }
}