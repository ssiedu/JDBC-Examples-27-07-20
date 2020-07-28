
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class PSExampleOne {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Roll No of Student To Promote");
        int n=sc.nextInt();
        
        String sql="UPDATE student SET sem=sem+1 WHERE rno=?";  //parameterized SQL
        
        Connection con=Utility.connect();
        
        //to execute a parameterized SQL we need an PreparedStatement object (instead of Statement)
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        
        //we need to set the values of all the parameters
        ps.setInt(1, n);
        
        
        int num=ps.executeUpdate();
        //stmt.executeUpdate(sql);
        
        System.out.println("total rows affected : "+num);
        
        con.close();
        
        
        
    }
}
