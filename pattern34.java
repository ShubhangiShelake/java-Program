     import java.util.*;
/*
    Row = 5
    Col = 5

A
A B
A B C
A B C D
*/

class Demo
{
    public int irow;
    public int icol;

    public Demo(int x,int y)
    {
        irow=x;
        icol=y;
    }

    public void Display()
    {
      int i=0,j=0;
      char ch='A';

      for ( i = 1; i <= irow; i++) {

            for ( j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
        System.out.println();
      }  
    }
}

class pattern34
{
    public static void main(String[]arr)
    {
       int inumber1=0,inumber2=0;

       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter row number:");
       inumber1=sobj.nextInt();

       System.out.println("Enter col number:");
       inumber2=sobj.nextInt();

       Demo obj=new Demo(inumber1,inumber2);

       obj.Display();


    }
}