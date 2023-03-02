import java.sql.*;
import java.util.Properties;

public class MySQLeJdbcExample {

    public static void main(String args[]) throws SQLException {
        //URL сервера базы данных MySQL
        String url = "jdbc:mysql://localhost:3306/java_schema";

        //свойства для создания подключения к базе данных MySQL
        Properties props = new Properties();
        props.setProperty("user", "root");
        props.setProperty("password", "5150");

        //создание подключения к базе данных MySQL с помощью JDBC
        Connection conn = DriverManager.getConnection(url, props);

        String sql = "SELECT * FROM users;";

        //создание объекта PreparedStatement для выполнения запроса
        PreparedStatement preStat = conn.prepareStatement(sql);

        ResultSet result = preStat.executeQuery();
        while (result.next()) {
            int id = result.getInt(1);
            String firstname = result.getString(2);
            String lastname = result.getString(3);
            String username = result.getString(4);
            String password = result.getString(5);
            System.out.printf("id" + "\t" + id + "\n" +
                    "firstname" + "\t" + firstname + "\n" +
                    "lastname" + "\t" + lastname + "\n" +
                    "username" + "\t" + username + "\n" +
                    "password" + "\t" + password + "\n");
        }
    }
}