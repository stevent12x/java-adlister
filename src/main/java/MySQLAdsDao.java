import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;


public class MySQLAdsDao implements Ads {
    Connection connection;

    public MySQLAdsDao(Config config){

    }

    public MySQLAdsDao() {

    }


    private Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );

        return connection;
    }
    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * from ads";
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(selectQuery);
        while (results.next()) {
            System.out.println("Here is an ad " + results.getString("title"));
        }
        return null;
    }
    @Override
    public Long insert(Ad ad) throws SQLException {
        String selectQuery = "INSERT into ads (title, description) VALUES ('an old, old hat', 'worn by my grandfather')";
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(selectQuery);
        while (results.next()) {
            System.out.println("Added: " + results.getString("title") + " -- " + results.getString("description"));
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        Config config = new Config();
        MySQLAdsDao adsDao = new MySQLAdsDao(config);
        System.out.println(adsDao);
    }
}