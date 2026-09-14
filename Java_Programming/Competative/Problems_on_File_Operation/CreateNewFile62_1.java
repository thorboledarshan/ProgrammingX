/* 
3. Write a Java program that accepts a filename from the user and creates a new file on the local machine.

Example

Enter file name:
Demo.txt

Demo.txt created successfully
If the file already exists:

Demo.txt already exists
Requirements

Display:
File name
Absolute path
Whether file creation was successful

Use the File class.
*/

import java.util.*;
import java.io.*;

class CreateNewFile62_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try 
        {        
            boolean bFlag = false;

            System.out.println("Enter file name : ");

            String FileName = sobj.next();

            FileName = FileName.trim().replaceAll("\\s+"," ");

            File fobj = new File(FileName);

            if(fobj.exists())
            {
                System.out.println(FileName+" already exists");
            }
            else 
            {
                bFlag = true;
                fobj.createNewFile();
                System.out.println(FileName+" created successfully");
            }

            System.out.println("File Name : "+FileName);
            System.out.println("Absolute path : "+fobj.getAbsolutePath());
            
            if(bFlag == true)
            {
                System.out.println("File creation was successful");
            }
            else 
            {
                System.out.println("File creation was not successful");
            }
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }

        sobj.close();
        
    }
}