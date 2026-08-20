/* 
3. A courier counter calculates delivery charge by weight. Charges increase when parcel is heavier.
Charges:
Up to 1 kg ₹50
1-5kg₹50+ ₹20/kg above 1 kg
Above 5 kg₹150+ ₹30/kg above 5 kg

Input:
Parcel weight in kg (integer)

Validations:
Weight must be>0

Expected Output:
Parcel Weight: <weight> kg
Courier Charge: ₹<amount>
*/

import java.util.*;

class Solution
{
    private int Weight;
    private int Charges;

    public Solution(int a)
    {
        this.Weight = a;
    }

    public void CalculateCharges()
    {
        if(Weight <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Weight == 1)
        {
            Charges = 50;
        }
        else if(Weight <= 5)
        {
            Charges = 50 + (Weight-1)*20;
        }
        else
        {
            Charges = 150 + (Weight - 5)*30;
        }

        System.out.println("Parcel weight : "+Weight);
        System.out.println("Courier Charge : Rs "+Charges);
        
    }

}

class CalculateCharge50_3 
{
    public static void main(String A[])
    {
        int Weight = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Parcel Weight in KG : ");
        Weight = sobj.nextInt();
    
        Solution obj = new Solution(Weight);

        obj.CalculateCharges();

    }
}
