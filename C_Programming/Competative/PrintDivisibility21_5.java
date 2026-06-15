///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Print all numbers numbers from 1 to N divisible by both  2 and 3
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void PrintDivisibility(int n)
    {
        int iCnt = 0;
        int iCount = 0;
        for(iCnt = 1; iCnt <= n ; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println(iCnt);
            }  
        }
        
    }
    
}


class PrintDivisibility21_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.PrintDivisibility(30);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 30
// ouput : 2 6 12 24 30
//
///////////////////////////////////////////////////////////////////////////////////////////////