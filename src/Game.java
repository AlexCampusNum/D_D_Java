import Personnage.Personnage;
import java.util.Random;

public class Game {
    private static final int BOARD_SIZE = 64;
    private Personnage player;
    private int currentPosition;
    private Random dice;

    public Game(Personnage player) {
        this.player = player;
        this.currentPosition = 1;
        this.dice = new Random();
    }

    public boolean playTurn(int roll) {
        movePlayer(roll);
        return currentPosition >= BOARD_SIZE;
    }

    public int rollDice() {
        return dice.nextInt(6) + 1;
    }

    private void movePlayer(int roll) {
        currentPosition = Math.min(currentPosition + roll, BOARD_SIZE);
    }

    public void resetGame() {
        currentPosition = 1;
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