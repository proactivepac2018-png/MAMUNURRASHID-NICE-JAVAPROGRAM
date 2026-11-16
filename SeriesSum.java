import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n = input.nextInt(); //Taking input of the end number of the series ('n').
        double sum = 0; //Initial sum of the series is = 0.

        for (int i = 1; i <= n; i++) {
            sum = sum + (i/(Math.pow(2, i))); //Logic of the given series.
        }

        System.out.println("Sum of the series 1+2/4+3/8+4/16+.......+n/2'n = "+(sum+0.5)); //print the sum of the series.
        System.out.println("(Where, n = "+n+")"); //prints the value of 'n'.

        input.close();
    }
}
