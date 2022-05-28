import java.util.Scanner;
class Add
{
    int a,b; //class variables
    void getdata() //1st function
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter your first Value :");
        a = S.nextInt();

        System.out.println("Enter your second Value :");
        b = S.nextInt();
    }
    void putdata() //second function
    {
        System.out.println("The addition of given two numbers is :" +(a+b));
    }

    public static void main(String args[])
    {
        Add aa = new Add();
        aa.getdata();
        aa.putdata();
    }
}
