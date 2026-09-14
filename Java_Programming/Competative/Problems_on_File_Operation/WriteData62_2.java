/* 
1. Write a Java program that accepts a filename and textual data from the user and stores that data inside the specified file.

Example

Enter file name:
Demo.txt

Enter data:
Marvellous Infosystems Pune

Data written successfully
Requirements

Use:
FileOutputStream

Do not use higher-level utility functions for writing the complete file.

*/

import java.util.*;
import java.io.*;

class WriteData62_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        FileOutputStream  fwobj = null;

        try
        {
            System.out.println("Enter file name : ");
            String FileName = sobj.nextLine();

            System.out.println("Enter data : ");
            String Data = sobj.nextLine();

            fwobj = new FileOutputStream(FileName);  //operates on raw bytes not string

            byte[] buffer = Data.getBytes(); //extract each character byte from data

            fwobj.write(buffer);

            System.out.println("Data written successfully");

            fwobj.close();
            sobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
                
    }
}