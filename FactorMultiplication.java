import java.util.*;

class Demo
{
    public int intNo;

    public Demo(int x)
    {
        intNo=x;
    }

    public void FactorsMultiplicationDisplay()
    {
        int intCnt=0,intMult=1;

        for(intCnt=1;intCnt<intNo;intCnt++)
        {
           if(intNo%intCnt==0)
           {
             intMult=intMult*intCnt;
           }
           System.out.println(intMult);
        }
    }
}

class FactorsMultiplication
{
    public static void main(String[]arr)
    {
        Scanner sobj=new Scanner(System.in);

        int intValue=0;

        System.out.println("Enter  the number:");
        intValue=sobj.nextInt();


    }
}