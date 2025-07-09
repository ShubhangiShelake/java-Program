import java.util.*;

// 1 * 2 * 3 * 4 * 

class Demo
{
    public int iNo;

    public Demo(int x)
    {
        iNo=x;
    }

    public void Display()
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
      int i=0;

      for(i=1;i<=iNo;i++)
      {
        System.out.print(i+"\t*\t");
      }
      System.out.println();
    }


}

class pattern6
{
    public static void main(String[]arr)
    {
       int inumber=0;

       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter your number:");
       inumber=sobj.nextInt();

       Demo obj=new Demo(inumber);

       obj.Display();


    }
}