/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept one number from user and off 7th bit of that
//  number if it is on. Return modified number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int ChkOFFBit(int iNo)
  {
    int iMask = 0x40;
    iNo = iNo & (~iMask);
    return iNo;
  }

}

class OFFBit36_1
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue = 0;
    System.out.println("Enter Number : ");
    iValue = sobj.nextInt();
    
    int iRet = 0;
    iRet = bobj.ChkOFFBit(iValue);

    System.out.printf("Modified number is : %d\n",iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 32 
// ouput : Modified number is : 32 
//
///////////////////////////////////////////////////////////////////////////////////////////////