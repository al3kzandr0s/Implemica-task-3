import java.math.BigInteger;
import java.util.Scanner;

// the bulk of code is here
public class CounterOfDigits {

    // method that outputs the result
    public static void countTheFactorial() {

        System.out.print("The result is " + countTheSumOfDigits(getTheInput()));
    }

    // method to count the sum of digits
    // gets and returns integer value
    public static int countTheSumOfDigits(int numOfInput) {
        int sumOfDigits = 0;
        BigInteger factorialValue = BigInteger.ONE;

        // Calculate the factorial of number
        for (int i = 2; i <= numOfInput; i++) {
            factorialValue = factorialValue.multiply(BigInteger.valueOf(i));
        }

        String number = String.valueOf(factorialValue);

        // for loop calculates the sum of digits
        for (int i = 0; i < number.length(); i++) {
            sumOfDigits += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return sumOfDigits;
    }

    // method to get input
    public static int getTheInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the the factorial: ");

        return scan.nextInt();
    }
}


