public class Testoverload2
{
    public void s1(int i)
    {
        System.out.println("int-arg method");
    }
    public void s1(float f)
    {
        System.out.println("float-arg method");
    }
    public static void main(String[] args)
    {
        Testoverload2 test = new Testoverload2();
        test.s1(10);//for int arg
        test.s1(9.5f); //for float arg
        test.s1('t');//this method for char will be automatically promoted to its next type i.e. int type
        test.s1(10l);//in this long can be promoted to float.
    }

}
