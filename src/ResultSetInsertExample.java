
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ResultSetInsertExample {
    public static void main(String[] args) throws Exception {

        Connection con = Utility.connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM student"; 
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
        }
       
        rs.moveToInsertRow();
        
        rs.updateInt(1, 117);
        rs.updateString(2, "GGG");
        rs.updateString(3, "CIVIL");
        rs.updateInt(4, 2);
        
        rs.insertRow();
        
        System.out.println("Another Row Added...");
        System.out.println("UPDATED RESULT SET .........");
        
        rs.beforeFirst();
        
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
        }
        
        
        
        
        con.close();
    }
}
