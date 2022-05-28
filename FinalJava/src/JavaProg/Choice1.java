//program for calculator
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Choice1
{
    public static void main(String args[])
    {
        int a,b,ch;

        Scanner S = new Scanner(System.in);

        System.out.println("Enter your value of a :");
        a = S.nextInt();
        System.out.println("Enter your value of b :");
        b = S.nextInt();
        System.out.println("1->Add 2->Sub 3->Mult 4->Div /n Enter your Choice :");
        ch=S.nextInt();

        if(ch==1)
        {
            System.out.println("You Selected Addition  : " +(a+b));

        } else if (ch==2)
        {
            System.out.println("You Selected Subtaction : " +(a-b));
        } else if(ch==3)
        {
            System.out.println("You Selected Multiplication : " +(a*b));
        }else if(ch==4)
        {
            System.out.println("You Selected Division : " +(a/b));
        }
        else {
            System.out.println("Invalid Choice");
        }


    }
}
