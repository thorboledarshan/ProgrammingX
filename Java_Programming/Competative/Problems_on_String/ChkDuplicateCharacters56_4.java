/* 
4. Write a program to print duplicate characters from a string.

Description: Find and display characters that appear more than once.

Input Format: One string str
Output Format: Duplicate characters printed in one line.

Example:
Input: programming

Output: rgm
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

    public void PrintDuplicateCharacters() 
    {
        char StringArray[] = str.toCharArray();
        int iFreq[] = new int[26]; 

        int i = 0;

        for(i = 0; i < StringArray.length; i++)
        {
            int index = StringArray[i]-'a';

            if(index >=0 && index <=26)
            {
                iFreq[index]++;

                if(iFreq[index] > 1)
                {
                    System.out.print(StringArray[i]+"  ");
                }
            }
        }  
    }

    public void OptimizedCode() //o(N),o(1)
    {
       boolean bRet = false;

        char StringArray[] = str.toCharArray();

        HashSet <Character> duplicate = new HashSet<Character> ();

        for(char s : StringArray)
        {
            if((bRet = duplicate.add(s)) == false)
            {
                System.out.print(s+"  ");
            }
        } 
    }
}

class ChkDuplicateCharacters56_4
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

        obj.PrintDuplicateCharacters();

        //obj.OptimizedCode();
    }
}