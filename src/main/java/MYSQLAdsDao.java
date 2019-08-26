import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class MYSQLAdsDao implements Ads {

    private Connection connect() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = (Connection) DriverManager.getConnection(
        Config.getUrl(),
        Config.getUser(),
        Config.getPassword()
        );
        return connection;
    }

    Statement stmnt =
}
