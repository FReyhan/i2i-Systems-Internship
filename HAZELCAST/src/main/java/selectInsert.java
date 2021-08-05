import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class selectInsert {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","oracle", "111");
            Statement stmt = con.createStatement();

            int takenNumber;
            Random rand= new Random();

            long start = System.nanoTime();

            for(int i = 0; i < 100000; i++){
                ResultSet rs = stmt.executeQuery("SELECT VALUE FROM NUMBERS WHERE KEY = "+i+"");
                rs.next();
                takenNumber = rs.getInt("VALUE");

            }
            long runTime = System.nanoTime() - start;
            double seconds = (double)runTime / 1000000000.0;
            System.out.println(seconds);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
