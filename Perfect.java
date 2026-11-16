import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sumOf_divs = 0, originalNum=num; //Storing number to a variable.

        for (int i = 1; i < num; i++) {

            if(num%i==0) 
            {
                int divisor = i; //Getting all the divisors of the number.
                sumOf_divs += divisor; //Sum of all the divisors of the number.
            } 
        }
        if (originalNum==sumOf_divs) 
        {
            System.out.println(originalNum+" is a Perfect Number.");
        }
        else
        {
            System.out.println(originalNum+" is not Perfect a Number.");
        }
        input.close(); //closing input.
    }
}
