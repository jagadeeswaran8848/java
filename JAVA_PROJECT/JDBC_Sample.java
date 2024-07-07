import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Sample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/task2";
        String user = "root";
        String password = "8848";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String insertQuery = "INSERT INTO sample VALUES ('7','s7'),('8','s8')";
            int rowsAffected = statement.executeUpdate(insertQuery);

            System.out.println("Inserted " + rowsAffected + " row(s) into the table.");

            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        }
    }
}
