import java.util.*;

class ArrayX
{
  
  private int Arr[];
  private int iSize;
  
  public ArrayX(int X )           
  {
    iSize = X;             
    Arr = new int[iSize];  
  }


  void Accept()
  {
      int iCnt = 0;
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the elements :");
      for(iCnt = 0; iCnt < iSize; iCnt++)
      {
        Arr[iCnt] = sobj.nextInt();
      }
  }

  void Display()
  {
      int iCnt = 0;

      System.out.println("Elements of the array are :");
      for(iCnt = 0; iCnt < iSize; iCnt++)
      {
        System.out.println(Arr[iCnt]);
      }
  }

  int Summation()
  {
      int iCnt = 0, iSum = 0;
      for(iCnt = 0; iCnt < iSize; iCnt++)
      {
        iSum = iSum + Arr[iCnt];
      }
      return iSum;
  }
    

}

class program170
{ 
  public static void main (String A[])
  {
    
    int iLength = 0, iRet = 0;
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the number of elements :");
    iLength = sobj.nextInt();

    ArrayX aobj = new ArrayX(iLength);


    aobj.Accept();
    aobj.Display();
    
    iRet =aobj.Summation();
    System.out.println("Summation is :"+iRet);
   

  }
}