/* 
java python java c java python cpp

Generate:
java -> 3
python -> 2
c ->1
cpp -> 1

Then find the most frequently occurring word.

Expected:
Most frequent word : java
Frequency : 3

*/

import java.util.*;

class DisplayHighestFrequency65_4
{
    public static void main(String A[])
    {
        String input = "java python java c java python cpp";

        String Arr[] = input.split(" ");

        LinkedHashMap <String,Integer> frequency = new LinkedHashMap <String,Integer> ();

        for(String s : Arr)
        {
            frequency.put(s,frequency.getOrDefault(s,0) + 1);
        }

        for(Map.Entry<String,Integer> eobj : frequency.entrySet())
        {
            System.out.println(eobj.getKey() + " -> " + eobj.getValue());
        }

        String mostfrequent = null;
        int maxfrequency = 0;

        for(Map.Entry<String,Integer> eobj : frequency.entrySet())
        {
            if(eobj.getValue() > maxfrequency)
            {
                maxfrequency = eobj.getValue();
                mostfrequent = eobj.getKey();
            }
        }

        System.out.println("\nMost frequent word : " + mostfrequent);
        System.out.println("Frequency : " + maxfrequency);
    }
}
