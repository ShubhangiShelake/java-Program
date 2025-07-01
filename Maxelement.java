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

    public int DisplayMaxElement()
    {
        int iCnt=0,iMax=Arr[0];

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]>iMax)
            {
                iMax=Arr[iCnt];
            }
        }

        return iMax;
    }
}


class Maxelement
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

        iRet=obj.DisplayMaxElement();
        System.out.println("Maximum element of array is:"+iRet);
        


    }
}