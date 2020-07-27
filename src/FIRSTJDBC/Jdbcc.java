package FIRSTJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbcc {
    public static void main(String arg[]){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/demostudent",
                   "root",
                   "");
           Statement stmt = con.createStatement();


       }catch (Exception e){
           System.out.println();
       }

    }
}
