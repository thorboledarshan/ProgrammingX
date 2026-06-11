///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Check number is pallindrome or not.
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Logic
{
    void CheckPallindrome(int num)
    {
        int iRev = 0;
        int iDigit = 0;
        int iTemp = num;
        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }
        if(iTemp == iRev)
        {
            System.out.println("Number " +iTemp+ " is Pallindrome");
        }
        else
        {
            System.out.println("Number is not  Pallindrome");
        }
    }
}


class CheckPallindrome17_2
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CheckPallindrome(1214);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : 121
// ouput : Number 121 is Pallindrome
//
///////////////////////////////////////////////////////////////////////////////////////////////