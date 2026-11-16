import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt(); //Taking input a decimal number.
        String binary = ""; //Initial binary = "" (empty string)

        if (num==0) //if Decimal num = 0 then binary is also = 0.
        {
            binary = "0";
        }
        else
        {
            while (num>0) { //For any positive decimal number
                int reminder = num%2;
                binary = reminder + binary; //Converting decimal to binary.
                num/=2;
            }
        }
        System.out.println("Binary = "+binary); //printing the binary value of the decimal number given by the user.

        input.close(); //closing input.

    }
}
