/* 
5. Write a Java application that accepts the path of a directory and displays all files and directories present inside it.

Example

Enter directory:
Marvellous

Contents:

Demo.txt
Student.txt
Java.pdf
Images
Backup
Requirements

Check whether the supplied path: Exists

Is actually a directory

Display all its contents.


*/

import java.util.*;
import java.io.*;

class DisplayDirectorysFiles62_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        File file = null;
        
        try
        {
            System.out.println("Enter folder name : ");
            String foldername = sobj.nextLine();

            file = new File(foldername);

            if(file.isDirectory())
            {

                File fArr[] = file.listFiles();

                for(int i = 0; i < fArr.length; i++)
                {
                    System.out.println(fArr[i].getName());
                    System.out.println(fArr[i].getName());

                }

            }
            else 
            {
                System.out.println("directory does not exists");
            }

            sobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}