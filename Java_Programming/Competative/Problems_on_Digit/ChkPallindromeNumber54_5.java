/*
5. Write a program to check whether a given number is Palindrome or not.

Description:
A number is Palindrome if it remains the same when reversed.

Input:
One integer num

Output:
Palindrome Number or Not Palindrome Number

Example:
Input: 121
Reverse: 121
Output: Palindrome Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iDigit;
    private int iRev;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iDigit = 0;
        this.iRev = 0;
    }

    public void PallindromeNumber()
    {
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iRev = iRev * 10 + iDigit;

            iNo = iNo / 10; 
        }

        if(iTemp == iRev)
        {
            System.out.println("It is Pallindrome number");
        }
        else 
        {
            System.out.println("It is not Pallindrome number");
        }

    }
}

class ChkPallindromeNumber54_5
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.PallindromeNumber();

    }
}