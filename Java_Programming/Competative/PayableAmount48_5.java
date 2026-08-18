/* 
5. An e-commerce platform wants to compute final payable amount at checkout.
Discounts are based on purchase amount, and premium members receive an
extra discount after the main discount.

Discount Rules:
Amount >5000- 20% discount
Amount>2000-> 10% discount
Otherwise -> no discount

Premium members - extra 5% discount on the discounted amount

Input:Purchase amount (integer)
Membership type: Premium/Regular

Validations:
Amount must be > 0
Membership must be valid

Expected Output:
Original Amount: ₹<amount>
Total Discount: ₹<discount>
Final Payable Amount: ₹<finalAmount>
*/

import java.util.*;

class Solution
{
    private int MRP;
    private int Membership;
    private int MainDiscount;
    private int PremiumDiscount;
    private int DiscountedAmount;
    private int FinalPayableAmount;

    public Solution(int a, int b)
    {
        this.MRP = a;
        this.Membership = b;
    }

    public void CalculateAmount()
    {
        if(MRP <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Membership != 0 && Membership != 1)
        {
            System.out.println("Invalid Membership type");
            return;
        }

        if(MRP > 5000)
        {
            MainDiscount = (MRP * 20)/100;

            DiscountedAmount = MRP - MainDiscount;

            PremiumDiscount = (DiscountedAmount * 5) / 100;

            System.out.println("Original Amount : "+MRP);
            System.out.println("Total Discounted Amount : "+DiscountedAmount);

            if(Membership == 0)
            {
                FinalPayableAmount = (DiscountedAmount - PremiumDiscount);
                System.out.println("Final Payable Amount : "+FinalPayableAmount);
            }
            else 
            {
               System.out.println("Final Payable Amount : "+DiscountedAmount); 
            }
        }
        else if(MRP > 2000)
        {
            MainDiscount = (MRP * 10)/100;

            DiscountedAmount = MRP - MainDiscount;

            PremiumDiscount = (DiscountedAmount * 5) / 100;

            System.out.println("Original Amount : "+MRP);
            System.out.println("Total Discount : "+DiscountedAmount);

            if(Membership == 0)
            {
                FinalPayableAmount = (DiscountedAmount - PremiumDiscount);
                System.out.println("Final Payable Amount : "+FinalPayableAmount);
            }
            else 
            {
               System.out.println("Final Payable Amount : "+DiscountedAmount); 
            }
        }
        else 
        {
            System.out.println("Original Amount : "+MRP);
            System.out.println("Total Discount : Zero(0) ");
            System.out.println("Final Payable Amount : "+MRP);
        }
    }
}

class PayableAmount48_5
{
    public static void main(String A[])
    {
        int MRP = 0;
        int Membership = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter purchace amount : ");
        MRP = sobj.nextInt();

        System.out.println("Enter Membership type  : ");
        System.out.println("Type : Premium (Press 0)-> Regular (Press 1) : ");
        Membership = sobj.nextInt();

        Solution obj = new Solution(MRP,Membership);

        obj.CalculateAmount();

    }
}
