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
        int iCnt=1;
       for(iCnt=1;iCnt<=(iNumber/2);iCnt++)
       {
         if(iNumber%iCnt==0)
         {
            if(iCnt%2==0)
            {
                System.out.println(iCnt);
            }
         }
       }
    }
}

class EvenFactor
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