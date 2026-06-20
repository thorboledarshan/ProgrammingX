///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Check number is positive,negetaive or Zero.
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void CheckSign(int num)
    {
        if(num == 0)
        {
            System.out.println("Number is Zero");
        }
        else if(num > 0)
        {
          System.out.println("Number is Positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}


class CheckSign18_5
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckSign(1);  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 1
// ouput : Number is positive
//
///////////////////////////////////////////////////////////////////////////////////////////////