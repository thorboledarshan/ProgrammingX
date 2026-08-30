/*
4. Write a program to check whether a given number is Sunny Number or not.

Description:
A number is Sunny if num + 1 is a perfect square.

Input:
One integer num

Output:
Sunny Number or Not Sunny Number

Example:
Input: 8
Explanation: 8+1=9, 9 is perfect square
Output: Sunny Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iSqr;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iSqr = 1;
    }

    public void SunnyNumber()
    {
        iTemp = iNo + 1;

        iSqr = (int)Math.sqrt(iTemp);

        if((iSqr * iSqr) == iTemp)
        {
            System.out.println("It is Sunny number");
        }
        else 
        {
            System.out.println("It is not Sunny number");
        }

    }
}
class ChkSunnyNumber55_4
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.SunnyNumber();

    }
}