import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Year = input.nextInt(); //Taking input a year.

        //Using ternary operator (No If/else or Switch-case).
        String result = ((Year%400==0)||((Year%4==0)&&(Year%100!=0)))?"The year is a Leap year.":"The year is not a Leap year."; //As the output is a sentence we're using String class to store the data in a result variable.

        System.out.println(result); //Printing the final result if the year is Leap Year or not.

        input.close(); //closing input.
    }
}
