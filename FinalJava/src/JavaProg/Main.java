import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Student> std = new ArrayList<>();

        std.add(new Student(1,"Ashish",25000,"fullStackDeveloper"));
        std.add(new Student(2,"Krushna",26000,"javaDeveloper"));
        std.add(new Student(3,"Vaibhav",30000,"frontEndDeveloper"));
        std.add(new Student(4,"Purushottam",30000,"frontEndDeveloper"));
        std.add(new Student(5,"Bhagyashree",25000,"backendDeveloper"));
        std.add(new Student(6,"Rachana",26000,"pythonDeveloper"));
        std.add(new Student(7,"Dharmaraj",25000,"fullStackDeveloper"));
        std.add(new Student(8,"Ganesh",30000,"frontEndDeveloper"));
        std.add(new Student(9,"Narendra",30000,"javaDeveloper"));
        std.add(new Student(10,"Sunidhi",30000,"backendDeveloper"));

        Collections.sort(std, new SortById());
        System.out.println(std);

    }
}


