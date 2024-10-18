package fr.le_campus_numerique.java.dd;

import fr.le_campus_numerique.java.dd.game.Game;
import fr.le_campus_numerique.java.dd.database.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * The main for the Dungeons and Dragons game application.
 */
public class Main {
    /**
     * The main method that starts the game.
     *
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();

        Game game = new Game();
        game.startGame();

        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connexion à la base de données fermée.");
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
            }
        }

//        GameStatus status = GameStatus.HERO_DEAD;

    }
}