/* 
4. A customer enters a store with a fixed budget. They pick items one by one in a given order.
The cashier wants to know how many items can be purchased before money becomes insufficient.

Input:
Budget amount
Number of items N
N item prices

Validations:
Budget ≥0
N≥0
Each price>0

Expected Output:
Items Purchased: <count>
Remaining Balance: ₹<amount>
*/

import java.util.*;

class Solution
{
    private int Budget;
    private int Price;
    private int N;
    private int iCount;

    public Solution(int a,int b)
    {
        this.Budget = a;
        this.N = b;
    }

    public void CalculateItems()
    {
        if(Budget < 0)
        {
            System.out.println("Budget is negative");
            return;
        }

        if(N < 0)
        {
           System.out.println("Number of items is neagtive");
           return; 
        }

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter price of each item : ");

        for(int i = 0; i < N; i++)
        {
            Price = sobj.nextInt();

            if(Price <= 0)
            {
                System.out.println("Invalid input");
                return;
            }

            if(Price > Budget)
            {
                break;
            }

            Budget = Budget - Price;
            iCount++;
        }

        System.out.println("Items purchased : "+iCount);
        System.out.println("Remaining Balance : "+Budget);

    }

}

class Calculateitems50_4 
{
    public static void main(String A[])
    {
        int Budget = 0;
        int N = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your budget amount : ");
        Budget = sobj.nextInt();

        System.out.println("Enter no.of items  : ");
        N = sobj.nextInt();

        Solution obj = new Solution(Budget,N);

        obj.CalculateItems();

    }
}
