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
        int iCnt=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the element that you want to display:"+Arr.length);

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


class DisplayElement1
{
    public static void main(String[]arr)
    {
        int size=0;

        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the size of array is:");
        size=sobj.nextInt();

        ArrayX obj=new ArrayX(size);

        obj.Accept();
        obj.Display();
        

    }

}