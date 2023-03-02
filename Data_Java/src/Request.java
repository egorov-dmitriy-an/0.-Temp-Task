public class Request {
    public String creatTableSales = "CREATE TABLE IF NOT EXISTS sales " +
            "(id INT PRIMARY KEY AUTO_INCREMENT," +
            " order_date DATE, count_product INT NOT NULL);";
    public String insertTableSales = "INSERT sales (order_date, count_product) " +
            "VALUES " +
            "(2022-01-01, 156), " +
            "(2022-01-02, 180), " +
            "(2022-01-03, 21), " +
            "(2022-01-04, 124), " +
            "(2022-01-05, 341);";

    public String selectAll = "SELECT * FROM sales;";

    public String range = "SELECT id, order_date,\n" +
            "CASE\n" +
            "\tWHEN count_product < 100 THEN \"Маленький заказ\"\n" +
            "    WHEN count_product > 100 AND count_product < 300 THEN \"Средний заказ\"\n" +
            "    ELSE \"Большой заказ\"\n" +
            "END AS \"Тип заказа\"\n" +
            "FROM sales;";





}
