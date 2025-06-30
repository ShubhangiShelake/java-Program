import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);

        int iCnt=0;
        System.out.println("element of array are:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt=0;
        
        System.out.println("Element of array is:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
           System.out.println(Arr[iCnt]);
        }
    }

}

class MarvellousX extends ArrayX
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }

    public int Addition()
    {
        int iCnt=0,iAdd=0;

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            iAdd=iAdd+Arr[iCnt];
        }
        return iAdd;
    }

}

class Additionelement1
{
    public static void main(String[]arr)
    {
        int iValue=0,iRet=0;

        Scanner sobj=new Scanner(System.in);
        
        System.out.println("enter your array size:");
        iValue=sobj.nextInt();

        MarvellousX obj=new MarvellousX(iValue);
        obj.Accept();
        obj.Display();

       iRet=obj.Addition();
       System.out.println("Addition of array element is:"+iRet);

    }
}