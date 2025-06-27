import java.util.*;

class Demo
{
    public int intNumber;

    public Demo(int x)
    {
        intNumber=x;
    }

    public boolean Checkprimenumber()
    {
        if(intNumber%2==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
   
}


class ChecknumberPrime
{
    public static void main(String[]arr)
    {

    Scanner sobj=new Scanner(System.in);

    int intValue=0;
    boolean bRet=false;

      System.out.println("Enter the number:");
        intValue=sobj.nextInt();

    Demo obj= new Demo(intValue);

    bRet=obj.Checkprimenumber();

    if(bRet==true)
    {
        System.out.println("Number is prime");
    }
    else
    {
        System.out.println("number is not prime");
    }


    
    }


}