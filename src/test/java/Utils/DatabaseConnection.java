package Utils;

import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://102.222.124.22:3306/ndosian6b8b7_ndosiautomation";
        String username = "ndosian6b8b7_admin";
        String password = "Aod~J2EGkNY,-C[0";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from users\n" +
                     "where id =3")) {

            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username") +
                        ", Password: " + rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
