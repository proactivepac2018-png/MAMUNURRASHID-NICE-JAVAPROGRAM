import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(); //Taking input 3 numbers for the user.

        if (num1>num2 && num1>num3) //Condition to be the first number to be largest.
        {
            System.out.println(num1+" is the Largest Number.");
        }
        else if (num2>num1 && num2>num3) //Condition to be the second number to be largest.
        {
            System.out.println(num2+" is the Largest Number.");
        }
        else //If both the condition above don't meet then 3rd number is the largest.
        {
            System.out.println(num3+" is the Largest Number.");
        }

        input.close(); //closing input.
    }
}
