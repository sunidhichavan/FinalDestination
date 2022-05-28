import java.util.Scanner;

//area of rectangle by using scanner class
public class SimpleScanner2
{
   /* public static void main(String args[])
    {
        float len,brd,ar;

        Scanner S = new Scanner(System.in);

        System.out.println("Enter length :");
        len = S.nextFloat();
        System.out.println("Enter Breadth :");
        brd = S.nextFloat();

        ar = len*brd;
        System.out.println("The Area of Rectangle is :" +ar);
    }
}*/

//import java.io.*;
//import java.lang.*;
//public class IfDemo {
    public static void main(String args[]) {
        int a, b,c;

        Scanner S = new Scanner(System.in);

         System.out.println("Enter first no :");
        a = S.nextInt();

        System.out.println("Enter second no :");
        b = S.nextInt();

        System.out.println("Enter third no :");
        c = S.nextInt();

      /*  if (a > b) {

            System.out.println("Max Number :" + a);
        } else {
            System.out.println("Max Number :" + b);

        }*/

        if(a>b && a>c)
        {
            System.out.println("Max number is " +a);
        }
        else if (b>a && b>c)
        {
           System.out.println("Max number is :" +b);
        }
        else
        {
            System.out.println("Max number is :" +c);
        }
    }
        }



