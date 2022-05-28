import java.util.LinkedHashSet;
import java.util.Set;

    //program for set
    public class SetEx
    {
        public static void main(String args[])
        {
            Set<String> S = new LinkedHashSet<String>();

            S.add("Windows");
            S.add("Mac");
            S.add("Linux");
            S.add("Ubantu");

            for(String OperatinSystem : S)//names comes in new line
                System.out.println(OperatinSystem);
        }
    }


