/* 
2. Write a program to check whether two strings are Anagrams.

Description: Two strings are Anagrams if they contain the same characters with the same frequency, regardless of order.

Input Format:
First string str1
Second string str2

Example:
Input: listen , silent
Output Format: Anagram OR Not Anagram
*/
import java.util.*;

class Solution
{
    private String str1;
    private String str2;

    private String rev;
    private char Arr[];
    private char Brr[];

    public Solution(String a, String b)
    {
        this.str1 = a;
        this.str2 = b;
        this.rev = "";  
    }

    public void StringsAnagram() 
    {
        Arr = str1.toCharArray();
        Brr = str2.toCharArray();

        int Frequency[] = new int[26];

        if(Arr.length != Brr.length)
        {
            System.out.println("String is not Anagram (length)");
            return;
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]++;
            }

            if(Brr[i] >= 'a' && Brr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]--;
            }
        }

        boolean bFlag = true;

        for(i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] != 0) //$
            {
                bFlag = false;
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println("String is Anagram");
        }
        else 
        {
            System.out.println("String is not Anagram");
        }
    }

    public void OptimizedCode() 
    {
        
        if(str1.length() != str2.length())
        {
            System.out.println("String is not Anagram");
            return;
        }

        int Frequency[] = new int[26];

        for(int i = 0; i < str1.length(); i++)
        {
            Frequency[str1.charAt(i) - 'a']++; //$  (charAt internal treat as ascii value)
            Frequency[str2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < Frequency.length; i++)
        {
            if(Frequency[i] != 0)
            {
                System.out.println("String is not Anagram");
                return;
            }
        }

        System.out.println("String is Anagram");
    }
}

class ChkTwoStringAnagram56_2
{
    public static void main(String A[])
    {
        String str1 = null;
        String str2 = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string : ");
        str1 = sobj.nextLine();

        System.out.println("Enter second string : ");
        str2 = sobj.nextLine();

        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        Solution obj = new Solution(str1,str2);

        obj.StringsAnagram();

        //obj.OptimizedCode();
    }
}