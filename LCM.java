import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(); //Taking first number.
        int num2 = input.nextInt(); //Taking second number.

        for (int i = 1; i > 0; i++) { 
            if (i%num1==0 && i%num2==0) //As first lowest common multiple is the LCM.
            {
                System.out.println("LCM = "+i); //Printing the LCM.
                break; //Stopping the loop after getting least common multiple.
            }
        }

        input.close(); //closing input.
    }
}
