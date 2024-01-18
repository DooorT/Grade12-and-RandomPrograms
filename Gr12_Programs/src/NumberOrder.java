//D. Carreira
//February 3, 2022
//Number order: Will determine if two numbers inputed by the user are larger, smaller, or equal to eachother
import java.util.Scanner;
public class NumberOrder
{
    public static void main(String[] args)
    {
        //Variable Declarations and Initializations
        int num1 = 0;
        int num2 = 0;
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        boolean lessThan = num1<num2;
        boolean equalTo= num1==num2;
        boolean moreThan= num1>num2;
        System.out.println(num1 + " < " + num2 + ": " + lessThan);
        System.out.println(num1 + " == " + num2 + ": " + equalTo);
        System.out.println(num1 + " > " + num2 + ": " + moreThan);
    }//end main()
}//end class()