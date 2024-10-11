package fr.le_campus_numerique.java.dd.game;

import fr.le_campus_numerique.java.dd.ennemi.*;
import fr.le_campus_numerique.java.dd.equipement.sort.*;
import fr.le_campus_numerique.java.dd.equipement.arme.*;
import fr.le_campus_numerique.java.dd.personnage.Personnage;
import fr.le_campus_numerique.java.dd.potion.*;
import fr.le_campus_numerique.java.dd.potion.dossier.Case;
import fr.le_campus_numerique.java.dd.potion.dossier.CaseVide;

import java.util.Random;
import java.util.ArrayList;

public class Game {
    ArrayList<Case> BOARD = new ArrayList();
    private final int BOARD_SIZE = 5;
    private Personnage player;
    private int currentPosition;
    private Random dice;

    public Game(Personnage player) {
        this.player = player;
        this.currentPosition = 0;
        this.dice = new Random();
        this.BOARD = this.creerPlateau(BOARD_SIZE);
    }


    public ArrayList<Case> creerPlateau(int size){
        ArrayList<Case> plateau = new ArrayList<Case>();

        for(int i = 0; i < size; i++){
            plateau.add(new CaseVide());
        }

        int[] dragons = {44, 51, 55, 61};
        int[] sorciers = {9, 19, 2, 31, 34, 35, 36, 39, 43, 46};
        int[] gobelins = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};
        int[] massues = {1, 10, 4, 21, 37};
        int[] epees = {18, 25, 41, 52};
        int[] eclairs = {0, 3, 7, 16, 22};
        int[] bouleFeux = {47, 48};
        int[] potionStandards = {6, 12, 30, 32, 38, 42};
        int[] grandePotions = {27, 40};

        for(int dragon : dragons){
            plateau.set(dragon, new Dragon());
        }
        for(int sorcier : sorciers){
            plateau.set(sorcier, new Sorcier());
        }
        for(int gobelin : gobelins){
            plateau.set(gobelin, new Gobelin());
        }
        for(int massue : massues){
            plateau.set(massue, new Massue());
        }
        for(int epee : epees){
            plateau.set(epee, new Epee());
        }
        for(int eclair : eclairs){
            plateau.set(eclair, new Eclair());
        }
        for(int bouleFeu : bouleFeux){
            plateau.set(bouleFeu, new BouleDeFeu());
        }
        for(int potionStandard : potionStandards){
            plateau.set(potionStandard, new PotionStandard());
        }
        for(int grandePotion : grandePotions){
            plateau.set(grandePotion, new GrandePotion());
        }

        return plateau;
    }

    public boolean playTurn(int roll) throws PersonnageHorsPlateauException {
        movePlayer(roll);
        return currentPosition >= (BOARD_SIZE -1);
    }

    public int rollDice() {
        return dice.nextInt(1) + 1;
    }

    private void movePlayer(int roll) throws PersonnageHorsPlateauException {
        int newPosition = currentPosition + roll;

        if (newPosition >= BOARD_SIZE) {
            throw new PersonnageHorsPlateauException("Erreur : Le joueur est sorti du plateau !");
        }

        currentPosition = newPosition;
        Case currentCase = BOARD.get(currentPosition);
        currentCase.interagir(player);
    }

    public void resetGame() {
        currentPosition = 0;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public Personnage getPlayer() {
        return player;
    }

    public int getBoardSize() {
        return BOARD_SIZE;
    }
}