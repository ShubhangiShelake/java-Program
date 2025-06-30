import java.util.*;

class Array4
{
    public static void main(String[]arr)
    {
        int iSize=0,iCnt=0,iSum=0;
        int Arr[];

        Scanner sobj=new Scanner(System.in);

        System.out.println("enter the size that you want to create array:");
        iSize=sobj.nextInt();

        Arr=new int[iSize];

        System.out.println("Enter the element that you want accept:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
        }

        System.out.println("Element of array is:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
           iSum=iSum+Arr[iCnt];
        }

        System.out.println("Addition of array element is:"+iSum);

    }
}