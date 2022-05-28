import java.util.Scanner;
class String_input
{
    public static void main(String args[])
    {
        String name= new String();
        String add = new String();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter ur Name :");
        name= Sc.next();
        System.out.println("Enter your Address");
        add = Sc.next();
        System.out.println("Name="+name+ " Address :" +add);
    }
}