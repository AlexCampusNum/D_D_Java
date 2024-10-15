package fr.le_campus_numerique.java.dd.player;

import fr.le_campus_numerique.java.dd.equipment.spell.*;
import fr.le_campus_numerique.java.dd.equipment.philter.*;

/**
 * Represents a Wizard character in the game.
 * This class extends the Player class to create a specific type of player with magical abilities.
 */
public class Wizard extends Player {

    /**
     * Constructs a new Wizard with the specified name.
     * Initializes the wizard with default attributes and equipment:
     * - Type: "Magicien"
     * - Health Points: 6
     * - Offensive Equipment: Lightning Bolt
     * - Defensive Equipment: Defense Philtre
     * - Attack Strength: Player's attack strength (15) + offensive equipment's attack level
     *
     * @param name The name of the wizard
     */
    public Wizard(String name) {
        super(name, "Magicien");
        this.setHealthPoint(6);
        this.setOffensiveEquipment(new LightningBolt());
        this.setDefensiveEquipment(new Philter("Philtre", 4, "Philtre de défense"));
        this.setAttackStrength(15 + getOffensiveEquipment().getAttackLevel());
    }
}