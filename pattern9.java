import java.util.*;
/*
    Row = 4
    Col = 4

    1 1 1 1 
    2 2 2 2 
    3 3 3 3 
    4 4 4 4

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

     for(i=1;i<irow;i++)
     {
        for(j=1;j<icol;j++)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
     }
    }


}

class pattern9
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