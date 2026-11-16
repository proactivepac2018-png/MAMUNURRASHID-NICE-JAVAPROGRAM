import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(); //Taking first number.
        int num2 = input.nextInt(); //Taking second number.

        for (int i = num1; i >= 1; i--) { //Initialising with num1 & i must not be negative.
                if (num1%i==0 && num2%i==0) //Getting all the common divisors of num1 & num2.
                {
                    System.out.println("GCD = "+i); //Printing the highest valued divisor.
                    break; //Using break to stop the loop after printing the highest divisor among them.
                }

        }

        input.close(); //closing input.
    }
}
