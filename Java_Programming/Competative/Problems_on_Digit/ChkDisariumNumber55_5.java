/*
5. Write a program to check whether a given number is Disarium Number or not.

Description:
A number is Disarium if:
Sum of digits raised to their position (starting from 1) equals the number.

Input:
One integer num

Output:
Disarium Number or Not Disarium Number

Example:
Input: 135
Explanation: 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
Output: Disarium Number

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

    public void DisariumNumber()
    {
        iTemp = iNo;

        int iCount = (int)Math.log10(iNo) + 1;

        int i = iCount;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iSum = iSum + (int)Math.pow(iDigit,i);

            iNo = iNo / 10; 

            i--;
        }

        if(iTemp  == iSum)
        {
            System.out.println("It is Disarium number");
        }
        else 
        {
            System.out.println("It is not Disarium number");
        }

    }
}
class ChkDisariumNumber55_5
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Solution obj = new Solution(iValue);

        obj.DisariumNumber();

    }
}