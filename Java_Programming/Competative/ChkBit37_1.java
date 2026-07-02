/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.  Write a program which accept one number and position from user and
//    check whether bit at that position is on or off. If bit is one return TURE
//    otherwise return FALSE.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public boolean ChkBit(int iNo, int iPos)
  {
    int iMask = 1;
    iMask = iMask << (iPos - 1);

    int iAns = iNo & iMask;
    
    if(iAns == iMask)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

}

class ChkBit37_1
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue = 0;
    System.out.println("Enter Number : ");
    iValue = sobj.nextInt();

    int iLocation = 0;
    System.out.println("Enter Location : ");
    iLocation = sobj.nextInt();

    boolean bRet = false;
    bRet = bobj.ChkBit(iValue,iLocation);
    if(bRet == true)
    {
      System.out.println("Bit is ON ");
    }
    else 
    {
      System.out.printf("Bit is OFF ");
    }

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 0 
// ouput : Bit is OFF 
//
///////////////////////////////////////////////////////////////////////////////////////////////