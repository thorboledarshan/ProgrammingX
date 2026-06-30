/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Write a program which checks whether first and last bit is On or
// OFF. First bit means bit number 1 and last bit means bit number 32.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public boolean ChkBit(int iNo, int iPos[])
  {
    int iResult = 0;
    int i = 0;

    int iMaskFinal = 0;

    for( i = 0; i < iPos.length; i++)  // perform operation (OR)
    {
     iMaskFinal = iMaskFinal | (1 << (iPos[i] - 1));   //iMask = (1 << (iPos[i] - 1))
    }

    if(iNo == iMaskFinal)
    {
      return true;
    }
    else
    {
      return false;
    }

  }
}

class ChkBit35_5
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int i = 0;
    int iValue = 0;
    boolean bRet = false;
    
    System.out.println("Enter number : ");
    iValue = sobj.nextInt();

    int iCount = 0;
    System.out.println("How many loactions of bits are you going to check : ");
    iCount = sobj.nextInt();

    int iLoc[] = new int[iCount];
    for(i = 0; i< iCount; i++)
    {
      System.out.print("Enter Bit Position " + (i + 1) + " : ");
      iLoc[i] = sobj.nextInt();

      if(iLoc[i] < 1 || iLoc[i] > 32)
      {
        System.out.println("Invalid Bit Position");
        return;
      }
    }
    
    bRet = bobj.ChkBit(iValue,iLoc);
    if(bRet == true)
    {
      System.out.println("All specified bits are ON");
    } 
    else 
    {
      System.out.println("One or more specified bits are OFF");
    }
  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : -2147483647 , Position:2 , Location: 1,32 
// ouput : All specified bits are ON
//
///////////////////////////////////////////////////////////////////////////////////////////////