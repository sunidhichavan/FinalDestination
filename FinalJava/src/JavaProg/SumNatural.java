import java.util.Scanner;

//Sum of N natural Numbers:
public class SumNatural
{
    public static void main(String args[])
    {
        int n,i,add=0;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        n= S.nextInt();

        i=1;
        while(i<=5)
        {
           add=add+i;
           i=i+1;
        }
        System.out.println("Addition =" +add);

    }
}
