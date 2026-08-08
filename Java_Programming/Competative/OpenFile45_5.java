/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.5. Write java program to accept directory name from user and display all
//     names of files from that directory.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void DisplayFile(String str) 
    {

        try
        {
            File fobj = new File(str);

            if(fobj.isDirectory() != true)
            {
                System.out.println("Given File Name is not directory");

                System.out.println("Given File Path ->"+fobj.getAbsolutePath());
                 
            }
            else 
            {
                int i = 0;

                File Arr[] = fobj.listFiles();

                for(i = 0; i < Arr.length; i++)
                {
                    System.out.println(Arr[i].getName());
                }
                
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Unable to create File.");
        }

    }
}
class OpenFile45_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String DirectoryName = null;
        
        System.out.println("Enter Directory Name : ");
        DirectoryName = sobj.nextLine();

        obj.DisplayFile(DirectoryName);

    }
}