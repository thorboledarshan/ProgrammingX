import java.util.*;

class program185
{ 
  public static void Display(int iNo)
  {
    int iCnt = 0;
    char Ch = '\0';
    for(iCnt = 1, Ch = 'A'; iCnt <= iNo; iCnt++, Ch++)
    {
      if(Ch % 2 != 0)
      {
       System.out.print(Ch+"\t");
      }
      else 
      {
        System.out.print("*\t");
      }
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