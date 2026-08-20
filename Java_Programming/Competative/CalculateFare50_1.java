/* 
1. A ride-hailing app calculates trip fare based on distance and whether the trip happened during peak hours.
Peak hours increase demand, so surcharge applies.

Rules:
Base fare ₹50
First 10 km - ₹12 per km
Beyond 10 km - ₹15 per km
Peak hours - 20% extra on total fare

Input:
Distance in km (integer)
Peak hour (Yes/No)

Validations:
Distance cannot be negative

Expected Output:
Distance: <km> km
Peak Hour: <Yes/No>
Total Fare: ₹<amount>
*/

import java.util.*;

class Solution
{
    private int Distance;
    private String PeakHour;
    private int TotalFare;

    public Solution(int a, String b)
    {
        this.Distance = a;
        this.PeakHour = b;
    }

    public void CalculateFare()
    {
        if(Distance < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if( !PeakHour.equalsIgnoreCase("yes") &&
            !PeakHour.equalsIgnoreCase("no")
          )
        {
            System.out.println("Invalid input");
            return;
        }

        if(Distance <= 10)
        {
            TotalFare = 50 + (Distance * 12);
        }
        else
        {
            TotalFare = 170 + (Distance - 10)*15;
        }

        if(PeakHour.equals("yes"))
        {
            TotalFare = TotalFare + ((TotalFare * 20)/100);
        }

        System.out.println("Distance : "+Distance+" KM");
        System.out.println("Peak Hour(yes/no) : "+PeakHour);
        System.out.println("Total Fare : Rs "+TotalFare);
        
    }

}

class CalculateFare50_1 
{
    public static void main(String A[])
    {
        int Distance = 0;
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Distance in KM : ");
        Distance = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter Peak Hours (yes/no) : ");
        str = sobj.next();

        Solution obj = new Solution(Distance,str);

        obj.CalculateFare();

    }
}
