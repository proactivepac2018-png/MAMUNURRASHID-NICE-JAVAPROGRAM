import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        String symbol = input.next(); //Taking input simple arithmetic symbols (+, -, x, /)
        double num2 = input.nextDouble();

        switch (symbol) { //using switch-case to do sum, sub, prod & div.
            case "+": System.out.println("Sum = "+(num1+num2)); break;
            case "-": System.out.println("Sub = "+(num1-num2)); break;
            case "x": System.out.println("Prod = "+(num1*num2)); break;
            case "/": System.out.println("Div = "+(num1/num2)); break;
        
            default: System.out.println("Syntax Error"); break; //other characters or symbols are not allowed in simple calculator (such as #, %, $ etc)
        }

        input.close(); //closing input.
    }
}
