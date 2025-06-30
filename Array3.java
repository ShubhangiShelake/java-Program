import java.util.*;

class Array3
{
    public static void main(String[]arr)
    {
        int Arr[]={10,20,30,40,50};
        int iCnt=0,iSum=0;

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            iSum=iSum+Arr[iCnt];
        }

        System.out.println("Addition of element is:"+iSum);
    }
}