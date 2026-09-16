/* 
4. A banking application receives transaction IDs:

TX101
TX102
TX103
TX101
TX104
TX102

Identify duplicate transaction IDs.

Expected output:
Duplicate transactions:
TX101
TX102.

*/

import java.util.*;

class ChkDuplicateTxns64_4
{
    public static void main(String A[])
    {     
        String transactions[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        OptimizedCode(transactions);
    }

    public static void OptimizedCode(String transactions[])
    {
        HashSet <String> unique = new HashSet <String> ();
        HashSet <String> duplicate = new HashSet <String> ();


        for(String str : transactions)
        {
            if(!unique.add(str))
            {
                duplicate.add(str);
            }
        }

        System.out.println("Duplicate transactions : ");
        
        for(String str : duplicate)
        {
            System.out.println(str);
        }

        
    }
}
