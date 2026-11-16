import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(); //Taking input.
        int fact = 1; //Initial Factorial is = 1. As Factorial can't be 0.
        
        for (int i = 1; i <= num; i++) {
            fact*=i; // {Factorial of number 'n'} n! = n*(n-1)*(n-2)....*1
        }
        System.out.println(num+"! Factorial = "+fact);

        input.close();
    }
}
