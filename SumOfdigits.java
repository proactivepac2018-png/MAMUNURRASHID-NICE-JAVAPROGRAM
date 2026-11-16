import java.util.Scanner;

public class SumOfdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(); //Taking input.
        int sum = 0; 

        while (num>0) {
            int digit = num%10;
            sum+=digit; //sum of digits.
            num/=10;
        }

        System.out.println("Sum of Digits of the number = "+sum);

        input.close();
    }
}
