package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
   
public class BatchData {
    public static void main(String[] args) {
   
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
   
        try (
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=UTF-8",
                "root", "");
            Statement s = c.createStatement();             
        )
        {
             
            for (int i = 0; i < 100; i++) {
                String sql = "insert into hero values(null," + "'гЂал"+i+"'"  + "," + 313.0f + "," + 50 + ")";
                s.execute(sql);
            }
             
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}