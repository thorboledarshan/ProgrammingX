/* 
1. Extend the previous assignment to distinguish between files and directories.

Expected Output

[FILE] Demo.txt
[FILE] Student.txt
[FILE] Java.pdf
[DIR] Images
[DIR] Backup
For files, also display their sizes.

Example

[FILE ] Demo.txt 450 bytes
[FILE] Java. pdf 24500 bytes
[DIR ] Images

This assignment should help students understand how an FTP server generates a directory listing.
*/

import java.util.*;
import java.io.*;

class DisplayFiles63_1
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
                    if(fArr[i].isFile())
                    {
                        System.out.println("[FILE] "+fArr[i].getName()+" "+fArr[i].length()+" Bytes");
                    }
                    else 
                    {
                        System.out.println("[DIR] "+fArr[i].getName()+" ");
                    }
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