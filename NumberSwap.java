import java.util.Scanner;

public class NumberSwap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt(), y = input.nextInt(); //Taking two numbers input.
        int temp; //Empty temp variable to store a number to help swapping both of the numbers.

        temp = x;  //Putting the value of x to temp.
        x = y;     //Putting y to x.                   
        y = temp;  //Putting temp to y.

        System.out.println("Swap Numbers : "+x+" "+y); //Printing Swapped Numbers.

        input.close();

    }
}
