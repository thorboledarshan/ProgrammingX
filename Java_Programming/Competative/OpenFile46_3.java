/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q. Write java program to accept file name from user and check whether
//   that file is regular file or not ..
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void CreateDirectory(String str) 
    {
        File fobj = new File(str);
        
        if(fobj.isDirectory() == true)
        {
            System.out.println("Directory already exists.");
            return;
        }
        else 
        {
            //craetes Directory
            if(fobj.mkdir())
            {
                System.out.println("Directory created successfully.");
                System.out.println("Directory path ->"+fobj.getAbsolutePath());
            }
            else 
            {
                System.out.println("Unable to create directory."); 
            }
        }
    }
}
class OpenFile46_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        obj.CreateDirectory(FileName);

    }
}