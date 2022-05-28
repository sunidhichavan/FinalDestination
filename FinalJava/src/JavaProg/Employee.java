public class Employee implements Comparable<Employee>
{
    private String name;;
    private String phone;
    private int empId;


    public Employee(String name, String phone, int empId)//constructor
    {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}

