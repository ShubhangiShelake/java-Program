import java.util.*;

class ArrayX
{
    public int Arr[];
    public int Brr[];

    public ArrayX(int iSize1,int iSize2)
    {
        Arr=new int[iSize1];
        Brr=new int[iSize2];
    }

   protected void Accept()
    {
        int iCnt=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("enter the element:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }

    protected void Display()
    {
        int iCnt=0;

        System.out.println("original element of array is:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    protected void DisplayCopyElement()
    {
        int iCnt=0;

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Brr[iCnt]=Arr[iCnt];
        }
        System.out.println("copy element of array is:"+Brr[iCnt]);
    }
}

class CopyElement1
{
    public static void main(String[]arr)
    {
        int iSize1=0,iSize2=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the original array size:");
        iSize1=sobj.nextInt();

        System.out.println("Enter the copy array element size:");
        iSize2=sobj.nextInt();
        

        obj.Accept();
        obj.Display();
        obj.DisplayCopyElement();

    }
}