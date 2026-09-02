/* 
5. Write a program to check whether one string is rotation of another.

Description: String B is rotation of String A if it can be obtained by shifting characters.

Input Format: String1 ,String2

Output Format:
Rotation
OR
Not Rotation

Example:
Input: abcd ,cdab

Output: Rotation
*/
import java.util.*;

class Solution
{
    private String str1;
    private String str2;
        
    private char Arr[];
    
    public Solution(String a, String b)
    {
        this.str1 = a; 
        this.str2 = b;
    }

    public void ChkStringRotation() 
    {
        if(str1.length() != str2.length())
        {
            System.out.println("No Rotation");
            return;
        }

        String temp = str1 + str1;

        if(temp.contains(str2))
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }
        
    }

    public void OptimizedCode() 
    {
       
    }
}

class ChkStringRotation57_5
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

        obj.ChkStringRotation();

        //obj.OptimizedCode();
    }
}