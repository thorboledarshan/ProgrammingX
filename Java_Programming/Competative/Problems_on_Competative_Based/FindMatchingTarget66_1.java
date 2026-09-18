/* 
1. Find Two Transactions Matching a Target

A customer made transactions: 
1200 500 700 300 1500

Find whether two transactions have a combined value of: 2000

Output:  500 + 1500 = 2000

*/

import java.util.*;

class FindMatchingTarget66_1
{
    public static void main(String A[])
    {
        int Arr[] = {1200, 500, 700, 300, 1500};

        int key = 2000;

        /*
        int i = 0;
        int j = 0;
        boolean bFlag = false;

        for(i = 0; i < Arr.length; i++)
        {
            bFlag = false;

            for(j = i + 1; j < Arr.length; j++)
            {
                if(Arr[i] + Arr[j] == Key)
                {
                    bFlag = true;
                    break;
                }
            }

            if(bFlag == true)
            {
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println(Arr[i]+ " + "+Arr[j] + " = "+ Key);
        }
        else 
        {
            System.out.println("no matchin pair found");
        }

        */

         
        HashSet<Integer> pair = new HashSet<Integer>();

        boolean bFlag = false;

        for(int value : Arr)
        {
            int required = key - value;

            if(pair.contains(required))
            {
                bFlag = true;
                System.out.println(required + " + " + value + " = " + key);
                break;
            }

            pair.add(value);
        }

        if(bFlag == false)
        {
            System.out.println("No matching pair found");
        }
        
    }
}
