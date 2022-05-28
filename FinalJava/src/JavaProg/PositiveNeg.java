import java.util.Scanner;

//program to determine positive and negative nos
public class PositiveNeg
{
    public static void main(String args[])
    {
        int a;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Number :");
        a = S.nextInt();
        if(a>0)
        {
            System.out.println("The number is Positive.");
        }
        else if(a<0)
        {
            System.out.println("The number is Negative.");
        }
        else {
            System.out.println("the no is Zero");
        }

    }
}
