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
        
        System.out.println("Enter the element of array is:"+Arr.length);
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt=0;
        System.out.println("element of array is:");

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
             System.out.println(Arr[iCnt]);
        }
    }
}

class DisplayElement
{
    public static void main(String[]arr)
    {
       ArrayX obj=new ArrayX(5);

       obj.Accept();

       obj.Display();
    }
}