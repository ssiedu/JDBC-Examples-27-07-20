
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ResultSetExampleOne {

    public static void main(String[] args) throws Exception {
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        //dispatch a SELECT CMD TO DB
        String sql="SELECT * FROM student WHERE branch='CS'";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            String s1=rs.getString(1);  
            String s2=rs.getString(2);
            String s3=rs.getString(3);
            String s4=rs.getString(4);
            System.out.println(s1+","+s2+","+s3+","+s4);
        }
        con.close();
        
    }
}
