/* 
3. Write a program to check whether a string is Pangram.

Description:

A string is Pangram if it contains all alphabets from 'a' to 'z' at least once.

Input Format: One sentence str

Output Format:Pangram OR Not Pangram

Example:
Input:
the quick brown fox jumps over the lazy dog

Output: Pangram
*/
import java.util.*;

class Solution
{
    private String str;
        
    private char Arr[];
    
    public Solution(String a)
    {
        this.str = a; 
    }

    public void StringPangram() //o(N),o(N) 
    {   
       String Tokens[] = str.split(" ");
       
       int Frequency[] = new int[26];

       for(int i = 0; i < Tokens.length; i++)
       {
            for(int j = 0; j < Tokens[i].length(); j++) //$
            {
                char ch = Tokens[i].charAt(j);

                Frequency[ch - 'a']++;
            }
       }
       

       for(int i = 0; i < 26; i++)
       {
            if(Frequency[i] == 0)
            {
               System.out.println("String is not pangram");
               return;
            }
       }

        System.out.println("String is pangram");
    }

    public void OptimizedCode() //o(N),o(1)
    {
        int Frequency[] = new int[26];

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') //$
            {
                Frequency[ch - 'a']++;
            }
        }

        for(int i = 0; i < 26; i++)
        {
            if(Frequency[i] == 0)
            {
                System.out.println("Not Pangram");
                return;
            }
        }

        System.out.println("Pangram");
    }
}

class ChkStringPangram56_3
{
    public static void main(String A[])
    {
        String str = null;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        str = sobj.nextLine();

        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+"," ");
    
        Solution obj = new Solution(str);

        obj.StringPangram();

        //obj.OptimizedCode();
    }
}