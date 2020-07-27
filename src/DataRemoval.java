
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DataRemoval {

    public static void main(String[] args) throws Exception {
        //using this code we wish to remove some data from DB
        
        //step-1 (Driver Loading)
        Class.forName("com.mysql.jdbc.Driver");
        //step-2 (Connection Establishment)
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data530", "root", "root");
        //step-3 (Statement Object Creation)
        Statement stmt=con.createStatement();
        //step-4 (Calling executeUpdate to send SQL)
        int n=stmt.executeUpdate("DELETE FROM student WHERE rno<100");
        //step-5 (Closing Connection)
        con.close();
        System.out.println(n+" row(s) removed");
    }
}
