/* 
2. Write a program to find the longest word in a sentence.

Description: Identify the word having maximum length.

Input Format: One sentence

Output Format: Longest word

Example:
Input: Marvellous Infosystems Pune

Output: Infosystems


*/
import java.util.*;

class Solution
{
    private String str;
    
    public Solution(String a)
    {
        this.str = a; 
    }

    public void FindLongestWord() 
    {
        String StringArray[] = str.split(" ");

        int iMax = 0; 

        int i = 0;

        for(i = 0; i < StringArray.length; i++)
        {
           if(StringArray[i].length() >= StringArray[iMax].length())
           {
                iMax = i;
           }
        }  

        System.out.println("Longest word : "+StringArray[iMax]);

    }

    public void OptimizedCode() 
    {
        //no need to optimize
    }
}

class FindLongestWord57_2
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

        obj.FindLongestWord();

        //obj.OptimizedCode();
    }
}