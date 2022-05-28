
    //program for checking the no is prime or not
import java.util.Scanner;

    public class Primeno1
    {
        public static void main(String args[])
        {
            int num=4;
            int count = 0;
            for(int i=1;i<num;i++)
            {
                if(num % i == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println("The number is not prime");
            }
            else
            {
                System.out.println("the no is Prime");
            }
        }

    }
/*        int num=27;
        boolean b=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                b=false;
            }
        }
        if(b)
        {
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}*/


