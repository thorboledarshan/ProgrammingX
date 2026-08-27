/*
3. User enters usage: calls(min), data(GB), SMS(count). App suggests the cheapest plan among 4 plans.
Input:
mins, gb, sms

Output:
recommendedPlan, totalCost

Twist:
if usage exceeds plan limits, add per-unit extra
*/

import java.util.*;

class Plan
{
    private String PlanName;
    private int BaseCost;

    private int CallLimit;
    private double DataLimit;
    private int SMSLimit;

    private double ExtraCall;
    private double ExtraData;
    private double ExtraSMS;

    public Plan(String name, int cost,
                int callLimit, double dataLimit, int smsLimit,
                double extraCall, double extraData, double extraSMS
                )
    {
        PlanName = name;
        BaseCost = cost;

        CallLimit = callLimit;
        DataLimit = dataLimit;
        SMSLimit = smsLimit;

        ExtraCall = extraCall;
        ExtraData = extraData;
        ExtraSMS = extraSMS;
    }

    public double CalculateCost(int mins, double gb, int sms)
    {
        double TotalCost = BaseCost;

        if(mins > CallLimit)
        {
            TotalCost = TotalCost +
                        ((mins - CallLimit) * ExtraCall);
        }

        if(gb > DataLimit)
        {
            TotalCost = TotalCost +
                        ((gb - DataLimit) * ExtraData);
        }

        if(sms > SMSLimit)
        {
            TotalCost = TotalCost +
                        ((sms - SMSLimit) * ExtraSMS);
        }

        return TotalCost;
    }

    public String GetPlanName()
    {
        return PlanName;
    }
}

class Solution
{
    public void RecommendPlan(int mins, double gb, int sms)
    {
        if(mins < 0 || gb < 0 || sms < 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        Plan P1 = new Plan(
            "Basic",
            199,
            100,
            2,
            100,
            1.0,
            50.0,
            0.50
        );

        Plan P2 = new Plan(
            "Smart",
            299,
            300,
            5,
            300,
            0.75,
            40.0,
            0.40
        );

        Plan P3 = new Plan(
            "Pro",
            399,
            600,
            10,
            500,
            0.50,
            30.0,
            0.30
        );

        Plan P4 = new Plan(
            "Premium",
            499,
            1000,
            20,
            1000,
            0.25,
            20.0,
            0.20
        );

        double Cost1 = P1.CalculateCost(mins, gb, sms);
        double Cost2 = P2.CalculateCost(mins, gb, sms);
        double Cost3 = P3.CalculateCost(mins, gb, sms);
        double Cost4 = P4.CalculateCost(mins, gb, sms);

        String RecommendedPlan = P1.GetPlanName();
        double MinimumCost = Cost1;

        if(Cost2 < MinimumCost)
        {
            MinimumCost = Cost2;
            RecommendedPlan = P2.GetPlanName();
        }

        if(Cost3 < MinimumCost)
        {
            MinimumCost = Cost3;
            RecommendedPlan = P3.GetPlanName();
        }

        if(Cost4 < MinimumCost)
        {
            MinimumCost = Cost4;
            RecommendedPlan = P4.GetPlanName();
        }

        System.out.println("\n----- Plan Recommendation -----");
        System.out.println("Plan        : " + RecommendedPlan);
        System.out.println("Total Cost  : Rs." + MinimumCost);
    }
}

class CalMobilePlan51_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int mins = 0;
        double gb = 0;
        int sms = 0;

        System.out.print("Enter calls/minutes : ");
        mins = sobj.nextInt();

        System.out.print("Enter data (GB) : ");
        gb = sobj.nextDouble();

        System.out.print("Enter SMS count : ");
        sms = sobj.nextInt();

        Solution obj = new Solution();

        obj.RecommendPlan(mins, gb, sms);

        sobj.close();
    }
}