/*
1. Write a program to check whether a given number is a Strong Number or not.
Description:
A number is called Strong Number if the sum of factorials of each digit is equal to the number itself.

Input:
One integer num

Output:
Print: Strong Number or Not Strong Number

Example:
Input: 145
Explanation: 1! + 4! + 5! = 1 + 24 + 120 = 145
Output: Strong Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iDigit;
    private int iFact;
    private int iSum;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iDigit = 0;
        this.iFact = 1;
        this.iSum = 0;
    }

    public void StrongNumber()
    {
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iFact = 1;

            for(int i = 1; i <= iDigit; i++)
            {
                iFact = iFact * i;
            }

            iNo = iNo / 10;

            iSum = iSum + iFact;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is strong number");
        }
        else 
        {
            System.out.println("It is not strong number");
        }

    }

    public void OptimizedCode()
    {
        iTemp = iNo;

        int Fact[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880}; //$   

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + Fact[iDigit];

            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is strong number");
        }
        else
        {
            System.out.println("It is not strong number");
        }
    }
}
class ChkStrongNumber54_1
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.StrongNumber();

    }
}