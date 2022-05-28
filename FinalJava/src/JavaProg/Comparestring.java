import java.util.Scanner;
public class Comparestring {

        public static void main(String args[])
        {
            String s1 = new String();
            String s2 = new String();
            Scanner Sc = new Scanner(System.in);
            System.out.println("ENter 1st String :");
            s1 = Sc.next();
            System.out.println("ENter 2nd String :");
            s2 = Sc.next();
            if(s1.compareTo(s2)==0)
            {
                System.out.println("Equal String ");
            }
            else if(s1.compareTo(s2)>0 )
            {
                System.out.println("s1 is greater than s2");
            }
            else
            {
                System.out.println("s2 is greater than s1");
            }
        }
    }
