/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept one numbers from user and check 9th and 12 th bit is  on or off.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public boolean ChkBit(int iNo, int iPos1, int iPos2)
  {
    int iMask1 = 0x1;
    int iMask2 = 0x1;
    int iAns2 = 0;
    int iAns1 = 0;

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);

    iAns1 = iNo & iMask1;
    iAns2 = iNo & iMask2;

    if((iAns1 == iMask1) || (iAns2 == iMask2) )
    {
      return true;
    }
    else 
    {
      return false;
    }


  }

}

class ChkBit38_3
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue1 = 0;
    System.out.println("Enter Number : ");
    iValue1 = sobj.nextInt();

    int iLoc1 = 0;
    System.out.println("Enter Location 1 : ");
    iLoc1 = sobj.nextInt();

    int iLoc2 = 0;
    System.out.println("Enter Location 2 : ");
    iLoc2 = sobj.nextInt();
    
    boolean bRet = false;
    bRet = bobj.ChkBit(iValue1,iLoc1,iLoc2);
    if(bRet == true)
    {
      System.out.println("Bits are ON ");
    }
    else 
    {
      System.out.println("Bits are OFF ");
    }
    

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 21
// ouput : Count 1`s Bits is : 3
//
///////////////////////////////////////////////////////////////////////////////////////////////