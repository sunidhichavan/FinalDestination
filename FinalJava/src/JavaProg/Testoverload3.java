public class Testoverload3
{
    public void v1(Object o)
    {
        System.out.println("Object Version");
    }
    public void v1(String s)
    {
        System.out.println("String version");
    }
    public static void main(String args[])
    {
        Testoverload3 t = new Testoverload3();
        t.v1(new Object());
        t.v1(new String());
        t.v1(null);////firstly exact match will get first priority
        // herec child class is string so it get 1st priority
    }
}

