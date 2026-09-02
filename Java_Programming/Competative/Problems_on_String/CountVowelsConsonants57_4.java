/* 
4. Write a program to count vowels and consonants in a string.

Description: Count total vowels (a,e,i,o,u) and consonants separately.

Input Format: One string

Output Format:
Vowels: <count>
Consonants: <count>

Example:
Input: education
Output:
Vowels: 5
Consonants: 4

*/
import java.util.*;

class Solution
{
    private String str;
    
    public Solution(String a)
    {
        this.str = a; 
    }

    public void CountVowelsAndConsonants() 
    {
        str = str.toLowerCase();
        int iVowels = 0;
        int iConsonant = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);

            if(c >='a' && c <='z')
            {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                {
                    iVowels++;
                }
                else 
                {
                    iConsonant++;
                }
            }
        }  

        System.out.println("Vowels : "+iVowels);
        System.out.println("Consonants : "+iConsonant);

    }

    public void OptimizedCode() 
    {
       // no need to optimize
    }
}

class CountVowelsConsonants57_4
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

        obj.CountVowelsAndConsonants();

        //obj.OptimizedCode();
    }
}