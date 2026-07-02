/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.  Write a program which accept one number and position from user and ON that bit.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int ONBit(int iNo, int iPos)
  {
    int iMask = 1;
    iMask = iMask << (iPos - 1);

    int iAns = iNo | (iMask);
    return iAns;

  }

}

class ONBit37_3
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue = 0;
    System.out.println("Enter Number : ");
    iValue = sobj.nextInt();

    int iLocation = 0;
    System.out.println("Enter Location : ");
    iLocation = sobj.nextInt();

    int iRet = 0;
    iRet = bobj.ONBit(iValue,iLocation);

    System.out.printf("Modified number is : %d\n",iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 10
// ouput : Modified number is : 10 
//
///////////////////////////////////////////////////////////////////////////////////////////////