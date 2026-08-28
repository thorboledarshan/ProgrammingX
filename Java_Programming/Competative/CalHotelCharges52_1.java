/*
1. A hotel charges ₹3000 per day. For long stays, hotel provides discount to retain customers.

Rules:
₹3000/day
If stay >7 days -> 5% discount on total bill

Input: Number of days stayed

Validations: Days must be ≥0

Expected Output:
Total Stay Duration: <days> days
Final Bill Amount: ₹<amount>
*/

import java.util.*;

class Solution
{
    private int Days;
    private int BaseCharge;

    public Solution(int a)
    {
        this.Days = a;
    }

    public void CalHotelCharges()
    {
        if(Days <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        BaseCharge = 3000 * Days;

        if(Days > 7)
        {
            BaseCharge = BaseCharge - ((BaseCharge * 5)/100);
        }

        System.out.println("Total stay duration : "+Days);
        System.out.println("Final Bill Amount : "+BaseCharge);
        
    }
}

class CalHotelCharges52_1
{
    public static void main(String A[])
    {
        int Days = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter days stayed at hotel : ");
        Days = sobj.nextInt();

        Solution obj = new Solution(Days);

        obj.CalHotelCharges();
    }
}