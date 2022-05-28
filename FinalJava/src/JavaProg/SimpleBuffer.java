import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//program by using BufferedReader
public class SimpleBuffer
{
    public static void main(String args[]) throws IOException
    {
        int a,b,sum;

        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your first Number :" );
        a = Integer.parseInt(Br.readLine());

        System.out.println("Enter your second Number : ");
        b = Integer.parseInt( Br.readLine());

        sum=a+b;
        System.out.println("The Addition of first two Numbers is  :" +sum);
    }

}
