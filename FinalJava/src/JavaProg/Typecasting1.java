//program for type casting
public class Typecasting1
{
    public static void main(String args[])
        {
            double d = 50.50;
            System.out.println("Double representation :" + d);

            float f = (float)d ; //explicit casting to give value of double to float
            System.out.println("Float representation :" + f);

            long b = (long)d; //Explicit casting
            System.out.println("Long representation :" + b);

            int c = (int)b;
            System.out.println("Int representation :" + c);
        }

    }

