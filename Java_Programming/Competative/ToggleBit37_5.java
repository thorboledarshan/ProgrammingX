/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q. Write a program which accept one number from user and toggle contents
//   of first and last nibble of the number. Return modified number. (Nibble is a
//   group of four bits)
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int ToggleBit(int iNo)
  {
    int iMask1 = 0x1;
    int iMask2 = 0x8;
     
    int iMask = iMask1 | iMask2;

    int iAns = iNo ^ (iMask);
    
    return iAns;

  }

}

class ToggleBit37_5
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue = 0;
    System.out.println("Enter Number : ");
    iValue = sobj.nextInt();

    int iRet = 0;
    iRet = bobj.ToggleBit(iValue);

    System.out.printf("Modified number is : %d\n",iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 10
// ouput : Modified number is : 14
//
///////////////////////////////////////////////////////////////////////////////////////////////