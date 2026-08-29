/*
3. Write a program to check whether a given number is Perfect Number or not.

Description:
A number is Perfect if the sum of all proper divisors (excluding the number) is equal to the number.

Input:
One integer num

Output:
Perfect Number or Not Perfect Number

Example:
Input: 28
Explanation: divisors = 1, 2, 4, 7, 14 -+ sum = 28
Output: Perfect Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iSum;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iSum = 0;
    }

    public void PerfectNumber()
    {
        iTemp = iNo;

        for(int i = 1; i <= iNo/2; i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Perfect number");
        }
        else 
        {
            System.out.println("It is not Perfect number");
        }

    }
}
class ChkPerfectNumber54_3
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.PerfectNumber();

    }
}