///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. check number is perfect or not 
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void CheckPerfect(int num)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum == num)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not  perfect");
        }
      
    }
}


class CheckPerfect20_3
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(8);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 6
// ouput : Number is Perfect
//
///////////////////////////////////////////////////////////////////////////////////////////////