import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt(); //Taking input of star Pyramid size.

        for (int i = 1; i <= size; i++) { //Outer loop for column.

            for (int j = 1; j <= size-i; j++) { //Inner loop for print space.
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) { //Inner loop for prints stars.
                System.out.print("* "); 
            }
            System.out.println(); //for new line.
        }

        input.close();
    }
}
