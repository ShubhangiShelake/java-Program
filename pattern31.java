     import java.util.*;
/*
    Row = 5
    Col = 5

1       2       3       4
5       6       7       8
9       10      11      12
13      14      15      16
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
      int i=0,j=0,count=1;

      for(i=1;i<irow;i=i+1)
      {
        for(j=1;j<icol;j++)
        {
            System.out.print(count+"\t");
            count++;
        }
        System.out.println();
      }  
     
    }


}

class pattern31
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