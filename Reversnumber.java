import java.util.*;

class Demo
{
    public int intNumber;

    public Demo(int x)
    {
        intNumber=x;
    }

    public void ReversnumberDisplay()
    {
        int intCnt=0;

        for(intCnt=intNumber;intCnt>=1;intCnt--)
        {
            System.out.println(intCnt);
        }
    }
}


class Reversnumber
{
    public static void main(String[]arr)
    {

    Scanner sobj=new Scanner(System.in);

    int intValue=0;

      System.out.println("Enter the number:");
        intValue=sobj.nextInt();

    Demo obj= new Demo(intValue);

    obj.ReversnumberDisplay();
    }


}