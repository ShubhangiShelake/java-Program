import java.util.*;

//Samllest common divisor of two numbers.

class Demo
{
    public int intNo1;
    public int intNo2;

    public Demo(int x,int y)
    {
        intNo1=x;
        intNo2=y;
    }

    public void SamllestCommonDivisor()
    {
        int intCnt=0,iMin=9;


        for(intCnt=2;(intCnt<=intNo1) && (intCnt<=intNo2);intCnt++)
        {
             if((intNo1%intCnt==0) && (intNo2%intCnt==0))
            {
               if(intCnt<iMin)
               {
                 iMin=intCnt;
               }
            }
        }
        System.out.println("Samllest divisior is:"+iMin);
    }
}

class SCFnumber
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

        obj.SamllestCommonDivisor();
    }
}