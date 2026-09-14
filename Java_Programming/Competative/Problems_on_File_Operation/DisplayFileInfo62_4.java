/* 
4. Write a Java application that accepts a filename and displays detailed information about that file.

Expected Output

File Name 
Absolute Path
File Size
Readable
Writable
Hidden
Last Modified
Requirements

Use the File class.

If the file does not exist, display an appropriate message.



import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

class DisplayFileInfo
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        File file = null;

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        file = new File(FileName);

        if(file.exists())
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

            System.out.println("File Name : "+file.getName());
            System.out.println("Absolute Path : "+file.getAbsolutePath());
            System.out.println("File Size : "+file.length()+" Bytes");
            System.out.println("Readable : "+file.canRead());
            System.out.println("Writable : "+file.canWrite());
            System.out.println("Hidden : "+file.isHidden());
            System.out.println("Last Modified : "+sdf.format(file.lastModified()));
        }
        else
        {
            System.out.println("File does not exists");
        }

        sobj.close();
    }
}

*/

import java.util.*;
import java.io.*;

class DisplayFileInfo62_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        FileInputStream  fisobj = null;
        File file = null;
        int iRet = 0;
        int iSum = 0;

        try
        {
            System.out.println("Enter file name : ");
            String FileName = sobj.nextLine();

            file = new File(FileName);

            if(file.exists())
            {
                fisobj = new FileInputStream(file);

                byte buffer[] = new byte[1024]; 

                while((iRet = fisobj.read(buffer))!= -1)
                {
                    iSum = iSum + iRet; 
                }

                System.out.println("File Name : "+FileName);
                System.out.println("Absolute Path : "+file.getAbsolutePath());
                System.out.println("FileSize : "+iSum+" Bytes");
                System.out.println("Readable : "+file.canRead());
                System.out.println("Writable : "+file.canWrite());
                System.out.println("Hidden : "+file.isHidden());
                System.out.println("Last modified : "+new Date(file.lastModified()));

                fisobj.close();
            }
            else 
            {
                System.out.println("File does not exists");
            }

            sobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}