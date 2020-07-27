package FIRSTJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcc {
    public static void main(String arg[]){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/demostudent",
                   "root",
                   "");
           Statement stmt = con.createStatement();
           Scanner sc = new Scanner(System.in);
           for (int i = 0; i < 5 ; i++){
               int rollNo = sc.nextInt();
               sc.nextLine();
               String name = sc.nextLine();
               double cpi = sc.nextDouble();
               String sql = "INSERT INTO student " +
                       "(ROLLNO, NAME, CPI) VALUES" +
                       " ('"+rollNo+"','"+name+"','"+cpi+"')";
               int result = stmt.executeUpdate(sql);
               System.out.println("no of rows affected = " + result);



           }
           String sql = "SELECT * FROM student";
           ResultSet rs = stmt.executeQuery(sql);
           System.out.println("RollNo\t\tName\t\tCPI");
           while(rs.next()){
               int rollNo = rs.getInt(1);
               String name = rs.getString(2);
               double cpi = rs.getDouble(3);
               System.out.println(rollNo +"\t\t" + name +"\t\t" + cpi);

           }


       }catch (Exception e){
           System.out.println();
       }

    }
}
