import java.util.*;

// 4 
//3
//2
//1

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

      for(i=iNo;i>=1;i--)
      {
        System.out.println(i+"");
      }
      System.out.println();
    }


}

class pattern4
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