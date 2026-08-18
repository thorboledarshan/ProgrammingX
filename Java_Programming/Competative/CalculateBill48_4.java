/* 
4. An electricity company bills customers monthly based on how many units they consumed.
The billing is progressive, meaning units are charged in slabs.
The company wants a program to calculate bill accurately for any consumption.

Slabs:
First 100 units - ₹5 per unit
Next 100 units (101-200)-> ₹7 per unit
· Above 200 units - ₹10 per unit

Input:
 one integer units consumed

Validations:
. Units cannot be negative

Expected Output:
Total Units Consumed: <units>
Total Electricity Bill: ₹<amount>
*/

import java.util.*;

class Solution
{
    private int units;
    private int Bill;

    public Solution(int a)
    {
        this.units = a;
    }

    public void CalculateBill()
    {
        if(units < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        if(units <=100)
        {
            Bill = units * 5;
            System.out.println("Total units consumed : "+units);
            System.out.println("Total Electricity Bill : "+Bill);

        }
        else if(units <=200)
        {
            Bill = 500 + ((units - 100) * 7);
            System.out.println("Total units consumed : "+units);
            System.out.println("Total Electricity Bill : "+Bill);

        }
        else
        {
            Bill = 1200 + ((units - 200) * 10);
            System.out.println("Total units consumed : "+units);
            System.out.println("Total Electricity Bill : "+Bill);

        }
    }
}

class CalculateBill48_4
{
    public static void main(String A[])
    {
        int Units = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter units consumed : ");
        Units = sobj.nextInt();

        Solution obj = new Solution(Units);

        obj.CalculateBill();

    }
}
