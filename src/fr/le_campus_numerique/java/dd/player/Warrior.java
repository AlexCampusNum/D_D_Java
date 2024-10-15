package fr.le_campus_numerique.java.dd.player;

import fr.le_campus_numerique.java.dd.equipment.weapon.*;
import fr.le_campus_numerique.java.dd.equipment.shield.*;

/**
 * Represents a Warrior character in the game.
 * This class extends the Player class to create a specific type of player with combat-focused abilities.
 */
public class Warrior extends Player {

    /**
     * Constructs a new Warrior with the specified name.
     * Initializes the warrior with default attributes and equipment:
     * - Type: "Guerrier"
     * - Health Points: 10
     * - Offensive Equipment: SledgeHammer
     * - Defensive Equipment: Shield ("L'Égide")
     * - Attack Strength: Player's attack strength (10) + offensive equipment's attack level
     *
     * @param nom The name of the warrior
     */
    public Warrior(String nom) {
        super(nom, "Guerrier");
        this.setHealthPoint(10);
        this.setOffensiveEquipment(new SledgeHammer());
        this.setDefensiveEquipment(new Shield("Bouclier", 2, "L'Égide"));
        this.setAttackStrength(10 + getOffensiveEquipment().getAttackLevel());
    }
}