/*
4.Water Bill with Progressive Slabs + Late Fee Slabs + fixed meter charge. If paid after due date, add 2% penalty per week late (max 10%).

Input: units, weeksLate

Output: billAmount
*/

import java.util.*;

class Solution
{
    private int Units;
    private int WeeksLate;
    private int WeeksLateCharges;
    private int BillAmount;
    private int TotalBill;
    private int FixedCharge;

    public Solution(int a, int b)
    {
        this.Units = a;
        this.WeeksLate = b;
    }

    public void CalWaterBill()
    {
        if(Units <= 0 || WeeksLate < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        FixedCharge = 50;

        if(Units <= 10)
        {
            BillAmount = FixedCharge + (Units * 5);
        }
        else if(Units <= 20)
        {
            BillAmount = FixedCharge +50 + (Units - 10)*8;
        }
        else 
        {
            BillAmount = FixedCharge + 130 + ((Units - 20)*12);
        }

        if(WeeksLate == 0)
        {
            WeeksLateCharges = 0;
        }
        else if(WeeksLate < 4)
        {
            WeeksLateCharges = (BillAmount *(WeeksLate*2))/100;
        }
        else 
        {
            WeeksLateCharges = (BillAmount *(1 * 10))/100;
        }

        TotalBill = BillAmount + WeeksLateCharges;

        System.out.println("WeekslateCharge Applied : Rs."+WeeksLateCharges);
        System.out.println("Bill Amount : "+TotalBill);

    }
}

class CalWaterBill51_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Units = 0;
        int WeeksLate = 0;

        System.out.print("Enter Units consumed : ");
        Units = sobj.nextInt();

        System.out.print("Enter Weeks Late to repay : ");
        WeeksLate = sobj.nextInt();

        Solution obj = new Solution(Units,WeeksLate);

        obj.CalWaterBill();

        sobj.close();
    }
}