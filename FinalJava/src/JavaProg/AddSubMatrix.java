//Program for Additon/Subtraction of two Matrix

import java.util.Scanner;
class AddSubMatrix
{
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    void getdata()
    {
        int i,j;
        i=j=0;
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                Scanner Sc = new Scanner(System.in);
                System.out.println("Enter number :");
                a[i][j] = Sc.nextInt();
            }
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
            {
                Scanner Sc = new Scanner(System.in);
                System.out.println("Enter number :");
                b[i][j] = Sc.nextInt();
            }
    }
    void add()
    {
        int i,j;
        i=j=0;
        Scanner Sc = new Scanner(System.in);
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                c[i][j] = a[i][j]+b[i][j];
    }
    void putdata()
    {
        int i,j;
        i=j=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(c[i][j]+ "----");
                System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
        AddSubMatrix aa = new AddSubMatrix();
        aa.getdata();
        aa.add();
        aa.putdata();
    }
}


