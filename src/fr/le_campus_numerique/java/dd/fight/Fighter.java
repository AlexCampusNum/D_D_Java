package fr.le_campus_numerique.java.dd.fight;

/**
 * Represents a fighter in the game.
 * This interface defines the basic methods that all fighters (players and enemies) should implement.
 */
public interface Fighter {

    /**
     * Applies damage to the fighter.
     * This method should be called when the fighter is attacked and needs to absorb damage.
     *
     * @param degats The amount of damage to be absorbed
     */
    void absorbAttack(int degats);

    /**
     * Checks if the fighter is still alive.
     *
     * @return true if the fighter is alive, false otherwise
     */
    boolean isAlive();
}