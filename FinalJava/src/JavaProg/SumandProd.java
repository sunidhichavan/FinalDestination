// to Find Sum of Even & Product of Odd Digits of a Number
import java.util.Scanner;
public class SumandProd
{
    public static void main(String args[])
    {
         Scanner S =  new Scanner(System.in);
        int n,sum=0,pro=1,digit;

         System.out.println("Enter Number :");
         n=S.nextInt();
         while(n>0)
         {
             digit=n%10;
             if(digit % 2 == 0)
             {
                 sum=sum+digit;
             }else {
                 pro=pro*digit;

             }n=n/10;
         }
         System.out.println("sum =" +sum + " and prod =" +pro);
    }
}
