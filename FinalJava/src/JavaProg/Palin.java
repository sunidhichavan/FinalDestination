//palindrome program by using String
public class Palin
{
    public static void main(String args[])
    {
        String x = "radar";
        int i=0,j=x.length()-1;
        while (i<j)
        {
            if(x.charAt(i)!= x.charAt(j))
            {
                System.out.println("Not Palindrome");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}

