/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept one number from user and range of
//  positions from user. Toggle all bits from that range.
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int ToggleBit(int iNo, int iStart, int iEnd)
  {
    int iMask = 0;
    int i = 0;

    for(i = iStart; i <=iEnd; i++)
    {
      iMask =iMask | 1 << (i-1);
    }

    return iNo ^ (iMask);

  }

}

class ToggleBit38_5
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue = 0;
    System.out.println("Enter Number : ");
    iValue = sobj.nextInt();

    int iRangeStart = 0;
    System.out.println("Enter Range Start number : ");
    iRangeStart = sobj.nextInt();

    int iRangeEnd = 0;
    System.out.println("Enter Range End number : ");
    iRangeEnd = sobj.nextInt();

    int iRet = 0;
    iRet = bobj.ToggleBit(iValue,iRangeStart,iRangeEnd);

    System.out.printf("Modified number is : %d\n",iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 10 , 9,13
// ouput : 
//
///////////////////////////////////////////////////////////////////////////////////////////////