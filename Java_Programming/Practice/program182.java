import java.util.*;

class program182
{ 
  public static void Display(int iNo)
  {
    int iCnt = 0;
    char Ch = '\0';
    for(iCnt = 1, Ch = 65; iCnt <= iNo; iCnt++, Ch++)
    {
      System.out.print(Ch+"\t");
    }
    System.out.println();
  }

  public static void main (String A[])
  {
    Scanner sobj = new Scanner(System.in);
    int iValue = 0;

    System.out.println("Enter number of elements : ");
    iValue = sobj.nextInt();

    Display(iValue);
  }
}