package FIRSTJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbcc {
    public static void main(String arg[]){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/demostudent",
                   "root",
                   "");


       }catch (Exception e){
           System.out.println();
       }

    }
}
