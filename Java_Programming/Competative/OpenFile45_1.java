/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write java program to accept file name from user and open that file.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void OpenFile(String str) 
    {
        try
        {
            FileInputStream fisobj = new FileInputStream(str);

            System.out.println("File opened successfully.");
            
            fisobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to open File.");
        }

    }
}
class OpenFile45_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        obj.OpenFile(FileName);

    }
}