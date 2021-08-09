import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    private static Logger logger=LogManager.getRootLogger();

    public static boolean isPrime(int a){

        boolean isItPrime = false;

        if (a == 0 || a == 1) {
            isItPrime = true;
        }
        else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    isItPrime = true;
                    break;
                }
            }
        }
        return isItPrime;
    }

    public static boolean isPerfectSquare(int a) {

        int s = (int) Math.sqrt(a);

        if (Math.pow(s,2) == a) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isFibonacci(int a) {

        int testCase1 = 5 * a * a + 4;
        int testCase2 = 5 * a * a - 4;

        if (isPerfectSquare(testCase1) || isPerfectSquare(testCase2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void mainFunction(){

        int numberUpperBound = 15;

        for (int i = 1; i <= numberUpperBound; i++) {
            if (!isPrime(i) && isFibonacci(i)) {
                System.out.println(i +" is Prime Number and Exist in Fibonacci");
            }
            else if (!isPrime(i)){
                System.out.println(i +" is not Prime Number but Exist in Fibonacci");
            }
            else if (isFibonacci(i)) {
                System.out.println(i +" is Prime Number but not Exist in Fibonacci");
            }
            else {
                System.out.println(i +" is not Prime Number and not Exist in Fibonacci");
            }
        }

    }

    public static void main (String[] args){
       logger.debug("Debug Log4j2 log message");
       logger.info("Info Log4j2 log message");
       logger.error("Error Log4j2 log message");

        try {
            mainFunction();
        }
        catch (Exception e){
            logger.error("Something bad happen {}",e);
        }



    }


}
