/*
4. Write a program to check whether a given number is a Harshad Number or not.

Description:
A number is Harshad if it is divisible by the sum of its digits.

Input:
One integer num

Output:
Harshad Number or Not Harshad Number

Example:
Input: 18
Explanation: sum digits = 1+8=9, 18%9=0
Output: Harshad Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iDigit;
    private int iSum;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iDigit = 0;
        this.iSum = 0;
    }

    public void HarshadNumber()
    {
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iNo = iNo / 10; 
        }

        if(iTemp % iSum == 0)
        {
            System.out.println("It is Harshad number");
        }
        else 
        {
            System.out.println("It is not Harshad number");
        }

    }
}

class ChkHarshadNumber54_4
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.HarshadNumber();

    }
}