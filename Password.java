import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String passWord; //A variable to store password from the user.
        
        do{
            passWord = input.next(); //Taking input password from user.

            if(!passWord.equals("Rafi1234")) //Condition for wrong password input.
            { 
                System.out.println("Incorrect password! \nTry again....."); //The loop will continue & print "Incorrect password! Try again....." until the corecct password input.
            }

        }while(!passWord.equals("Rafi1234")); //condition to continue the loop until the password input from the user is = "Rafi1234".
        
        System.out.println("Log in successful"); //when user inputs the correct password the loop will end & prints "Log in successful".

        input.close(); //closing the input.
    }
}
