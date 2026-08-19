/* 
3. A warehouse has a product in stock. Every time a customer places an order, the system must check if enough
stock exists.
If possible, fulfill it and update remaining stock. If stock becomes very low, show alert.

Rules:
If requested quantity > available stock -> order fails
Else deduct quantity
If remaining stock < 5 -> print low stock alert

Input:
Current stock (integer)
Requested quantity (integer)

Validations:
Stock cannot be negative
Requested quantity must be >0

Expected Output:
If successful: Order Processed Successfully.
Remaining Stock: <value>
If remaining < 5 also print: Low Stock Alert!
If failed: Order Failed: Insufficient Stock.
*/

import java.util.*;

class Solution
{
    private int availablestock;
    private int orderedquantity;
    private int newavailablestock;

    public Solution(int a, int b)
    {
        this.availablestock = a;
        this.orderedquantity = b;
    }

    public void CalculateStock()
    {
        if(orderedquantity > availablestock)
        {
            System.out.println("Order Failed : Insufficient Stock");
            return ;
        }

        if(orderedquantity <= 0 || availablestock < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        newavailablestock = availablestock - orderedquantity;

        if(newavailablestock < 5)
        {
            System.out.println("Low Stock Alert!");
        }

        System.out.println("Order Processed Successfully.");
        System.out.println("Remaining Stock : "+newavailablestock);
    }

}

class CalculateStock49_3
{
    public static void main(String A[])
    {
        int AvailableStock = 0;
        int OrderedQuantity = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter available stock : ");
        AvailableStock = sobj.nextInt();

        System.out.println("Enter quantity to order stock : ");
        OrderedQuantity = sobj.nextInt();

        Solution obj = new Solution(AvailableStock,OrderedQuantity);

        obj.CalculateStock();

    }
}
