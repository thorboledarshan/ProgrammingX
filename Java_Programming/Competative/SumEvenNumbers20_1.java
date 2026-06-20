///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Sum of even numbers upto N
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void SumEvenNumbers(int num)
    {
        int iSum = 0;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.println("Sum of even numbers is : "+iSum);
      
    }
}


class SumEvenNumbers20_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(5);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 5
// ouput : Sum  of even  number is : 6
//
///////////////////////////////////////////////////////////////////////////////////////////////