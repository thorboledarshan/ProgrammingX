import java.util.Scanner;

class ArrayX
{
   public void Update(int Arr[])
  {
    int iCnt = 0;

    for(iCnt = 0; iCnt < Arr.length; iCnt++)
    {
      Arr[iCnt]++;
    }

    System.out.println("Elements after function call are :");

    for(iCnt = 0; iCnt < Arr.length; iCnt++)
    {
      System.out.println(Arr[iCnt]);
    }

  }
}
class program146
{
 
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    int iCnt = 0;
    ArrayX aobj = new ArrayX();
    System.out.println("Enter the number of elements : ");
        int iLength = sobj.nextInt();

        int Brr[] = new int[iLength];

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

    System.out.println("Elements before function call are :");
    

    for(iCnt = 0; iCnt < Brr.length; iCnt++)
    {
      System.out.println(Brr[iCnt]);
    }


    aobj.Update(Brr);
    

  }
}