/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept one number from user and toggle 7th  bit of that
//  number. Return modified number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int ToggleBit(int iNo)
  {
    int iMask = 0x40; //7
    iNo = iNo ^ iMask;
    return iNo;
  }

}

class ToggleBit36_3
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