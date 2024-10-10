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
        plateau.set(1, new Gobelin());
        plateau.set(2, new Epee());
        plateau.set(3, new PotionStandard());
        plateau.set(4, new BouleDeFeu());

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