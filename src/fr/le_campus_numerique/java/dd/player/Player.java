package fr.le_campus_numerique.java.dd.player;

import fr.le_campus_numerique.java.dd.equipment.DefensiveEquipment;
import fr.le_campus_numerique.java.dd.equipment.OffensiveEquipment;
import fr.le_campus_numerique.java.dd.fight.Fighter;
import fr.le_campus_numerique.java.dd.potion.Potion;

/**
 * Represents an abstract player in the game.
 * This class implements the Fighter interface and provides basic attributes and methods for all players.
 */
public abstract class Player implements Fighter {

    // ANSI escape code for blue text
    public static final String ANSI_BLUE = "\u001B[34m";

    // ANSI escape code to reset text formatting (used to reset color)
    public static final String ANSI_RESET = "\u001B[0m";

    private String name;
    private String type;
    private int healthPoint;
    private int attackStrength;
    private int stockIndex;
    private Potion[] stock;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;

    /**
     * Creates a new player with the specified name and type.
     *
     * @param name The name of the player
     * @param type The type of the player
     */
    public Player(String name, String type){
        this.name = name;
        this.type = type;
        this.stock = new Potion[1];
        this.stockIndex = 0;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player
     */
    public String getName(){
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The new name of the player
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Gets the type of the player.
     *
     * @return The type of the player
     */
    public String getType(){
        return type;
    }

    /**
     * Sets the type of the player.
     *
     * @param type The new type of the player
     */
    public void setType(String type){
        this.type = type;
    }

    /**
     * Gets the health points of the player.
     *
     * @return The health points of the player
     */
    public int getHealthPoint() {
        return healthPoint;
    }

    /**
     * Sets the health points of the player.
     *
     * @param healthPoint The new health points of the player
     */
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    /**
     * Gets the attack strength of the player.
     *
     * @return The attack strength of the player
     */
    public int getAttackStrength() {
        return attackStrength;
    }

    /**
     * Sets the attack strength of the player.
     *
     * @param attackStrength The new attack strength of the player
     */
    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    /**
     * Gets the potion stock of the player.
     *
     * @return The potion stock of the player
     */
    public Potion[] getStock() {
        return stock;
    }

    /**
     * Adds a potion to the player's stock.
     *
     * @param potion The potion to add to the stock
     */
    public void setStock(Potion potion) {
        if (stockIndex < stock.length) {
            stock[stockIndex] = potion;
            stockIndex++;
            System.out.println("La " + potion.getName() + " a été ajoutée au stock.");
        } else {
            System.out.println("Le stock est plein, impossible de stocker cette potion.");
        }
    }

    /**
     * Gets the current stock index.
     *
     * @return The current stock index
     */
    public int getStockIndex() {
        return stockIndex;
    }

    /**
     * Sets the stock index.
     *
     * @param stockIndex The new stock index
     */
    public void setStockIndex(int stockIndex) {
        this.stockIndex = stockIndex;
    }

    /**
     * Gets the offensive equipment of the player.
     *
     * @return The offensive equipment of the player
     */
    public OffensiveEquipment getOffensiveEquipment(){
        return offensiveEquipment;
    }

    /**
     * Sets the offensive equipment of the player.
     *
     * @param offensiveEquipment The new offensive equipment of the player
     */
    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    /**
     * Gets the defensive equipment of the player.
     *
     * @return The defensive equipment of the player
     */
    public DefensiveEquipment getDefensiveEquipment(){
        return defensiveEquipment;
    }

    /**
     * Sets the defensive equipment of the player.
     *
     * @param defensiveEquipment The new defensive equipment of the player
     */
    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    /**
     * Uses a potion from the player's stock.
     *
     * @param index The index of the potion to use
     */
    public void useStockPotion(int index) {
        if (index >= 0 && index < stockIndex) {
            Potion potion = stock[index];
            setHealthPoint(getHealthPoint() + potion.getValue());
            System.out.println("Vous avez utilisé une potion : " + potion.getName());
            removePotionFromStock(index);
        } else {
            System.out.println("Potion invalide.");
        }
    }

    /**
     * Removes a potion from the player's stock.
     *
     * @param index The index of the potion to remove
     */
    private void removePotionFromStock(int index) {
        for (int i = index; i < stockIndex - 1; i++) {
            stock[i] = stock[i + 1];
        }
        stock[stockIndex - 1] = null;
        stockIndex--;
    }

    /**
     * Absorbs an attack and updates the player's health points.
     *
     * @param damage The amount of damage to absorb
     */
    public void absorbAttack(int damage) {
        this.healthPoint -= damage;
        if (this.healthPoint > 0) {
            System.out.println(this.name + ", vous encaissez, votre niveau de vie est à : " + this.healthPoint);
        } else {
            System.out.println("Vous êtes mort " + this.name);
            System.out.println("Fin de partie !");
            System.exit(0);
        }
    }

    /**
     * Checks if the player is alive.
     *
     * @return true if the player is alive, false otherwise
     */
    public boolean isAlive() {
        return this.healthPoint > 0;
    }

    /**
     * Returns a string representation of the player.
     *
     * @return A string representation of the player
     */
    @Override
    public String toString() {
        return ANSI_BLUE + "Ton personnage :" + "\n" +
                ANSI_RESET +
                "Nom : " + name + "\n" +
                "Type : " + type + "\n" +
                "Niveau de vie : " + healthPoint + "\n" +
                "Force d'attaque : " + attackStrength + "\n" +
                ANSI_BLUE +
                "Equipement Offensif : " + "\n" +
                ANSI_RESET
                + offensiveEquipment + "\n" +
                ANSI_BLUE +
                "Equipement Défensif : " + "\n" +
                ANSI_RESET
                + defensiveEquipment;
    }
}