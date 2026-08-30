/*
1. Write a program to check whether a given number is Neon Number or not.

Description:
A number is Neon if the sum of digits of its square equals the number.

Input:
One integer num

Output:
Neon Number or Not Neon Number

Example:
Input: 9
Explanation: 9^2=81, sum digits = 8+1=9
Output: Neon Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iDigit;
    private int iValue;
    private int iSum;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iDigit = 0;
        this.iSum = 0;
        this.iValue = 0;
    }

    public void NeonNumber()
    {
        iValue = (int)Math.pow(iNo,2);

        iTemp = iNo;


        while(iValue != 0)
        {
            iDigit = iValue % 10;

            iSum = iSum + iDigit;

            iValue = iValue / 10; 
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Neon number");
        }
        else 
        {
            System.out.println("It is not Neon number");
        }

    }
}
class ChkNeonNumber55_1
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.NeonNumber();

    }
}