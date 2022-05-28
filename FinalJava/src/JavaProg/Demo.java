public class Demo
{
     int a=10;  //its a static variable
    public static void main(String[] args)
    {
        Demo d = new Demo();

        System.out.println(d.a); //it should be call by reference of object ie. "d.a"
        //System.out.println(a);
    }
}
