
import java.sql.Connection;
import java.sql.Statement;


public class PromoteStudent {

    public static void main(String[] args) throws Exception  {

        //we wish to send each student in next semester
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate("UPDATE student SET SEM=SEM+1");
        System.out.println(n+" rows updated....");
        con.close();
    }
}
