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

    public Addition()
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
    }
}



class Additiontwonumber2
{
    public static void main(String[]arr)
    {

        Scanner sobj=new Scanner(System.in);

        int iValue1=0,iValue2=0,iRet=0;

        System.out.println("Enter first number:");
        iValue1 =sobj.nextInt();

        System.out.println("Enter second number:");
        iValue2=sobj.nextInt();

        Demo obj =new Demo(iValue1,iValue2);

        iRet=obj.Addition();

        System.out.println("Addition of two number is:"+iRet);


    }


}
