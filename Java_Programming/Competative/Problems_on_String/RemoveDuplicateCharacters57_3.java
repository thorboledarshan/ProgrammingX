/* 
3. Write a program to remove duplicate characters from a string.

Description: Remove repeated characters while keeping first occurrence.

Input Format: One string

Output Format: String without duplicate characters

Example:
Input: banana
Output: ban
*/
import java.util.*;

class Solution
{
    private String str;


    public Solution(String a)
    {
        this.str = a;

    }

    public void RemoveDuplicateCharacters() 
    {
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        String unique = "";

        for(int i = 0; i < Arr.length; i++)
        {
            boolean bFound = false;

            for(int j = 0; j < i; j++) //checks only previous characters
            {
                if(Arr[i] == Arr[j])
                {
                    bFound = true;
                    break;
                }
            }

            if(bFound == false)
            {
                unique = unique + Arr[i];
            }
        }

        System.out.println(unique);
    } 

    public void OptimizedCode()  
    {
        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        LinkedHashSet <Character> set = new LinkedHashSet<Character> ();

        StringBuilder unique = new StringBuilder();

        for(char c : Arr)
        {
            if(set.add(c) == true)
            {
                unique.append(c);
            }
        }

        System.out.println(unique);
    }
}

class RemoveDuplicateCharacters57_3
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        Solution obj = new Solution(str);

        //obj.RemoveDuplicateCharacters();
        obj.OptimizedCode();
    }
}