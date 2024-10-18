package fr.le_campus_numerique.java.dd.equipment.shield;

import fr.le_campus_numerique.java.dd.game.GameStatus;
import fr.le_campus_numerique.java.dd.player.Player;
import fr.le_campus_numerique.java.dd.space.Space;
import fr.le_campus_numerique.java.dd.equipment.DefensiveEquipment;
import fr.le_campus_numerique.java.dd.player.*;

/**
 * Represents a shield in the game.
 * This class extends DefensiveEquipment and implements the Space interface,
 * allowing shields to be placed on the game board and interacted with.
 */
public class Shield extends DefensiveEquipment implements Space {

    /**
     * Constructs a new Shield with specified attributes.
     *
     * @param type The type of the shield
     * @param defenseLevel The defense level of the shield
     * @param nom The name of the shield
     */
    public Shield(String type, int defenseLevel, String nom) {
        this.setType(type);
        this.setDefenseLevel(defenseLevel);
        this.setName(nom);
    }

    /**
     * Defines the interaction between a player and a shield.
     * If the player is a Warrior and the shield is stronger than their current shield,
     * the player equips the new shield.
     *
     * @param player The player interacting with the shield
     */
    @Override
    public GameStatus interact(Player player) {
        System.out.println("Vous trouvez une " + getName());
        if (player instanceof Warrior && this.getDefenseLevel() > player.getDefensiveEquipment().getDefenseLevel()) {
            player.setDefensiveEquipment(this);
            System.out.println(player.getName() + " est maintenant équipé avec un " + getName());

            return GameStatus.SHIELD_ACTIVED;
        } else {
            System.out.println("Ce personnage ne peut pas équiper ce bouclier.");

            return GameStatus.NOTHING_CHANGED;
        }
    }
}