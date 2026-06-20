///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. find largest digit in given number 
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void FindLargestDigit(int num)
    {
        int iDigit = 0;
        int iMax = 0;
        int iTemp = num;
        while(num != 0)
        {
          iDigit = num % 10;
          if(iDigit > iMax)
          {
            iMax = iDigit;
          }
          num = num / 10;
        }
        System.out.println("Largest digit from " +iTemp+ " is :"+iMax);
    }
}


class FindLargestDigit20_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindLargestDigit(223445);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 223445
// ouput : Largest digit from 223445 is : 5
//
///////////////////////////////////////////////////////////////////////////////////////////////