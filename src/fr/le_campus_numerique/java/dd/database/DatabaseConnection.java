package fr.le_campus_numerique.java.dd.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import fr.le_campus_numerique.java.dd.player.Player;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/D&D";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion établie à la base de données MySQL !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données : ");
            e.printStackTrace();
        }
        return connection;
    }

    public static void savePlayer(Player player) {
        String sql = "INSERT INTO player (type, name, health_point, attack_strength) VALUES (?, ?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, player.getType());
            statement.setString(2, player.getName());
            statement.setInt(3, player.getHealthPoint());
            statement.setInt(4, player.getAttackStrength());

            statement.executeUpdate();
            System.out.println("Joueur enregistré avec succès.");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'enregistrement du joueur : " + e.getMessage());
        }
    }

    public static Player getPlayerByName(String name) {
        String query = "SELECT type, health_point, attack_strength FROM player WHERE name = name";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String type = rs.getString("type");
                int healthPoint = rs.getInt("health_point");
                int attackStrength = rs.getInt("attack_strength");

                Player player = null;
                player.setHealthPoint(healthPoint);
                player.setAttackStrength(attackStrength);

                return player;
            } else {
                System.out.println("Aucun joueur trouvé avec le nom : " + name);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération du joueur : " + e.getMessage());
        }

        return null;
    }
}
