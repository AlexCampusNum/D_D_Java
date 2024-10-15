package fr.le_campus_numerique.java.dd.game;

/**
 * Represents an exception that is thrown when a player is off the game board.
 * This custom exception extends Throwable to handle specific game-related errors.
 */
public class OffSetPlayerException extends Throwable {

    /**
     * Constructs a new OffSetPlayerException with the specified detail message.
     *
     * @param message The detail message (which is saved for later retrieval by the getMessage() method)
     */
    public OffSetPlayerException(String message) {
        super(message);
    }
}