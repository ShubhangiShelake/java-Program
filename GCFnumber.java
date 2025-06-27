import java.util.*;

//Greatest common divisor of two numbers.

class Demo
{
    public int intNo1;
    public int intNo2;

    public Demo(int x,int y)
    {
        intNo1=x;
        intNo2=y;
    }

    public void GreatestCommonDivisor()
    {
        int intCnt=0,iMax=0;

        for(intCnt=1;(intCnt<=intNo1) && (intCnt<=intNo2);intCnt++)
        {
             if((intNo1%intCnt==0) && (intNo2%intCnt==0))
            {
               iMax=intCnt;
            }
        }
        System.out.println("greatest divisior is:"+iMax);
    }

   
}

class GCFnumber
{
    public static void main(String[]arr)
    {
        Scanner sobj=new Scanner(System.in);

        int intValue1=0,intValue2=0;

        System.out.println("Enter the first number:");
        intValue1=sobj.nextInt();

        System.out.println("Enter the second number:");
        intValue2=sobj.nextInt();

        Demo obj=new Demo(intValue1,intValue2);

        obj.GreatestCommonDivisor();
    }
}