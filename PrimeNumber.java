import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(); //Taking input a number.

        boolean prime = num>1; 

        for (int i = 2; i < num; i++) { //Identifying if there any divisors of the number without 1 & that number.

            if (num%i==0) { //If any divisor found the number is not a prime number.

                prime = false; //Indicating the number is not a prime number.
                break; //Stopping the loop after the condition meet.

            }
        }

        if (prime) //Condition for being Prime Number.
        {
            System.out.println(num+" is a Prime Number.");
        }
        else //Else it is not a Prime Number.
        {
            System.out.println(num+" is not a Prime Number.");
        }

        input.close(); //closing input.
    }
}
