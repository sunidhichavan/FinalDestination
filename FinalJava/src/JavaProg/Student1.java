//Constructor program by ussing static data member(static variable)
public class Student1
{

    int roll;
    String name;
    static String Cname = "BBMJ";

    Student1(int x, String y)
    {
        roll = x;
        name = y;
    }
    void display()
    {

        System.out.println("Roll No. ="+ roll+ " Student Name = " +name+"  College Name = " +Cname);
    }

    public static void main(String args[])
    {
        Student1 s1 = new Student1(001,"Sunidhi Chavan");
        Student1 s2 = new Student1(002,"Snehal Shinde");
        Student1 s3 = new Student1(003,"Pratiksha Jadhav");

        s1.display();
        s2.display();
        s3.display();
    }
}