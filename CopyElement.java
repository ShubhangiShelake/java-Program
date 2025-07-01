import java.util.*;

class CopyElement
{
    public static void main(String[]arr)
    {
        int Arr[]={10,20,30,40,50};
        int Brr[]=new int [Arr.length];

        int iCnt=0;

       System.out.println("Original elementof array is:");
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println(""+Arr[iCnt]);
        }

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            Brr[iCnt]=Arr[iCnt];
        }
         
         System.out.println("Copy element from original array is:");
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            System.out.println(""+Brr[iCnt]);
        }



    }
}