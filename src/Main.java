import Personnage.Personnage;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Personnage player = menu.showMenu();
        if (player != null) {
            Game game = new Game(player);
            game.start();
        }
    }
}