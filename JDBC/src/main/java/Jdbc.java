import org.apache.ibatis.io.ResolverUtil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

        InputStream inputStream = Jdbc.class.getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        Class.forName(properties.getProperty("db.driver"));
        Connection connection = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.user"), properties.getProperty("db.password"));
        Statement statement = connection.createStatement();
        String sql = "select * from users where id=1";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println("id=" + resultSet.getObject("id"));
            System.out.println("NAME=" + resultSet.getObject("NAME"));
            System.out.println("password=" + resultSet.getObject("password"));
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
