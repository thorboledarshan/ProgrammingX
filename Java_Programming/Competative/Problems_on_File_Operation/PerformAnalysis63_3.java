/* 
3. Write a Java application that accepts the name of a text file and performs analysis on its contents.

Calculate:

Total characters
Total words
Total lines
Uppercase characters
Lowercase characters
Digits
Spaces

Example

File : Demo.txt

Characters : 250
Words : 45
Lines ; 10
Uppercase : 15
Lowercase : 180
Digits  : 10
Spaces : 35
*/

import java.util.*;
import java.io.*;

class PerformAnalysis63_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        BufferedReader  readerobj = null;
        FileReader file = null;

        int totalCharacters = 0;
        int totalwords = 0;
        int totallines = 0;
        int Uppercasecharacters = 0;
        int Lowercasecharacters = 0;
        int Digits = 0;
        int Spaces = 0;

        try
        {
            System.out.println("Enter text file name : ");
            String FileName = sobj.nextLine();

            file = new FileReader(FileName);

            readerobj = new BufferedReader(file);

            String line = null;

            while((line = readerobj.readLine()) != null)
            {
                totallines++;

                StringTokenizer tokens = new StringTokenizer(line);

                totalwords = totalwords + tokens.countTokens();

                char cArr[] = line.toCharArray();

                for(int i = 0; i < cArr.length;i++)
                {
                    char ch = cArr[i];

                    totalCharacters++;

                    if(Character.isUpperCase(ch))
                    {
                        Uppercasecharacters++;
                    }
                    else if(Character.isLowerCase(ch))
                    {
                        Lowercasecharacters++;
                    }
                    else if(Character.isDigit(ch))
                    {
                        Digits++;
                    }
                    else if(ch == ' ')
                    {
                        Spaces++;
                    }
                }
            }
            
            System.out.println("Characters : "+totalCharacters);
            System.out.println("Words : "+totalwords);
            System.out.println("Lines : "+totallines);
            System.out.println("Uppercase : "+Uppercasecharacters);
            System.out.println("Lowercase : "+Lowercasecharacters);
            System.out.println("Digits : "+Digits);
            System.out.println("Spaces : "+Spaces);

            readerobj.close();
            sobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}