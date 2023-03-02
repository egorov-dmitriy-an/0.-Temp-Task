import java.sql.*;
public class Program {

    public static void main(String args[]) throws SQLException {

        String request_sql;
        Request req = new Request();

        /* // Создадим таблицу sales
        request_sql = req.creatTableSales;
        System.out.println(request_sql);
        PostReq.postReq(request_sql);

        // Заполним таблицу sales
        request_sql = req.insertTableSales;
        System.out.println(request_sql);
        PostReq.postReq(request_sql);*/

        // Выведем запрос
        request_sql = req.range;
        ResultSet result = GetReq.getReq(request_sql);
        PrintResult.printTableSales(result);
    }
}