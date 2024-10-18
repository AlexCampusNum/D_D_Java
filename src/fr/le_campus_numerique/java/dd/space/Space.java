package fr.le_campus_numerique.java.dd.space;

import fr.le_campus_numerique.java.dd.game.GameStatus;
import fr.le_campus_numerique.java.dd.player.Player;

/**
 * Represents a space in the board of the game that a player can interact with.
 * This interface defines the contract for all types of spaces in the game.
 */
public interface Space {

    /**
     * Defines the interaction between a player and this space.
     * This method is called when a player enters or interacts with the space.
     *
     * @param player The player interacting with the space
     */
    GameStatus interact(Player player);
}