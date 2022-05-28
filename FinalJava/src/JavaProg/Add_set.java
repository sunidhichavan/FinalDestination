
import java.util.LinkedHashSet;
import java.util.Set;

    //using add() method
    public class Add_set
    {
        public static void main(String args[])
        {
            Set<Integer> data = new LinkedHashSet<Integer>();

            data.add(1);
            data.add(2);
            data.add(3);
            data.add(4);
            data.add(5);

            System.out.println("data :" +data);
        }
    }

