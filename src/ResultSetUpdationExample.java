
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetUpdationExample {

    public static void main(String[] args) throws Exception {

        Connection con = Utility.connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM student"; 
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
        }
        
        //we need to change he branch and sem for row-3
        //moving the cursor to row-3
        rs.absolute(3);
        //System.out.println("CURRENT ROW : "+rs.getRow());
        //call the updatter methods to change col
        rs.updateString(3, "CS");
        rs.updateInt(4, 5);
        //save the changes to DB
        rs.updateRow();
        System.out.println("DATA UPDATED ............");
        
        
        
        con.close();
    }
}
