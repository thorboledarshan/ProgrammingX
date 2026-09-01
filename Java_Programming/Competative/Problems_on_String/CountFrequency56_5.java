/* 
5. Write a program to count frequency of each character.

Description: Display each character along with its count.

Input Format: One string str

Example:
Input: hello
Output:
h- 1
e- 1
1- 2
0 -1

Output Format: Character - Count


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

    public void CountFrequencyCharacters() 
    {
        char StringArray[] = str.toCharArray();

        int iFreq[] = new int[26]; 

        int i = 0;
        int index = 0;

        for(i = 0; i < StringArray.length; i++)
        {
            index = StringArray[i]-'a';

            if(index >=0 && index <=26)
            {
                iFreq[index]++;
            }
        }  

        for(i = 0; i < StringArray.length; i++)
        {
            index = StringArray[i] - 'a';
        
            if (iFreq[index] > 0)
            {
                System.out.println(StringArray[i] + " - " + iFreq[index]);

                iFreq[index] = 0; 
            }
            
        }

    }

    public void OptimizedCode() 
    {
        LinkedHashMap <Character , Integer> frequency = new LinkedHashMap <Character , Integer> ();

        for(char c : str.toCharArray())
        {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for(char c : frequency.keySet())
        {
            System.out.println(c +"-"+ frequency.get(c));
        }
         
    }
}

class CountFrequency56_5
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

        obj.CountFrequencyCharacters();

        //obj.OptimizedCode();
    }
}