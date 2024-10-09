import Case.Case;
import Case.CaseVide;
import Equipement.Arme;
import Equipement.Sort;
import Personnage.Personnage;
import java.util.Random;
import java.util.ArrayList;

public class Game {
    ArrayList<Case> BOARD = new ArrayList();
    private final int BOARD_SIZE = 64;
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
        plateau.set(1, new Ennemi("Gnome", 2, 6));
        plateau.set(2, new Arme("Arme", 5, "Épée"));
        plateau.set(3, new Potion("Vie", "Potion de vie", 5));
        plateau.set(4, new Sort("Sort", 7, "Boule de feu"));

        return plateau;
    }

    public boolean playTurn(int roll) {
        movePlayer(roll);
        return currentPosition >= (BOARD_SIZE -1);
    }

    public int rollDice() {
        return dice.nextInt(1) + 1;
    }

    private void movePlayer(int roll) {
        currentPosition = Math.min((currentPosition) + roll, BOARD_SIZE);
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