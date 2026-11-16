import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner object cretion.

        int number = input.nextInt(); //Taking input from the user.
        int originalNum = number; //Storing the original number to a variable.
        int reverseNum = 0; //Initial reverse of the number = 0;

        if(number>=0) {
            while (number!=0) {
    
               int digit = number%10; //Gets the last digit of the number.
               reverseNum = (reverseNum*10)+digit; //Reverse the number.
               number = number/10; //Dividing the number again & again as per need.
    
            }
    
            if (reverseNum==originalNum) { //For example number is 111 then reverse of it also 111.
    
                System.out.println(originalNum+" is a Palindrome number"); //Prints it is a Palindrome number.
    
            }
            else{
    
                System.out.println(originalNum+" is not a Palindrome number."); //Prints it is a Palindrome number.
    
            }
        } 
        else 
        {
            System.out.println("Negative numbers can not be a Palindrome number.");
        }

        input.close();//Closing the input.
        
    }
}
