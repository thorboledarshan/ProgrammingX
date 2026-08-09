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
    public void RegularFile(String str) 
    {
        File fobj = new File(str);
        
        if(fobj.exists() != true)
        {
            System.out.println("File does not exist.");
            return;
        }
        
        if(fobj.isFile())
        {
            System.out.println("It is regualar file.");
        }
        else 
        {
            System.out.println("It is not regualar file."); 
        }
    }
}
class OpenFile46_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        obj.RegularFile(FileName);

    }
}