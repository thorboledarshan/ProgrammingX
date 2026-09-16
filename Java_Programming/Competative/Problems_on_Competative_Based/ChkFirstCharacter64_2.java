/* 
2. A messaging application wants to identify the first character in a
message that occurs only once.

Input: programming

Output: First non-repeating character : p

The solution should preserve the original character order.
*/

import java.util.*;

class ChkFirstCharacter64_2 
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        /*

        for(int i = 0; i < Arr.length; i++)
        {
            int iCount = 0;

            for(int j = 0; j < Arr.length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iCount++;
                }
            }

            if(iCount == 1)
            {
                System.out.println(Arr[i]);
                break;
            }
        }

        */

        OptimizedCode(str);
    }

    public static void OptimizedCode(String str)
    {
        char Arr[] = str.toCharArray();

        LinkedHashMap<Character,Integer> frequency = new LinkedHashMap<Character,Integer> ();

        for(char ch : Arr)
        {
            frequency.put(ch,frequency.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character,Integer> eobj : frequency.entrySet())
        {
            if(eobj.getValue() == 1)
            {
                System.out.println("First non-repeating character : "+eobj.getKey()); 
                return;
            }
        }

        System.out.println("There is no non-repeating character");
    }
}
