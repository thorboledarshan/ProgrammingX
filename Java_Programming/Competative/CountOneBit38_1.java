/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept one number from user and count number of
//  ON (1) bits in it without using % and / operator.
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public int CountOneBit(int iNo)
  {
    int iMask = 0x1;
    int i = 0;
    int iCnt = 0;

    //for(i = 1; i <= 32; i++)
    while(iNo != 0)
    {
      if((iNo & iMask) == iMask)
      {
        iCnt++;
      }
      iNo = iNo >> 1;

    }
    return iCnt;

  }

}

class CountOneBit38_1
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue = 0;
    System.out.println("Enter Number : ");
    iValue = sobj.nextInt();

    int iRet = 0;
    iRet = bobj.CountOneBit(iValue);

    System.out.printf("Count 1`s Bits is : %d\n",iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 21
// ouput : Count 1`s Bits is : 3
//
///////////////////////////////////////////////////////////////////////////////////////////////