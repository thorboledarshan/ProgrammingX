///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. COUNT factors of given number
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void CountFactors(int n)
    {
        int iCnt = 0;
        int iCount = 0;
        for(iCnt = 1; iCnt <= (n / 2); iCnt++)
        {
            if(n % iCnt == 0)
            {
                iCount++;
            }  
        }
        System.out.println("Count of factors for given number is : "+iCount);
    }
    
}


class CountFactors21_4
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CountFactors(20);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 20
// ouput : Count of factors for given number is : 5
//
///////////////////////////////////////////////////////////////////////////////////////////////