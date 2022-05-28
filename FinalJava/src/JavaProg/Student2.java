//Constructor program by ussing static member function(static function)
public class Student2
{

    int roll;
    String name;
    static String Cname = "BBMJ";

    Student2(int x, String y)
    {
        roll = x;
        name = y;
    }
    void display()
    {

        System.out.println("Roll No. ="+ roll+ " Student Name = " +name+"  College Name = " +Cname);
    }
     void change() //Static function
{
    Cname = "Badrinarayan Barwale College";
}

    public static void main(String args[])
    {
        Student1 s1 = new Student1(001,"Sunidhi Chavan");
        Student1 s2 = new Student1(002,"Snehal Shinde");
        Student1 s3 = new Student1(003,"Pratiksha Jadhav");

        s1.display();
        s2.display();
        s3.display();
        //Student2.change(); //for calling static member function
        s1.display();
        s2.display();
        s3.display();
    }
}
