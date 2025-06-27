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

    public void SwappednumberDisplay()
    {
        int inttemp=0;
        inttemp=intNo1;
        intNo1=intNo2;
        intNo2=inttemp;

        System.out.println("First number is:"+intNo1);
        System.out.println("second number is:"+intNo2);
    }
}

class Swappednumber
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

        obj.SwappednumberDisplay();
    }
}