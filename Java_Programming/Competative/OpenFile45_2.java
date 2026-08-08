/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write java program to accept file name from user and open that file and
//  display the contents on screen.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void Display(String str) 
    {
        int iRet = 0;
        int i = 0;

        try
        {
            FileInputStream fisobj = new FileInputStream(str);   //always use to open file

            while((i = fisobj.read()) != -1)
            {
                System.out.print((char)i);
            }
    
            fisobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Unable to open File.");
        }

    }
}
class OpenFile45_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        obj.Display(FileName);

    }
}