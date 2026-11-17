import java.util.*;

class program956
{
    public static void main(String A[])
    {
        HashMap <Integer, Integer> inventory = new HashMap <Integer, Integer>();

        //Add 101 50
        inventory.put(101,50);

        //Add 102 30
        inventory.put(102,30);

        //Sell 101,5
        if(inventory.containsKey(101))
        {
            inventory.put(101,inventory.get(101) - 5);
        }

        //Restock 102 20
        if(inventory.containsKey(102))
        {
            inventory.put(102,inventory.get(102) + 20);
        }

        System.out.println(inventory);
        
    }
}