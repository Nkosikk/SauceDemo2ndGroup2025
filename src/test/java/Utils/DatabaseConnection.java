package Utils;

import org.testng.annotations.Test;

import java.sql.*;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://102.222.124.22:3306/ndosian6b8b7_ndosiautomation";
    private static final String DB_USER = "ndosian6b8b7_admin";
    private static final String DB_PASS = "Aod~J2EGkNY,-C[0";

    public static class User {
        private final String username;
        private final String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() { return username; }
        public String getPassword() { return password; }
    }

    public static User getUserById(int id) {
        String query = "SELECT username, password FROM users WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, DB_USER, DB_PASS);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(rs.getString("username"), rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        User user = getUserById(3);
        if (user != null) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
        } else {
            System.out.println("User not found.");
        }
    }

}
