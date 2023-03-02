import java.sql.*;
import java.util.Properties;
public class GetReq {
    public static ResultSet getReq(String sql) throws SQLException {
        //URL сервера базы данных MySQL
        String url = "jdbc:mysql://localhost:3306/seminar2home_java";

        //свойства для создания подключения к базе данных MySQL
        Properties props = new Properties();
        props.setProperty("user", "root");
        props.setProperty("password", "5150");

        //создание подключения к базе данных MySQL с помощью JDBC
        Connection conn = DriverManager.getConnection(url, props);

        //создание объекта PreparedStatement для выполнения запроса
        PreparedStatement preStat = conn.prepareStatement(sql);

        ResultSet result = preStat.executeQuery();
        return result;
    }
}
