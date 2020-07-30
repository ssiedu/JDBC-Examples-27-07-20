import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExampleTwo {
    
    public static void main(String[] args) throws Exception {
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        String sql="SELECT * FROM student where rno<=115"; //fetching all rows and all cols
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1));
        }//cursor reached to afterLast pos
        //rs.first(); //move the cursor to first row
        rs.beforeFirst();
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
        
        rs.absolute(3);     //cursor will move to row no three
        System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));//3rd rw
        
        
        
        con.close();
        
    }
}
