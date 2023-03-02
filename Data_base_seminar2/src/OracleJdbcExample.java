import java.sql.*;
import java.util.Properties;

/**
 * Простая Java-программа для подключения базы данных Oracle с помощью Oracle JDBC thin driver
 * Перед запуском этой программы убедитесь, что в вашем пути к классу есть Oracle JDBC thin driver
 * @author */

public class OracleJdbcExample {

    public static void main(String args[]) throws SQLException {
        //URL сервера базы данных Oracle
        String url = "jdbc:oracle:thin:@localhost:1632:DEVROOT32";

        //свойства для создания подключения к базе данных Oracle
        Properties props = new Properties();
        props.setProperty("user", "scott");
        props.setProperty("password", "tiger");

        //создание подключения к базе данных Oracle с помощью JDBC
        Connection conn = DriverManager.getConnection(url,props);

        String sql ="select sysdate as current_day from dual";

        //создание объекта PreparedStatement для выполнения запроса
        PreparedStatement preStatement = conn.prepareStatement(sql);

        ResultSet result = preStatement.executeQuery();

        while(result.next()){
            System.out.println("Текущая дата из Oracle: " +         result.getString("выбранный день"));
        }
        System.out.println("готово");
    }
}