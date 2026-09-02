/* 
1. Write a program to reverse each word of a sentence.

Description: Reverse individual words but keep word order same.

Input Format: One sentence

Output Format: Sentence with reversed words

Example:
Input: Java is powerful

Output: avaJ si lufrewop
*/
import java.util.*;

class Solution
{
    private String str;

    private String rev;
    private String Tokens[];

    public Solution(String a)
    {
        this.str = a;
        this.rev = "";  
    }

    public void ReverseWord() 
    {
        Tokens = str.split(" ");

        for(int i = 0; i < Tokens.length; i++)
        {
            StringBuilder sb = new StringBuilder(Tokens[i]); //StringBuilder returns object

            rev = rev + (sb.reverse().toString());

            rev = rev + " ";
        }

        rev = rev.trim();
        System.out.println(rev);

    }

    public void OptimizedCode()  
    {
        Tokens = str.split(" ");

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < Tokens.length; i++)
        {
            StringBuilder sb = new StringBuilder(Tokens[i]);

            result.append(sb.reverse());

            if(i < Tokens.length - 1)
            {
                result.append(" ");
            }
        }

        System.out.println(result);        
    }
}

class ReverseEachWord57_1
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        str.trim();
        str.replaceAll("\\s+"," ");

        Solution obj = new Solution(str);

        //obj.ReverseWord();
        obj.OptimizedCode();
    }
}