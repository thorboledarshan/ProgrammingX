/* 
1. A company records employee IDs whenever employees enter the office:

IDs : 101 102 103 101 104 102 101 105

Write a Java program that displays how many times each employee entered the office.
Expected output:

101 -> 3
102 -> 2
103 -> 1
104->1
105 ->1
*/

import java.util.*;

class ChkEmployeeEntryCount64_1 
{
    public static void main(String A[])
    {
        int Arr[] = {101,102,103,101,104,102,101,105};

        /*
        boolean Visited[] = new boolean[Arr.length];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Visited[i] == true)
            {
                continue;
            }

            int iCount = 0;

            for(int j = 0; j < Arr.length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iCount++;
                    Visited[j] = true;
                }
            }

            System.out.println(Arr[i] + " -> " + iCount);
        }
        */

        OptimizedCode(Arr);
    }

    public static void OptimizedCode(int Arr[])
    {
        HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer> ();

        for(int id : Arr)
        {
            frequency.put(id,frequency.getOrDefault(id,0) + 1);
        }

        for(Map.Entry<Integer,Integer> eobj : frequency.entrySet())
        {
            System.out.println(eobj.getKey()+"->"+eobj.getValue());
        }
    }
}
