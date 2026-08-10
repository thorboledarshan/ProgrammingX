/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q. Write java program to accept directory name from user and write names
//   of all files from that directory into one newly created file named as "Marvellous.txt".
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void CopyData(String str) 
    {
        try 
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
            
            File Arr[] = fobj.listFiles(); //All files including (files+directories)

            FileOutputStream fosobj = new FileOutputStream("Marvellous.txt");

            int i = 0;

            for (i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())  //Regular files only
                {
                    String Data = Arr[i].getName() + "\n"; //stores name of file in Data
                    
                    fosobj.write(Data.getBytes());  // (getBytes)converts the String into a byte array.
                }
            }

            fosobj.close();
            System.out.println("File names copied successfully into Marvellous.txt");

        }
        catch(Exception e)
        {
            System.out.println("Unable to perform operation on file");
        }
        
    }
}

class OpenFile47_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;

        System.out.println("Enter Directory Name : ");
        FileName = sobj.nextLine();

        obj.CopyData(FileName);

    }
}