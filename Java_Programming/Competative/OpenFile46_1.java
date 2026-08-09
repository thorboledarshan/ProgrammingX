/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q. Write java program to accept two file names from user and open first
//   file and create new file (Second name) and copy the data from first file into newly created file.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void CopyFile(String src,String dest) 
    {

        try
        {
           FileInputStream fisobj = new FileInputStream(src);
           FileOutputStream fosobj = new FileOutputStream(dest);

           byte Buffer[] = new byte[1024];
           int iRet = 0;

           while((iRet = fisobj.read(Buffer)) != -1) // -1 indicates end of file
           {
                fosobj.write(Buffer,0,iRet);
           }

           fosobj.close();
           fisobj.close();

           System.out.println("File copied successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Unable to copy File.");
        }

    }
}
class OpenFile46_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String SourceFileName = null;
        String DestinationFileName = null;
        
        System.out.println("Enter Source File Name : ");
        SourceFileName = sobj.nextLine();

        System.out.println("Enter Destination File Name : ");
        DestinationFileName = sobj.nextLine();

        obj.CopyFile(SourceFileName,DestinationFileName);

    }
}