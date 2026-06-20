///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Prime or not
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 2; iCnt <= num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iCount++;
                if(iCount > 1)
                {
                    break;
                }
            }
        }
        if(iCount <= 1)
        {
            System.out.println(num+" is Prime number");
        }
        else
        {
            System.out.println(num+" is not Prime number");
        }
    }
}


class CheckPrime18_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 11
// ouput : 11 is prime number 
//
///////////////////////////////////////////////////////////////////////////////////////////////