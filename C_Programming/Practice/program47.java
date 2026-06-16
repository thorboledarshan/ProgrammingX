import java.util.Scanner;

class NumberX
{
    public void DispalyFactors(int iNo)
    {
      int iCnt = 0;

      for(iCnt=1;iCnt<=(iNo / 2);iCnt++)
      {
        if(iNo % iCnt == 0)
        {
          System.out.println("Factors are :"+iCnt);
        }
      }
    }
}
class program47
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.DispalyFactors(iValue);


    }
}

//Time Complexity : 0(N/2)
// Where N>=0