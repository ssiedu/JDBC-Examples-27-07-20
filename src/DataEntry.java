import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DataEntry {

    public static void main(String[] args) {
        try {
            //step-1    (Driver Loading)
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            //step-2    (Connection Establishment)
            String url="jdbc:mysql://localhost:3306/data530";
            String userid="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,userid,password);
            System.out.println("Connected Successfully");
            //step-3 (create the Statement object to dispatch SQL to DB)
            Statement stmt=con.createStatement();
            //step-4 (send SQL to DB)
            //String sql="INSERT INTO STUDENT VALUES(3,'CCC','Civil',5)";
            //int n=stmt.executeUpdate(sql);
            stmt.executeUpdate("INSERT INTO student VALUES(111,'AAA','CS',1)");
            stmt.executeUpdate("INSERT INTO student VALUES(112,'BBB','CS',2)");
            stmt.executeUpdate("INSERT INTO student VALUES(113,'CCC','IT',2)");
            stmt.executeUpdate("INSERT INTO student VALUES(114,'DDD','IT',1)");
            stmt.executeUpdate("INSERT INTO student VALUES(115,'EEE','MECH',3)");
            System.out.println("rows added");
            //step-5 (close the DB connection)
            con.close();
            
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
