/* 
5. An e-commerce application records product IDs:

101 102 101 103 101 102 104 105 102 102 103

Find the top 2 most frequently purchased products.
Expected:
102 -> 4
101 -> 3

*/

import java.util.*;

class DisplayMostPurchased65_5
{
    public static void main(String A[])
    {
        int input[] = {101, 102, 101, 103, 101, 102, 104, 105, 102, 102, 103};

        HashMap <Integer,Integer> frequency = new HashMap <Integer,Integer> ();

        for(int id : input)
        {
            frequency.put(id,frequency.getOrDefault(id,0) + 1);
        }

        // Convert entries into ArrayList
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>
        (frequency.entrySet());

        // Sort by frequency - descending
        list.sort((e1, e2) -> e2.getValue() - e1.getValue());

        // Display top 2
        for(int i = 0; i < 2; i++)
        {
            System.out.println(list.get(i).getKey() + " -> " + list.get(i).getValue());      
        }
        
    }
}
