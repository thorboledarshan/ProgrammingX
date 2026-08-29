/*
2. Write a program to check whether a given number is an Armstrong Number or not.

Description:
A number is Armstrong if:
(sum of each digit raised to power of total digits) = number

Input:
One integer num

Output:
Armstrong Number or Not Armstrong Number

Example:
Input: 153
Explanation: 1^3 + 5^3 + 3^3 = 153
Output: Armstrong Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iDigit;
    private int iCount;
    private int iSum;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iDigit = 0;
        this.iSum = 0;
    }

    public void ArmstrongNumber()
    {
        iTemp = iNo;

        iCount = (int)Math.log10(iNo) + 1;  //inbuilt functions

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + (int)Math.pow(iDigit,iCount);

            iNo = iNo / 10; 
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Armstrong number");
        }
        else 
        {
            System.out.println("It is not Armstrong number");
        }

    }
}
class ChkArmstrongNumber54_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.ArmstrongNumber();

    }
}