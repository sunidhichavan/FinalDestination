//program to find factorial of a given number
import java.util.Scanner;
public class FactorialNo1
    {
        public static void main(String args[])
        {
            /*    int i,f=1;
                int number=4;//It is the number to calculate factorial
                for(i=1;i<=number;i++){
                    f = f * i;
                }
                System.out.println("Factorial of "+number+" is: "+f);*/
            int n, fact=1;
            System.out.println("Enter number to find factorial : ");
            Scanner Sc = new Scanner(System.in);
            n = Sc.nextInt();

            while(n>0)
            {
                fact = fact * n;
                n = n-1;
            }
            System.out.println("Factorial  of given number is  " + fact);

        }

    }


