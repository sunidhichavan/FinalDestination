import java.util.Scanner;

//program by using Scanner class
public class SimpleScanner1
{
    public static void main(String args[])
    {
        int a,b,mult;

        Scanner S = new Scanner(System.in);

        System.out.println("Enter ur first no. :");
        a = S.nextInt();

        System.out.println("Enter ur second no :");
        b = S.nextInt();

        mult = a*b;
        System.out.println("The Multiplication of first two nos is :" +mult);

    }
}
