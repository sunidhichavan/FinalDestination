import java.util.ArrayList;
import java.util.List;
public class ListEx1
{
      public static void main(String args[])
        {
            List<String> l = new ArrayList<String>(); //here l as an object

            l.add("Cricket");
            l.add("Hockey");
            l.add("BatMinton");
            l.add("Chess");

            for(String Games:l)//for loop to add element in new line otherwise it will comes in arays form

                System.out.println(Games);

        }

    }


