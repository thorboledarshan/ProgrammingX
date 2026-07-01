/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept one number from user and toggle 7th and 10th  bit of that
//  number. Return modified number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int ToggleBit(int iNo)
  {
    int iMask1 = 0x40; //7
    int iMask2 = 0x200; //10
    int iMask = iMask1 | iMask2;
    iNo = iNo ^ iMask;
    return iNo;
  }

}

class ToggleBit36_4
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
// input : 32 
// ouput : Modified number is : 32 
//
///////////////////////////////////////////////////////////////////////////////////////////////