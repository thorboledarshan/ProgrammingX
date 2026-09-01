/* 
1. Write a program to check whether a given string is a Palindrome.
Description:
A string is called a Palindrome if it reads the same forward and backward.

Input Format: One string str

Output Format:
Print: Palindrome String OR Not Palindrome String

Example: madam
Output: Palindrome String
*/
import java.util.*;

class Solution
{
    private String str;

    private String rev;
    private char Arr[];

    public Solution(String a)
    {
        this.str = a;
        this.rev = "";  //IMP
    }

    public void StringPallindrome() // T = o(N) , S = o(N)
    {
        Arr = str.toCharArray();

        for(int i = (Arr.length) -1; i >=0 ; i--)
        {
            rev = rev + Arr[i];
        }

        String originalstring = new String(Arr);

        if(originalstring.equals(rev))
        {
            System.out.println("String is Pallindrome");
        }
        else 
        {
            System.out.println("String is not Pallindrome");
        }
    }

    public void OptimizedCode() // T = o(N) , S = o(1) (used two - pointer concept)
    {
        int iLeft = 0;
        int iRight = str.length() - 1;

        while(iLeft < iRight)
        {
            if(str.charAt(iLeft) != str.charAt(iRight))
            {
                System.out.println("String is not Palindrome");
                return;
            }

            iLeft++;
            iRight--;
        }

        System.out.println("String is Palindrome");
    }

    public void OptimizedCodeX() // T = o(N) , S = o(N) 
    {
        StringBuffer sb = new StringBuffer(str); //StringBuffer is mutable and contains inbuilt methods

        rev = sb.reverse().toString();

        if(str.equals(rev))
        {
            System.out.println("String is Pallindrome");
        }
        else 
        {
            System.out.println("String is not Pallindrome");
        }
    }
}

class ChkStringPallindrome56_1
{
    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        Solution obj = new Solution(str);

        obj.StringPallindrome();
        //obj.OptimizedCode();
    }
}