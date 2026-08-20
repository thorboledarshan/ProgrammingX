/* 
5. A tax portal calculates income tax based on annual income using progressive slabs. Only the amount in a slab is taxed at that slab's rate.

Slabs:
Up to ₹2,50,000 -> 0%
₹2,50,001 to ₹5,00,000 -> 5%
₹5,00,001 to ₹10,00,000 -+ 20%
Above ₹10,00,000 -+ 30%

Input:Annual income (integer)

Validations:
Income cannot be negative

Expected Output:
Annual Income: ₹<income>
Total Tax Payable: ₹<tax>
*/

import java.util.*;

class Solution
{
    private int Income;
    private int Tax;

    public Solution(int a)
    {
        this.Income = a;
    }

    public void CalculateTax()
    {
        if(Income < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(Income <= 250000)
        {
            Tax = 0;
        }
        else if(Income <=500000)
        {
            Tax = ((Income - 250000) * 5) / 100;
        }
        else if(Income <=1000000)
        {
            Tax = 12500 + ((Income - 500000) * 20) / 100;
        }
        else if(Income > 1000000)
        {
            Tax =112500 + ((Income - 1000000) * 30) / 100;
        }

        System.out.println("Annual Income : "+Income);
        System.out.println("Total Tax Payable : "+Tax);

    }

}

class TaxSlab49_5
{
    public static void main(String A[])
    {
        int Income = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your income : ");
        Income = sobj.nextInt();

        Solution obj = new Solution(Income);
        obj.CalculateTax();

    }
}
