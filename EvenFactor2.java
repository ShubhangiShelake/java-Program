import java.util.*;

class Demo
{
    public int iNumber;

    public Demo(int x)
    {
       iNumber=x;
    }

    public void Display()
    {
        int iCnt=0;
       for(iCnt=2;iCnt<=(iNumber/2);iCnt=iCnt+2)
       {
         if((iNumber%iCnt==0))
         {
            {
                System.out.println(iCnt);
            }
         }
       }
    }
}

class EvenFactor2
{
    public static void main(String[]arr)
    {
       Scanner sobj=new Scanner(System.in);
       int iValue=0;

       System.out.println("Enter the number:");
       iValue=sobj.nextInt();

       Demo dobj=new Demo(iValue);

       dobj.Display();


    }
}