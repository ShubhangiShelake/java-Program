import java.util.*;

class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo(int x,int y)
    {
        iNo1=x;
        iNo2=y;
    }

    public int Divisionx()
    {
       int iAns=0;
       iAns=iNo1/iNo2;
       return iAns;
    }
}

class Division
{
    public static void main(String[]arr)
    {
        Scanner sobj=new Scanner(System.in);

        int iValue1=0,iValue2=0,iRet=0;

        System.out.println("enter first number:");
        iValue1=sobj.nextInt();

        System.out.println("enter second number:");
        iValue2=sobj.nextInt();
       
       Demo dobj=new Demo(iValue1,iValue2);

       iRet=dobj.Divisionx();

       System.out.println("Division of two number is:"+iRet);


    }
}