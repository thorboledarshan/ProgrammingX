import java.util.Scanner;

class NumberX
{
    public void SumFactors(int iNo)
    {
      int iCnt = 0;
      int iSum = 0;

      for(iCnt=1;iCnt<=(iNo / 2);iCnt++)
      {
        if(iNo % iCnt == 0)
        {
          iSum = iSum + iCnt;
        }
      }
      System.out.println("summation of Factors : "+iSum);
    }
}
class program48
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.SumFactors(iValue);


    }
}

//Time Complexity : 0(N/2)
// Where N>=0