import java.util.Scanner;
class Stringequal
{
    public static void main(String args[])
    {
        String str1 = new String();
        String str2 = new String();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter first String : ");
        str1 = S.nextLine();
        System.out.println("Enter second String : ");
        str2 = S.nextLine();
        if(str1.equals(str2))
        {
            System.out.println("Equal String");
        }
        else{
            System.out.println("Not Equal String ");
        }
    }}