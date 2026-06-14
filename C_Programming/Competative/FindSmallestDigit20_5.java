///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. find smallest digit in given number 
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void FindSmallestDigit(int num)
    {
        int iDigit = 0;
        int iMin = 1;
        int iTemp = num;
        while(num != 0)
        {
          iDigit = num % 10;
          if(iDigit <= iMin)
          {
            iMin = iDigit;
          }
          num = num / 10;
        }
        System.out.println("smallest digit from " +iTemp+ " is :"+iMin);
    }
}


class FindSmallestDigit20_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.FindSmallestDigit(231);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 231
// ouput : Smallest digit from 231 is : 1
//
///////////////////////////////////////////////////////////////////////////////////////////////