import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads {
    Connection connection;


    public Connection connection(Config config) throws SQLException{
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        return connection;
    }

    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = this.connection.createStatement();
            String queryString = "SELECT * from ads";
            ResultSet results = statement.executeQuery(queryString);
            if (results != null) {
                System.out.println("Executed successfully!");
                while (results.next()) {
                    Ad nextAd = new Ad(
                            results.getLong("id"),
                            results.getLong("user_id"),
                            results.getString("title"),
                            results.getString("description")
                    );
                    ads.add(nextAd);
                }
            } else {
                System.out.println("System exploderd!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long id = -1L;
        try {
        Statement statement = this.connection.createStatement();
        String queryString = "INSERT INTO ads(user_id, title, description)" + "VALUES (1, '"+ad.getTitle()+"', '"+ad.getDescription()+"');";
        statement.executeUpdate(queryString, statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        while (rs.next()) {
            id = rs.getLong(1);
            System.out.println("inserted a new record! new id is: " + id);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return id;
    }
}
