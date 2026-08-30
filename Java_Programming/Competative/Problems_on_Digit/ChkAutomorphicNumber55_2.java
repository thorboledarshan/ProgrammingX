/*
2. Write a program to check whether a given number is Automorphic Number or not.

Description:
A number is Automorphic if its square ends with the same digits as the number.

Input:
One integer num

Output:
Automorphic Number or Not Automorphic Number

Example:
Input: 25
Explanation: 25^2=625 -> ends with 25
Output: Automorphic Number

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

    public void AutomorphicNumber()
    {
        iValue = (int)Math.pow(iNo,2);

        int iCount = (int)Math.log10(iNo) + 1;  //counts total digit from number

        iTemp = iNo;

        int iDivisior = (int)Math.pow(10, iCount); //use this to break  last no.of digits

        iDigit = iValue % iDivisior; 

        if(iDigit == iTemp)
        {
            System.out.println("It is Automorphic number");
        }
        else 
        {
            System.out.println("It is not Automorphic number");
        }

    }
}
class ChkAutomorphicNumber55_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.AutomorphicNumber();

    }
}