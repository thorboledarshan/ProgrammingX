/* 
5. A phone OS shows different battery warnings. The user wants a program that prints the correct battery status.

Rules:
Battery ≤ 5% - Critical
Battery ≤ 15%-Low
Otherwise -> Normal

Input:
Battery percentage (integer)

Validations:
0 to 100 only

Expected Output:
Battery Percentage: <value>%
Status: <Critical/Low/Normal>

*/

import java.util.*;

class Solution
{
    private int Battery; 
    private String Status;
    
    public Solution(int a)
    {
        this.Battery = a;
    }

    public void CalculateBatteryStatus()
    {
        if(Battery < 0 || Battery > 100)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Battery <= 5)
        {
            Status = "Critical";
        }
        else if(Battery <= 15)
        {
            Status = "Low";
        }
        else 
        {
            Status = "Normal";
        }

        System.out.println("Battery Percentage : "+Battery);
        System.out.println("Status : "+Status);

    }

}

class BatteryStatus50_5 
{
    public static void main(String A[])
    {
        int Battery = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Battery percentage : ");
        Battery = sobj.nextInt();

        Solution obj = new Solution(Battery);

        obj.CalculateBatteryStatus();

    }
}
