package fr.le_campus_numerique.java.dd.enemy;

import fr.le_campus_numerique.java.dd.space.Space;
import fr.le_campus_numerique.java.dd.fight.Fighter;
import fr.le_campus_numerique.java.dd.player.Player;

/**
 * Represents an enemy in the game.
 * This class implements both Space and Fighter interfaces, allowing enemies to be placed on the game board and engage in combat.
 */
public class Enemy implements Space, Fighter {
    private String name;
    private int attackStrength;
    private int healthPoint;

    /**
     * Constructs a new Enemy with specified attributes.
     *
     * @param name The name of the enemy
     * @param attackStrength The attack strength of the enemy
     * @param healthPoint The health points of the enemy
     */
    public Enemy(String name, int attackStrength, int healthPoint) {
        this.name = name;
        this.attackStrength = attackStrength;
        this.healthPoint = healthPoint;
    }

    /**
     * Defines the interaction between a player and an enemy.
     * Initiates a fight between the player and the enemy.
     *
     * @param player The player interacting with the enemy
     */
    @Override
    public void interact(Player player) {
        System.out.println("Vous vous retrouvez face à un " + this.name);
        System.out.println("Ce " + this.name + " a un niveau de vie de " + this.healthPoint);
        System.out.println("Votre niveau de vie est de " + player.getHealthPoint());
        System.out.println("Le combat commence contre ce " + this.name);

        fight(player);
    }

    /**
     * Simulates a fight between the enemy and the player.
     * The fight continues until either the enemy or the player is defeated.
     *
     * @param player The player fighting the enemy
     */
    private void fight(Player player) {
        if (this.isAlive() && player.isAlive()) {
            System.out.println(player.getName() + " attaque !");
            this.absorbAttack(player.getAttackStrength());

            if (this.isAlive()) {
                System.out.println(this.name + " contre-attaque !");
                player.absorbAttack(this.attackStrength);

                fight(player);
            }
        }
    }

    /**
     * Reduces the enemy's health points based on the damage received.
     *
     * @param damage The amount of damage to be absorbed
     */
    @Override
    public void absorbAttack(int damage) {
        this.healthPoint -= damage;
        if (this.healthPoint > 0) {
            System.out.println(this.name + " encaisse, son niveau de vie est à : " + this.healthPoint);
        } else {
            System.out.println(this.name + " est terrassé !");
        }
    }

    /**
     * Checks if the enemy is still alive.
     *
     * @return true if the enemy's health points are greater than 0, false otherwise
     */
    @Override
    public boolean isAlive() {
        return this.healthPoint > 0;
    }

    // Getters and setters...

    /**
     * Returns a string representation of the enemy.
     *
     * @return A string containing the name, attack strength, and health points of the enemy
     */
    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", attackStrength=" + attackStrength +
                ", healthPoint=" + healthPoint +
                '}';
    }
}