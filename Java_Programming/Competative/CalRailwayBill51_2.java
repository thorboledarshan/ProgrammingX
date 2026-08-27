/* 
Base fare depends on distance slabs. Add charges for class (Sleeper/3AC/2AC). If booking within 24 hours, add Tatkal 30%. Senior citizen gets 40% discount.

Input: distance, classType, bookingHoursBefore, age

Output: finalFare + reason breakdown
*/

import java.util.*;

class Solution
{
    private int Distance;
    private String ClassType;
    private int BookingTime;
    private int Age;
    private int TotalFare;
    private int BaseFare;
    private int TatkalFare;
    private int SeniorcitizenFare;
    private int SleeperFare;
    private int ThreeACFare;
    private int TwoACFare;    

    public Solution(int a, String b, int c, int d)
    {
        this.Distance = a;
        this.ClassType = b;
        this.BookingTime = c;
        this.Age = d;
    }

    public void CalRailwayBill()
    {
        if(Distance <= 0 || BookingTime <= 0 || Age <= 0)
        {
            System.out.println("Invalid input ");
            return;
        }

        if(
            !ClassType.equalsIgnoreCase("Sleeper") &&
            !ClassType.equalsIgnoreCase("3AC") &&
            !ClassType.equalsIgnoreCase("2AC")
          )
        {
            System.out.println("Invalid input");
            return;
        }

        if(Distance < 100)
        {
            BaseFare = 100;
        }
        else if(Distance < 200)
        {
            BaseFare = 200;
        }
        else 
        {
            BaseFare = 300;
        }


        SleeperFare = 0;
        ThreeACFare = 0;
        TwoACFare = 0;
        TotalFare = 0;

        if(ClassType.equalsIgnoreCase("Sleeper"))
        {
            TotalFare = BaseFare + SleeperFare;
        }
        else if(ClassType.equalsIgnoreCase("3AC"))
        {
            TotalFare = BaseFare + ThreeACFare;
        }
        else 
        {
            TotalFare = BaseFare + TwoACFare;
        }

        if(BookingTime <= 24)
        {
            TatkalFare = (TotalFare * 30) / 100;
            TotalFare = TotalFare + TatkalFare;

            System.out.println("Tatkal Charge: " + TatkalFare);
        }
        else
        {
            System.out.println("Tatkal Charge: 0");
        }

        SeniorcitizenFare = 0;

        if(Age >= 60)
        {
            SeniorcitizenFare = (TotalFare * 40)/100;
            TotalFare = TotalFare - SeniorcitizenFare;

            System.out.println("Senior Discount: " + SeniorcitizenFare);
        }
        else
        {
            System.out.println("Senior Discount: 0");
        }

        System.out.println("--------------------------");
        System.out.println("Final Fare   : " + TotalFare);

    }
}

class CalRailwayBill51_2
{
    public static void main(String A[])
    {
        int Distance = 0;
        String ClassType = null;
        int BookingTime = 0;
        int Age = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter distance : ");
        Distance = sobj.nextInt();

        System.out.println("Enter ClassType(Sleeper/3AC/2AC) : ");
        ClassType = sobj.next();

        System.out.println("Enter Booking Time : ");
        BookingTime = sobj.nextInt();

        System.out.println("Enter your age : ");
        Age = sobj.nextInt();

        Solution obj = new Solution(Distance,ClassType,BookingTime,Age);

        obj.CalRailwayBill();
    }
}
