
import java.sql.Connection;
import java.sql.DriverManager;


public class Utility {
    
    //we are writing a method connect to load the driver and establish the connection
    public static Connection connect() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data530", "root", "root");
        return con;
    }
}
