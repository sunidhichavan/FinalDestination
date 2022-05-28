// sorting program of comparable
import java.util.ArrayList;
import java.util.Collections;

public class SortExample
{
    public static void main(String args[])
    {
        ArrayList<Employee> emps = new ArrayList<>();//Employee is a class
        //to store objects of Employee class here hence, we take Employee class name here

        emps.add(new Employee("Sunidhi", "9021412357", 24)); //Objects of an Integere i.e.marks
        emps.add(new Employee("Bhagyashree", "549587323", 56));
        emps.add(new Employee("Rachana", "985734583", 67));
        System.out.println(emps);

        Collections.sort(emps);//for sorting
        //comparable
        System.out.println(emps);

    }
}
