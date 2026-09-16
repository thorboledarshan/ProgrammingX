/* 
3. An e-commerce warehouse maintains: 
Product ID -> Available Quantity

Implement operations:
ADD 101 50
ADD 102 30
SELL 101 5
RESTOCK 102 20
SEARCH 101

Expected result: Product 101 available quantity : 45

If a product doesn't exist, display an appropriate message.
*/

import java.util.*;

class CalculateStock64_3
{
    public static void main(String A[])
    {     
        int ProductID[] = {101, 102};
        int Quantity[] = {50, 30};

        // SELL 101 5
        int id = 101;
        int sell = 5;

        for(int i = 0; i < ProductID.length; i++)
        {
            if(ProductID[i] == id)
            {
                Quantity[i] = Quantity[i] - sell;
                break;
            }
        }

        // RESTOCK 102 20
        id = 102;
        int restock = 20;

        for(int i = 0; i < ProductID.length; i++)
        {
            if(ProductID[i] == id)
            {
                Quantity[i] = Quantity[i] + restock;
                break;
            }
        }

        // SEARCH 101
        id = 101;
        boolean bFlag = false;

        for(int i = 0; i < ProductID.length; i++)
        {
            if(ProductID[i] == id)
            {
                System.out.println("Product "+id+
                        " available quantity : "+Quantity[i]);

                bFlag = true;
                break;
            }
        }

        if(bFlag == false)
        {
            System.out.println("Product not found");
        }
        

        //OptimizedCode();
    }

    public static void OptimizedCode()
    {
    
        HashMap<Integer,Integer> stock = new HashMap<Integer,Integer> ();

        stock.put(101,50);
        stock.put(102,30);

        if(stock.containsKey(101))
        {
            stock.put(101,stock.get(101) - 5);
        }

        if(stock.containsKey(102))
        {
            stock.put(102,stock.get(102) + 20);
        }

        int id = 101;

        if(stock.containsKey(id))
        {
            System.out.println("Product "+id+" available quantity : "+stock.get(id));
        }
        else 
        {
            System.out.println("Product not found");
        }
        
    }
}
