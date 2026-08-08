/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q.Write java program to accept file name from user and create new file of
//  that name if it is not existing.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void CreateFile(String str) 
    {

        try
        {
            File fobj = new File(str);

            if(fobj.exists())
            {
                System.out.println("File already exists"); 
            }
            else 
            {
                //Creates new file and return value is boolean(true/false)
                
                if(fobj.createNewFile())
                {
                    System.out.println("File created successfully.");
                }
                else
                {
                    System.out.println("Unable to create file.");
                }
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Unable to create File.");
        }

    }
}
class OpenFile45_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;
        

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

       

        obj.CreateFile(FileName);

    }
}