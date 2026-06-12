///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Sum of even and odd digits seperately
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iSumEven = 0;
        int iSumOdd = 0;
        int iDigit = 0;
        
        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit % 2 == 0)
            {
                iSumEven = iDigit + iSumEven;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }
            num = num / 10;
        }
        System.out.println("Sum of Even Digit is : "+iSumEven);
        System.out.println("Sum of Odd Digit is : "+iSumOdd);
    }
}


class SumEvenOddDigits18_4
{ 
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 123456
// ouput : Sum of Even Digit is : 12
//         Sum of Odd Digit is : 9
//
///////////////////////////////////////////////////////////////////////////////////////////////