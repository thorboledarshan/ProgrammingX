/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.5. Write java program to accept directory name from user and display all
//     names of files from that directory and size of each file on screen.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void Display(String str) 
    {
        File fobj = new File(str);
        
        if(fobj.exists() != true)
        {
            System.out.println("Directory does not exist.");
            return;
        }

        if(fobj.isDirectory() != true)
        {
            System.out.println("It is not a directory.");
            return;
        }
        
        File Arr[] = fobj.listFiles();

        int i = 0;

        for (i = 0; i < Arr.length; i++)
        {
             if(Arr[i].isFile())
            {
                System.out.println("--------------------------------");
                System.out.println("File Name : " + Arr[i].getName());
                System.out.println("File Size : " + Arr[i].length() + " Bytes");
            }
        }
        
    }
}
class OpenFile46_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;

        System.out.println("Enter Directory Name : ");
        FileName = sobj.nextLine();

        obj.Display(FileName);

    }
}