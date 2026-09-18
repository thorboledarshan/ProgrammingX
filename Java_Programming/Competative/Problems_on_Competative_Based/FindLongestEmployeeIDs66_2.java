/* 
2. Longest Consecutive Employee ID Sequence

Given IDs:

100
4
200
1
3
2
5

Find the longest consecutive sequence.

Output: 1 2 3 4 5

Length : 5

*/

import java.util.*;

class FindLongestEmployeeIDs66_2
{
    public static void main(String A[])
    {
        int Arr[] = {100,4,200,1,3,2,5};
         
        HashSet<Integer> hobj = new HashSet<Integer>();

        int maxcount = 0;
        int start = 0;

        for(int id : Arr)
        {
            hobj.add(id);
        }

        for(int id : Arr)
        {
            if(!hobj.contains(id - 1))
            {
                int current = id;
                int iCount = 1;
            

                while(hobj.contains(current+1))
                {
                    current++;
                    iCount++;
                }

                if(iCount > maxcount)
                {
                    maxcount = iCount;
                    start = id;
                }
            }
        }

        for(int i = 0; i < maxcount; i++)
        {
            System.out.print(start + i +" ");
        }

        System.out.println();
        System.out.println("Length : " + maxcount);


        //Using Arrays.sort technique
        /*
        Arrays.sort(Arr);

        int count = 1;
        int maxCount = 1;

        int start = Arr[0];
        int maxStart = Arr[0];

        for(int i = 0; i < Arr.length - 1; i++)
        {
            if(Arr[i + 1] == Arr[i] + 1)
            {
                count++;
            }
            else
            {
                if(count > maxCount)
                {
                    maxCount = count;
                    maxStart = start;
                }

                count = 1;
                start = Arr[i + 1];
            }
        }

        if(count > maxCount)
        {
            maxCount = count;
            maxStart = start;
        }

        for(int i = 0; i < maxCount; i++)
        {
            System.out.print(maxStart + i);
        }

        System.out.println();
        System.out.println("Length : " + maxCount);

        */
    }
}
