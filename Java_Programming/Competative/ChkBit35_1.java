/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which checks whether 15 th bit is ON or OFF.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public boolean ChkBit(int iNo)
  {
    int iAns = 0;

    int iMask = 0x4000;  //15

    iAns = iNo & iMask;

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

class ChkBit35_1
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();

    int iValue = 0;

    System.out.println("Enter number : ");
    iValue = sobj.nextInt();

    boolean bRet = false;
    
    bRet = bobj.ChkBit(iValue);
    if(bRet == true)
    {
      System.out.println("Bit is ON ");
    } 
    else 
    {
      System.out.println("Bit is OFF ");
    }
  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 0x4000
// ouput : 15th bit is OFF
//
///////////////////////////////////////////////////////////////////////////////////////////////