import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int digitNum = input.nextInt(); // Taking input How many digits in the number.
        int sum=0/*Initial sum = 0.*/ , originalNum=number;//Storing the number to a variable.

        if(number>=0 && digitNum>0) { //Allowing only positive numbers and digit counts for determining Armstrong number.
            while (number!=0) {
                int digit = number%10;
                sum = sum+((int) Math.pow(digit, digitNum));//Using Math.pow(method) for power to the digits & sum them all.
                number/=10;
            }
    
            if (sum==originalNum) {
                System.out.println(originalNum+" is an Armstrong number.");
            }
            else
            {
                System.out.println(originalNum+" is not an Armstrong number.");
            }
        } 
        else if (number>=0 && digitNum<0) //Condition for invalid digit count.
        {
            System.out.println("Invalid digit count of the number.");
        }
        else //Negative number can't be an Armstrong number.
        {
            System.out.println("Negative numbers can not be an Armstrong number");
        }
        input.close(); //Closing the input.
    }
}
