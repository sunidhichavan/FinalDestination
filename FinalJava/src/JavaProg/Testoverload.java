//simple program for method overloading
public class Testoverload
{
    public void m1()
    {
        System.out.println("no-arg method");
    }
    public void m1(int i)
    {
        System.out.println("int-arg method");
    }
    public void m1(double d)
    {
        System.out.println("double-arg method");
    }
    public  static void main(String args[])
    {
        Testoverload t = new Testoverload();
        t.m1();//no-arg()                   ---
        t.m1(10);//for int arg ()           --How you can call ovrloaded method.
        t.m1(10.5);//for double type arg    ---
    }
}
