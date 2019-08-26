import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLJDBCTest {
    public static Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );
        return connection;
    }

    public static void main(String[] args) {
        try {
            Connection connection = connect();
            System.out.println("Good Jorb!");
            Statement statement = connection.createStatement();
            String queryString = "SELECT * FROM quotes;";
            statement.execute(queryString);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
