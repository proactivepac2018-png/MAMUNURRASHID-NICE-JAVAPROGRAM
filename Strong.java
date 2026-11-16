import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int sum =0 /*Initial sum = 0.*/ , originalNum=num; //Storing the number to a variable.

        while (num!=0) 
        {
            int digit = num%10;
            num/=10;

            int fact = 1; //Initialising factorial of each digits.

              for (int i = 1; i <= digit; i++) 
              {
                fact*=i; //Factorials of each digits.
              }

            sum+=fact; //sum of the factorials of each digits.

        }

        if (sum==originalNum) //If sum of the factorials of each digits is equal to = original number then it's a strong number.
        {
            System.out.println(originalNum+" is a Strong Number.");
        }
        else 
        {
            System.out.println(originalNum+" is not a Strong Number.");
        }
        
        input.close(); //closing input.
        
}

}
