/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which checks whether 5th and 18th  bit is ON or OFF.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public boolean ChkBit(int iNo)
  {
    int iResult = 0;

    int iMask1 = 0x10;  //5
    int iMask2 = 0x20000; //18
    int iMask = 0;

    iMask = iMask1 | iMask2;

    iResult = iNo & iMask;

    if(iResult == iMask)
    {
      return true;
    }
    else
    {
      return false;
    }

  }
}

class ChkBit35_2
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
// input : 97
// ouput :  bit is OFF
//
///////////////////////////////////////////////////////////////////////////////////////////////