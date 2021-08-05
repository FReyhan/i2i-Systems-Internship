import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class insertOracle {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","oracle", "111");
            Statement stmt = con.createStatement();

            int [] arr=new int[100000];
            Random rand = new Random();

            for (int i =0; i < 100000; i++){
                arr[i]=rand.nextInt(10000);
            }

            long start = System.nanoTime();

            for(int i = 0; i < 100000; i++){
                stmt.executeUpdate("INSERT INTO NUMBERS VALUES("+i+","+arr[i]+")");
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

