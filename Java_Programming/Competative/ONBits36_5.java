/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept one number from user and ON its first 4 bits
//  number. Return modified number.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int ONBits(int iNo)
  {
    int iMask = 0xF;
    iNo = iNo | iMask;
    return iNo;
  }

}

class ONBits36_5
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue = 0;
    System.out.println("Enter Number : ");
    iValue = sobj.nextInt();
    
    int iRet = 0;
    iRet = bobj.ONBits(iValue);

    System.out.printf("Modified number is : %d\n",iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 32 
// ouput : Modified number is : 32 
//
///////////////////////////////////////////////////////////////////////////////////////////////