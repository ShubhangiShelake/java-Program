import java.util.*;

class ArrayX
{
    protected int Arr[];

    public ArrayX(int iSize)
    {
        Arr=new int[iSize];
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

        System.out.println("element of array is:");
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

    public void DisplayEvenOdd()
    {
        int iCnt=0;

       System.out.println("even element of array is:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]%2==0)
            {
                System.out.println("is even:"+Arr[iCnt]);
            }
            else
            {
                System.out.println("is odd:"+Arr[iCnt]);
            }
        }

    }
}


class EvenOddElement1
{
    public static void main(String[]arr)
    {
        int iSize=0,iRet=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size of element that you want to create array:");
        iSize=sobj.nextInt();

        MarvellousX obj=new MarvellousX(iSize);

        obj.Accept();
        obj.Display();

        obj.DisplayEvenOdd();
        


    }
}