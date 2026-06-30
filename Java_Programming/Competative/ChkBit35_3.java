/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which checks whether 7,15,21,28  bit is ON or OFF.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public boolean ChkBit(int iNo, int iPos1, int iPos2, int iPos3, int iPos4)
  {
    int iResult = 0;

    int iMask1 = 0x1;  
    int iMask2 = 0x1;
    int iMask3 = 0x1;  
    int iMask4 = 0x1;
    int iMask = 0;
     
    iMask1 = iMask1 << (iPos1-1);
    iMask2 = iMask2 << (iPos2-1);
    iMask3 = iMask3 << (iPos3-1);
    iMask4 = iMask4 << (iPos4-1);
    
    iMask = iMask1 | iMask2 | iMask3 | iMask4;

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

class ChkBit35_3
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int i = 0;
    int iValue = 0;
    int iLoc1 = 0;
    int iLoc2 = 0;
    int iLoc3 = 0;
    int iLoc4 = 0;


    System.out.println("Enter number : ");
    iValue = sobj.nextInt();
    
    
    System.out.println("Enter Loaction of 1st Bit : ");
    iLoc1 = sobj.nextInt();
    System.out.println("Enter Loaction of 2nd Bit : ");
    iLoc2 = sobj.nextInt();
    System.out.println("Enter Loaction of 3rd Bit : ");
    iLoc3 = sobj.nextInt();
    System.out.println("Enter Loaction of 4th Bit : ");
    iLoc4 = sobj.nextInt();
  

    boolean bRet = false;
    
    bRet = bobj.ChkBit(iValue,iLoc1,iLoc2,iLoc3,iLoc4);
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
// input : 15 , Position: 1 2 3 4
// ouput : 15th bit is ON
//
///////////////////////////////////////////////////////////////////////////////////////////////