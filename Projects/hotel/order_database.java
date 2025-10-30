

package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


class MySQLConnect {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/hotel_managment";
        String user = "root";
        String password = "teramu@12";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}

public class order_database {
    public static void insertOrder(String orderId, String name, String foodName, int price, int quantity, int total, java.sql.Date orderDate) {
        String sql = "INSERT INTO Orders (Order_id, Name, Food_name, Price, Quantity, Total, Order_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = MySQLConnect.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, orderId);
            pstmt.setString(2, name);
            pstmt.setString(3, foodName);
            pstmt.setInt(4, price);
            pstmt.setInt(5, quantity);
            pstmt.setInt(6, total);
            pstmt.setDate(7, orderDate);

            pstmt.executeUpdate();
            System.out.println("Order Saved Successfully!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

