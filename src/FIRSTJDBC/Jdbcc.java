package FIRSTJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
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


       }catch (Exception e){
           System.out.println();
       }

    }
}
