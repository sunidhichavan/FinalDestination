import java.util.Scanner;

public class ArmstrongNo
{
    public static void main(String args[])
    {
        int num;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number:");//153
        num = Sc.nextInt();


        int onum = num;
        int cubnum = 0;

        while(num>0)
        {
            int reminder = num%10; //3
            cubnum = cubnum+(reminder*reminder*reminder);//24
            num = num/10; //15
        }
        if(onum==cubnum)
        {
            System.out.println(onum+ " is an Armstrong number");
        }
        else
        {
            System.out.println("is not an Armstrong number");
        }
        Sc.close();
    }
}
