import java.util.*;

class Demo
{
    public int iNo;

    public Demo(int x)
    {
        iNo=x;
    }

    public boolean CheckNumberEvenOddDisplay()
    {
        if(iNo%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class CheckNumberEvenOdd
{
    public static void main(String[]arr)
    {
        Scanner sobj=new Scanner(System.in);

        int iValue=0;
        boolean bRet=false;

        System.out.println("Enter the number:");
        iValue=sobj.nextInt();

        Demo dobj=new Demo(iValue);

         bRet=dobj.CheckNumberEvenOddDisplay();
         if(bRet==true)
         {
            System.out.println("Number is even:");
         }
         else
         {
            System.out.println("Number is odd:");
         }



    }
}