import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLJDBCTest {
    private static Connection connect() throws SQLException {
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
//            String queryString = "SELECT * from albums";
//////            ResultSet results = statement.executeQuery(queryString);
//////            if (results != null) {
//////                System.out.println("Statement executed!");
//////                while (results.next()) {
//////                    System.out.println("id: "+results.getInt("id") + " -- " + results.getString("artist") + " - - - " + results.getString("name"));
//////                }
//////                System.out.println("This is the end of the results");
            String queryString = "DELETE FROM albums WHERE  id =11";
            Boolean tOrF = statement.execute(queryString);
            if (tOrF.booleanValue() == true) {
                System.out.println("Album deleted!");
            } else if (tOrF.booleanValue() != true) {
                System.out.println("Nonexistent album!");
            };
            String test = "SELECT * FROM albums";
            ResultSet results = statement.executeQuery(test);
            if (results != null) {
                System.out.println("Stement Cuted!");
                    while (results.next()) {
                        System.out.println("id: " + results.getInt("id") + " -- " +results.getString("artist")  + " - - - " + results.getString("name"));
                    }
                }
            System.out.println("this is the end");
            } catch (SQLException e) {
                e.printStackTrace();
        }
    }
}
