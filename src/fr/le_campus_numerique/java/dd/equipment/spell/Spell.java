package fr.le_campus_numerique.java.dd.equipment.spell;

import fr.le_campus_numerique.java.dd.game.GameStatus;
import fr.le_campus_numerique.java.dd.player.Player;
import fr.le_campus_numerique.java.dd.space.Space;
import fr.le_campus_numerique.java.dd.equipment.OffensiveEquipment;
import fr.le_campus_numerique.java.dd.player.*;

/**
 * Represents a spell in the game.
 * This class extends OffensiveEquipment and implements the Space interface,
 * allowing spells to be placed on the game board and interacted with.
 */
public class Spell extends OffensiveEquipment {

    /**
     * Constructs a new Spell with specified attributes.
     *
     * @param type The type of the spell
     * @param attackLevel The attack level of the spell
     * @param name The name of the spell
     */
    public Spell(String type, int attackLevel, String name) {
        this.setType(type);
        this.setAttackLevel(attackLevel);
        this.setName(name);
    }

    /**
     * Defines the interaction between a player and a spell.
     * If the player is a Wizard and the spell is stronger than their current spell,
     * the player equips the new spell.
     *
     * @param player The player interacting with the spell
     */
    @Override
    public GameStatus interact(Player player) {
        System.out.println("Vous trouvez un sort " + getName());
        if (player instanceof Wizard && this.getAttackLevel() > player.getOffensiveEquipment().getAttackLevel()) {
            player.setOffensiveEquipment(this);
            System.out.println(player.getName() + " est maintenant équipé avec le sort " + getName());

            return GameStatus.SPELL_ACTIVED;
        } else {
            System.out.println("Ce personnage ne peut pas s'équiper de ce sort " + getName());

            return GameStatus.NOTHING_CHANGED;
        }
    }
}