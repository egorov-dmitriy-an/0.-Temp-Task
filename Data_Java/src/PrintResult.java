import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintResult {
    public static void printTableSales(ResultSet result) throws SQLException {
        while (result.next()) {
            int id = result.getInt(1);
            String order_date = result.getString(2);
            String count_product = result.getString(3);
            System.out.printf("id" + "\t" + id + "\n" +
                    "order_date" + "\t" + order_date + "\n" +
                    "count_product" + "\t" + count_product + "\n" + "\n");
        }
    }
}
