/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which checks whether 7,8,9  bit is ON or OFF.
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

    iResult = iNo & iMaskFinal; //check true or false

    if(iResult == iMaskFinal)
    {
      return true;
    }
    else
    {
      return false;
    }

  }
}

class ChkBit35_4
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
// input : 15 , Position: 1 2 3 4
// ouput : 15th bit is ON
//
///////////////////////////////////////////////////////////////////////////////////////////////