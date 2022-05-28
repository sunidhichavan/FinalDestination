
//Fibonacci series program by without using recursion
public class FibonacciEx1
{
    public static void main(String args[])
    {
        int n1=0, n2=1, n3, i, count=10;
        System.out.println(n1+" "+n2); //printing o and 1

        for(i=2;i<count;++i) //loop starts form 2 coz 0 and 1 are already printed
        //here ++i returns value after it is increamented.
        {
            n3=n1+n2;
            System.out.println("" +n3);
            n1=n2;
            n2=n3;
        }

    }
}
