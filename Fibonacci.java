import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //Taking input number of elements.
        int firstNum = 0, secondNum = 1; //First number = 0 & second number = 1 initially.

        for (int i = 1; i <= n; i++) { //Conditon for printing numbers according to user input.

            System.out.print(firstNum+" "); //printing numbers from 0.

            int thirdNum = firstNum + secondNum; //as the rule of fibonacci series is third numbner is = sum of first number & second number.
            firstNum = secondNum; //replacing the previous 2nd number to 1st
            secondNum = thirdNum; //replacing the previous 3rd number to 2nd

            //& the loop continues until the element number inputed by the user ('n').

        }

        input.close();
    }
}
