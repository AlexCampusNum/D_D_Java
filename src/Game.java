import Personnage.Personnage;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final int BOARD_SIZE = 64;
    private Personnage player;
    private int currentPosition;
    private Random dice;
    private Scanner scanner;

    public Game(Personnage player) {
        this.player = player;
        this.currentPosition = 1;
        this.dice = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bienvenue dans le jeu, " + player.getNom() + " !");
        System.out.println("Vous commencez sur la case 1.");

        while (currentPosition < BOARD_SIZE) {
            System.out.println("\nAppuyez sur Entrée pour lancer le dé...");
            scanner.nextLine();

            int roll = rollDice();
            movePlayer(roll);

            System.out.println("Vous avez lancé un " + roll);
            System.out.println("Vous êtes maintenant sur la case " + currentPosition + " / " + BOARD_SIZE);
        }

        System.out.println("\nFélicitations ! Vous avez atteint la fin du plateau !");
        askToPlayAgain();
    }

    private int rollDice() {
        return dice.nextInt(6) + 1;
    }

    private void movePlayer(int spaces) {
        currentPosition = Math.min(currentPosition + spaces, BOARD_SIZE);
    }

    private void askToPlayAgain() {
        System.out.println("Voulez-vous jouer à nouveau ? (oui/non)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("oui")) {
            currentPosition = 1;
            start();
        } else {
            System.out.println("Merci d'avoir joué ! Au revoir.");
            System.exit(0);
        }
    }

}
