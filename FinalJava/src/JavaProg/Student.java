public class Student {
    private int id;
    private String name;
    private int salary;
    private String designation;


    public Student(int id, String name, int salary, String designation){
        this.id= id;
        this.name=name;
        this.salary=salary;
        this.designation=designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}

