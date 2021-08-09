import static java.lang.Math.*;
import java.util.*;

public class main {
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

    public static Vector v=new Vector();

    public static void dynamicProgramming(int a){
        for(int i=2;i<=a;i++){
            if(!isPrime(i) && isFibonacci(i)){
                v.add(i);
            }
        }



    }


    public static void main(String[] args) {
        int numberUpperBound = 15;

        long startTime = 0, endTime = 0, executionTime = 0;


        startTime = System.nanoTime();
        dynamicProgramming(15);
        for(int i=0;i<v.size();i++) {
            System.out.println(v.get(i) + " is Prime Number and Exist in Fibonacci");
        }
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("executionTime for dynamic :" + executionTime);

        /*for (int i = 1; i <= numberUpperBound; i++) {
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
        }*/

    }
}