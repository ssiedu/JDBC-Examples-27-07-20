
import java.sql.Connection;
import java.sql.Statement;


public class DDLExample {

    public static void main(String[] args) throws Exception {
        //here we will try to run some DDL statements using java code.
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        //String sql="CREATE TABLE DUMMY (FIRSTCOL CHAR, SECONDCOL CHAR)";
        String sql="DROP TABLE dummy";
        int n=stmt.executeUpdate(sql);
        System.out.println(n);
        con.close();
    }
}
