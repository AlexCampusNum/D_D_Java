package fr.le_campus_numerique.java.dd.equipment.philter;

import fr.le_campus_numerique.java.dd.player.Player;
import fr.le_campus_numerique.java.dd.space.Space;
import fr.le_campus_numerique.java.dd.equipment.DefensiveEquipment;
import fr.le_campus_numerique.java.dd.player.*;

/**
 * Represents a philter in the game.
 * This class extends DefensiveEquipment and implements the Space interface,
 * allowing philters to be placed on the game board and interacted with.
 */
public class Philter extends DefensiveEquipment implements Space {

    /**
     * Constructs a new Philter with specified attributes.
     *
     * @param type The type of the philter
     * @param defenseLevel The defense level of the philter
     * @param name The name of the philter
     */
    public Philter(String type, int defenseLevel, String name) {
        this.setType(type);
        this.setDefenseLevel(defenseLevel);
        this.setName(name);
    }

    /**
     * Defines the interaction between a player and a philter.
     * If the player is a Wizard and the philter is stronger than their current defensive equipment,
     * the player equips the new philter.
     *
     * @param player The player interacting with the philter
     */
    @Override
    public void interact(Player player) {
        System.out.println("Vous trouvez une " + getName());
        if (player instanceof Wizard && this.getDefenseLevel() > player.getDefensiveEquipment().getDefenseLevel()) {
            player.setDefensiveEquipment(this);
            System.out.println(player.getName() + " est maintenant équipé avec un " + getName());
        } else {
            System.out.println("Ce personnage ne peut pas équiper ce philtre.");
        }
    }
}