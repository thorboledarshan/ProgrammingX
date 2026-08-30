/*
6. Write a program to check whether a given number is Trimorphic Number or not.

Description:
A number is Trimorphic if its cube ends with the number itself.

Input:
One integer num

Output:
Trimorphic Number or Not Trimorphic Number

Example:
Input: 4
Explanation: 4^3=64 -> ends with 4
Output: Trimorphic Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iDigit;
    private int iValue;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iDigit = 0;
        this.iValue = 0;
    }

    public void TrimorphicNumber()
    {
        iValue = (int)Math.pow(iNo,3);

        int iCount = (int)Math.log10(iNo) + 1;  //counts total digit from number

        iTemp = iNo;

        int iDivisior = (int)Math.pow(10, iCount); //use this to break  last no.of digits

        iDigit = iValue % iDivisior; 

        if(iDigit == iTemp)
        {
            System.out.println("It is Trimorphic number");
        }
        else 
        {
            System.out.println("It is not Trimorphic number");
        }

    }
}
class ChkTrimorphicNumber55_6
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.TrimorphicNumber();

    }
}