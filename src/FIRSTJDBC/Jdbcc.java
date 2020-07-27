package FIRSTJDBC;

public class Jdbcc {
    public static void main(String arg[]){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");


       }catch (Exception e){
           System.out.println();
       }

    }
}
