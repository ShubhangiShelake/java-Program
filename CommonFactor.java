import java.util.*;

 class Demo
 {
    public int intNo1;
    public int intNo2;

    public Demo(int x,int y)
    {
        intNo1=x;
        intNo2=y;
    }

    public void CommonFactorsDisplay()
    {
        int iCnt=01;

        for(iCnt=1; (iCnt <= intNo1) && (iCnt <=intNo2);iCnt++)
        {
            if((intNo1%iCnt==0) && (intNo2%iCnt==0))
            {
                System.out.println(iCnt);
            }
        }
    }
 }

class CommonFactor
{
    public static void main(String[]arr)
    {
       int intValue1=0,intValue2=0;

       Scanner sobj=new Scanner(System.in);

       System.out.println("Enter the first number:");
       intValue1=sobj.nextInt();

       System.out.println("Enter the second number:");
       intValue2=sobj.nextInt();

       Demo dobj=new Demo(intValue1,intValue2);

       dobj.CommonFactorsDisplay();


    }
}