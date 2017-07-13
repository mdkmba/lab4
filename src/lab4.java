import java.util.Scanner;

/**
 * Created by marcking2 on 7/13/17.
 */
public class lab4
{
    public static void main (String [] args)
    {
        Scanner scnr = new Scanner(System.in);
        int num;


        System.out.println("Welcome to the Factorial Calculator!");

         do
        {
            System.out.println("Enter a number (1-9):");
            num = scnr.nextInt();
        }while(num < 1 || num > 9 || !scnr.hasNextInt());
        System.out.printf("Calculating factorial of %s...", num);
        System.out.printf("The factorial of %s is %s", num, Factorial(num));

    }
    public static long Factorial (long fac)
    {
        for(int i = 0; i < fac; i++)
        {
            long result += (fac * i);

        }
    }
}
