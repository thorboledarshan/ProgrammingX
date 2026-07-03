/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write a program which accept two numbers from user and display position
//  of common ON bits from that two numbers.
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Bitwise
{
  public void CommonBits(int iNo1, int iNo2)
  {
    int iMask = 0x1;
    int iAns = 0;
    int i = 0;
    
    iAns = iNo1 & iNo2;

    for(i = 1; i <= 32; i++)
    {
      if((iAns & iMask) == iMask)
      {
        System.out.printf("%d\n",i);
      }
      iMask = iMask << 1;

    }

  }

}

class CommonBits38_2
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    Bitwise bobj = new Bitwise();
    
    int iValue1 = 0;
    System.out.println("Enter Number : ");
    iValue1 = sobj.nextInt();

    int iValue2 = 0;
    System.out.println("Enter Number : ");
    iValue2 = sobj.nextInt();

    bobj.CommonBits(iValue1,iValue2);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 10 , 15
// ouput : 2 4
//
///////////////////////////////////////////////////////////////////////////////////////////////