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

    public void DisplayReverse()
    {
        int iStart = 0;
        int iEnd = Arr.length-1;
        int iTemp = 0;
        while(iStart < iEnd)
        {
            iTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = iTemp;

            iStart++;
            iEnd--;
        }
    }
}


class Reverseelement
{
    public static void main(String[]arr)
    {
        int iSize=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("enter the size of element that you want to create array:");
        iSize=sobj.nextInt();

        MarvellousX obj=new MarvellousX(iSize);

        obj.Accept();
        obj.Display();
        obj.DisplayReverse();

        System.out.println("Reverse element of array is:");

        obj.Display();


    }
}