package fr.le_campus_numerique.java.dd.equipment.weapon;

import fr.le_campus_numerique.java.dd.game.GameStatus;
import fr.le_campus_numerique.java.dd.player.Player;
import fr.le_campus_numerique.java.dd.space.Space;
import fr.le_campus_numerique.java.dd.equipment.OffensiveEquipment;
import fr.le_campus_numerique.java.dd.player.*;

/**
 * Represents a weapon in the game.
 * This class extends OffensiveEquipment and implements the Space interface,
 * allowing weapons to be placed on the game board and interacted with.
 */
public class Weapon extends OffensiveEquipment {

    /**
     * Constructs a new Weapon with specified attributes.
     *
     * @param type The type of the weapon
     * @param attackLevel The attack level of the weapon
     * @param name The name of the weapon
     */
    public Weapon(String type, int attackLevel, String name) {
        this.setType(type);
        this.setAttackLevel(attackLevel);
        this.setName(name);
    }

    /**
     * Defines the interaction between a player and a weapon.
     * If the player is a Warrior and the weapon is stronger than their current weapon,
     * the player equips the new weapon.
     *
     * @param player The player interacting with the weapon
     */
    @Override
    public GameStatus interact(Player player) {
        System.out.println("Vous trouvez une " + getName());
        if (player instanceof Warrior && this.getAttackLevel() > player.getOffensiveEquipment().getAttackLevel()) {
            player.setOffensiveEquipment(this);
            System.out.println(player.getName() + " est maintenant équipé avec une " + getName());

            return GameStatus.WEAPON_ACTIVED;
        } else {
            System.out.println("Ce personnage ne peut pas s'équiper de cette " + getName());

            return GameStatus.NOTHING_CHANGED;
        }
    }
}