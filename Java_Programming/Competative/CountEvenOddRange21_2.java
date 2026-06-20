///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Count how many even and odd numbers are present between 1 and N
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void CountEvenOddRange(int n)
    {
        int iCnt = 0;
        int iCountEven = 0;
        int iCountOdd = 0;
        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCountEven++;
            }  
            else
            {
                iCountOdd++;
            }
        }
        System.out.println("Count of even number is : "+iCountEven);
        System.out.println("Count of odd number is : "+iCountOdd);
    }
    
}


class DisplayFactors21_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(5);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 5
// ouput : Count of even number is : 2
//         Count of even number is : 3
//
///////////////////////////////////////////////////////////////////////////////////////////////