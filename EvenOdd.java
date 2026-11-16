import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(); //Taking input from user.

        if (num==0) //Condition to be Zero.
        {
            System.out.println("The number is Zero.");
        }
        else if (num%2==0) //If there is no reminder after dividing the number by two then the number is "Even".
        {
            System.out.println(num+" is an even number.");
        }
        else //If con 1 & 2 don't meet then the number is Odd.
        {
            System.out.println(num+" is a odd number.");
        }
        input.close(); //Closing the input.
    }
}
