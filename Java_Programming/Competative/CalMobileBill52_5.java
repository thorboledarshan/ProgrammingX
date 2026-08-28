/*
5. A telecom company bills calls based on duration slabs. The system needs to calculate final charge for a given call duration.

Input :  Call duration in minutes (integer)

Validations: Minutes must be ≥ 0

Rules:
First 5 minutes free
Next 10 minutes (6-15) - ₹1 per minute 
Beyond 15- ₹2 per minute

Expected Output:
Call Duration: <minutes> minutes
Total Call Charge: ₹<amount>
*/

import java.util.*;

class Solution
{
    private int CallDuration;
    private int Slab;

    public Solution(int a)
    {
        this.CallDuration = a;
    }

    public void CalMobileBill()
    {
        if(CallDuration < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(CallDuration <=5)
        {
            Slab = 0;
        }
        else if(CallDuration <= 15)
        {
            Slab = (CallDuration - 5) * 1;
        }
        else 
        {
            Slab = 10 + (CallDuration - 15)*2;
        }

        System.out.println("Call Duration : "+CallDuration+ " Minutes");
        System.out.println("Total call charge : Rs."+Slab);
    }
}

class CalMobileBill52_5
{
    public static void main(String A[])
    {
        int CallDuration = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter call duration in minutes : ");
        CallDuration = sobj.nextInt();

        Solution obj = new Solution(CallDuration);

        obj.CalMobileBill();
    }
}