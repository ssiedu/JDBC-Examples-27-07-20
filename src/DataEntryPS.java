
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DataEntryPS {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter Roll No ....");
        int rno=sc.nextInt();
        System.out.println("Enter Name ....");
        String name=sc.next();
        System.out.println("Enter Branch ....");
        String branch=sc.next();
        System.out.println("Enter Semester ....");
        int sem=sc.nextInt();
        
        String sql="INSERT INTO student VALUES (?,?,?,?)";
        
        Connection con=Utility.connect();
        
        PreparedStatement ps=con.prepareStatement(sql);
        
        ps.setInt(1, rno);
        ps.setString(2, name);
        ps.setString(3, branch);
        ps.setInt(4, sem);
        
        int n=ps.executeUpdate();
        
        con.close();
        System.out.println(n+" row added..");
        
    }
}
