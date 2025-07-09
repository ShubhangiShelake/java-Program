import java.util.*;

/*
    Row = 4
    Col = 4

    * * * *
    * * * *
    * * * *
    * * * *
    

*/

class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo(int x,int y)
    {
        iNo1=x;
        iNo2=y;
    }

    public void Display()
    {
    
     int i=0,j=0;

     for(i=1;i<iNo1;i++)
     {
        for(j=1;j<iNo2;j++)
        {
            System.out.print("*\t");
        }
        System.out.println();
     }
    }


}

class pattern7
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