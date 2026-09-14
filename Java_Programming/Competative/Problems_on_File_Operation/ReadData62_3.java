/* 
2. Write a Java application that accepts a filename from the user and displays the complete contents of that file.

Example

Assume Demo. txt contains:

Marvellous Infosystems
Logic Building Batch
Pune
Output:

Enter file name:
Demo.txt

File contents:

Marvellous Infosystems
Logic Building Batch
Pune
Requirements

Use FileInputStream.

Display an appropriate error message if the specified file does not exist.
*/

import java.util.*;
import java.io.*;

class ReadData62_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        FileInputStream  fisobj = null;
        File file = null;
        int iRet = 0;

        try
        {
            System.out.println("Enter file name : ");
            String FileName = sobj.nextLine();

            file = new File(FileName);            
            fisobj = new FileInputStream(file);  //operates on raw bytes not string

            byte buffer[] = new byte[1024]; 

            if(file.exists())
            {
                String str = null;

                while((iRet = fisobj.read(buffer))!= -1)
                {
                    str = new String(buffer,0,iRet);

                    System.out.print(str);

                    str = null;
                }
            }
            else 
            {
                System.out.println("File does not exists");
            }

            sobj.close();
            fisobj.close();
           
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
                
    }
}