package fr.le_campus_numerique.java.dd;

import fr.le_campus_numerique.java.dd.game.Game;
import fr.le_campus_numerique.java.dd.game.Menu;
import fr.le_campus_numerique.java.dd.personnage.Personnage;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Game game = new Game(menu.showMenu());
        game.startGame();
    }
}