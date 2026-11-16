import java.util.Scanner;

public class CelToFar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tempCel = input.nextDouble(); //Input temperature in Celsius.

        double tempFar = (((tempCel*9)/5)+32); //Formula Celsius to Farenheit.

        System.out.println("Farenheit Temperature = "+ String.format("%.2f",tempFar)+'F'); //This will show the result two decimal point vale.

        input.close(); //Closing Input.
    }
}
