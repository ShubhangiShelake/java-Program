import java.util.*;

class Demo
{
    public int Addition(int iNo1,int iNo2)
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
    }

}


class Additiontwonumber1
{
    public static void main(String[]arr)
    {
        Scanner sobj=new Scanner(System.in);
        int iValue1=0,iValue2=0,iRet=0;

        System.out.println("enter the first number:");
         iValue1=sobj.nextInt();

         System.out.println("enter the second number:");
         iValue2=sobj.nextInt();

        Demo obj=new Demo();

        iRet=obj.Addition(iValue1,iValue2);

        System.out.println("Addition of two number is:"+iRet);


    }
}