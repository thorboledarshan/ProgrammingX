/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//5. Write java program to accept directory name from user and write data
//of all files along with its name & size of each file into one newly created file named as "Marvellous.txt".
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
            int iRet = 0;

            byte Buffer[] = new byte[1024]; 

            for (i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())  //Regular files only
                {
    
                    String Header = "File Name : "+Arr[i].getName() + "\n"; //stores name of file

                    Header += "File Size : " + Arr[i].length() + " Bytes\n";
                    Header += "--------------------------------\n";
                    
                    fosobj.write(Header.getBytes()); //IMP

                    FileInputStream fisobj = new FileInputStream(Arr[i]);

                    while((iRet = fisobj.read(Buffer)) != -1)
                    {
                        fosobj.write(Buffer,0,iRet); //kashyat,kutun,kiti
                    }

                    // Optional: Separate contents of files
                    fosobj.write("\n".getBytes());

                    fisobj.close();
                }
            }

            fosobj.close();

            System.out.println("File Contains copied successfully into Marvellous.txt");

        }
        catch(Exception e)
        {
            System.out.println("Unable to perform operation on file");
        }
        
    }
}

class OpenFile47_5
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