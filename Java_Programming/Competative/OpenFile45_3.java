/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.3. Write java program to accept file name from user and open that file in
//     write mode and write some data at the end of file.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void WriteFile(String str, String Data) 
    {
        

        try
        {
            FileOutputStream fisobj = new FileOutputStream(str,true);   //always use to open file

            //convert string into byte array
            byte Arr[] = Data.getBytes();

            //write data into file
            fisobj.write(Arr);

            //close written file
            fisobj.close();

            System.out.println("Data written Successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Unable to open File.");
        }

    }
}
class OpenFile45_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;
        String Data = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter Data : ");
        Data = sobj.nextLine();

        obj.WriteFile(FileName,Data);

    }
}