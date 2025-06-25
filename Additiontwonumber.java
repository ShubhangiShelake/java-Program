import java.util.*

class Demo
{
    public int Addition(int iNo1,int iNo2)
    {
       int iAns=0;
       iAns=iNo1+iNo2;
       return iAns;
    }
}

class Additiontwonumber
{
    public static void main(String[]arr)
    {
        int iValue1=10,iValue2=11,iRet=0;

        iRet=iValue1+iValue2;

        Demo obj=new Demo();

       iRet=obj.Addition(iValue1,iValue2);

        System.out.println("Addition of two number is:"+iRet);


    }
}