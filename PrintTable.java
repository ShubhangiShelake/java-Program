import java.util.*;

class Demo
{
    public int iNo;

    public Demo(int x)
    {
        iNo=x;
    }

    public void DisplayTable()
    {
        int iCnt=0,iMult=1;

        for(iCnt=1;iCnt<=10;iCnt++)
        {
           iMult=iCnt*iNo;
            System.out.println(iMult);
        }
    }

    
}

class PrintTable
{
    public static void main(String[]arr)
    {
        Scanner sobj=new Scanner(System.in);

        int iValue=0;

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();

        Demo dobj=new Demo(iValue);

        dobj.DisplayTable();



    }
}