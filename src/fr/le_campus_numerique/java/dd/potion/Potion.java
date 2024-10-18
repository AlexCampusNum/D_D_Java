package fr.le_campus_numerique.java.dd.potion;

import fr.le_campus_numerique.java.dd.game.GameStatus;
import fr.le_campus_numerique.java.dd.space.Space;
import fr.le_campus_numerique.java.dd.player.Player;
import java.util.Scanner;

/**
 * Represents a potion in the game.
 * This class implements the Space interface, allowing potions to be interacted with on the game board.
 */
public class Potion implements Space {

    private String type;
    private String name;
    private int value;
    private final Scanner scanner;

    /**
     * Constructs a new Potion with specified attributes.
     *
     * @param type The type of the potion
     * @param name The name of the potion
     * @param value The healing value of the potion
     */
    public Potion(String type, String name, int value) {
        this.type = type;
        this.name = name;
        this.value = value;
        scanner = new Scanner(System.in);
    }

    /**
     * Defines the interaction between a player and a potion.
     * Allows the player to choose between using the potion immediately or storing it.
     *
     * @param player The player interacting with the potion
     */
    public GameStatus interact(Player player){
        System.out.println("Vous trouvez une " + this.name);
        System.out.println("Voulez vous utiliser cette " + this.name + " ou la stocker ?");
        System.out.println("1. Utiliser");
        System.out.println("2. Stocker");
        int choix;
        while (true) {
            try {
                choix = Integer.parseInt(scanner.nextLine());
                if (choix == 1 || choix == 2) break;
                System.out.println("Veuillez entrer un choix valide (1 ou 2) :");
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre (1 ou 2) :");
            }
        }

        if (choix == 1) {
            player.setHealthPoint(player.getHealthPoint() + this.value);
            System.out.println("Votre niveau de vie augmente à : " + player.getHealthPoint());

            return GameStatus.HERO_HEALS;
        } else if (choix == 2) {
            player.setStock(this);

            return GameStatus.POTION_STOCKED;
        }

        return null;
    }

    /**
     * Gets the type of the potion.
     *
     * @return The type of the potion
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the potion.
     *
     * @param type The new type of the potion
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the name of the potion.
     *
     * @return The name of the potion
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the potion.
     *
     * @param name The new name of the potion
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the healing value of the potion.
     *
     * @return The healing value of the potion
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the healing value of the potion.
     *
     * @param value The new healing value of the potion
     */
    public void setValue(int value) {
        this.value = value;
    }
}