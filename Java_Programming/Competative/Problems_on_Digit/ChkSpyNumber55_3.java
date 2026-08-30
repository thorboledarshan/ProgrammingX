/*
3. Write a program to check whether a given number is Spy Number or not.

Description:
A number is Spy if:
(sum of digits) = (product of digits)

Input:
One integer num

Output:
Spy Number or Not Spy Number

Example:
Input: 1124
Sum=1+1+2+4=8
Product = 1x1x2x4=8
Output: Spy Number

*/

import java.util.*;

class Solution
{
    private int iNo;

    private int iTemp;
    private int iDigit;
    private int iSum;
    private int iProduct;

    public Solution(int a)
    {
        this.iNo = a;
        this.iTemp = 0;
        this.iDigit = 0;
        this.iSum = 0;
        this.iProduct = 1;
    }

    public void SpyNumber()
    {
        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iProduct = iProduct * iDigit;

            iNo = iNo / 10; 
        }

        if(iSum == iProduct)
        {
            System.out.println("It is Spy number");
        }
        else 
        {
            System.out.println("It is not Spy number");
        }

    }
}
class ChkSpyNumber55_3
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.SpyNumber();

    }
}