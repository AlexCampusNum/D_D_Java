package fr.le_campus_numerique.java.dd.space;

import fr.le_campus_numerique.java.dd.game.GameStatus;
import fr.le_campus_numerique.java.dd.player.Player;

/**
 * Represents an empty space in the game.
 * This class implements the Space interface for an empty space that a player can encounter.
 */
public class EmptySpace implements Space {

    /**
     * Defines the interaction between a player and an empty space.
     * When a player interacts with an empty space, a warning message is displayed.
     *
     * @param player The player interacting with the empty space
     */
    public GameStatus interact(Player player) {
        System.out.println("Case vide, mais restez sur vos gardes");

        return GameStatus.EMPTY_SPACE;
    }
}