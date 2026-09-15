/* 
2. Write a Java program that accepts a directory path and a filename from the user.

Search for the specified file inside the directory.

Example

Enter directory:
ServerData

Enter file to search:
Demo.txt

File found

Name : Demo.txt
Size : 2450 bytes
Path : /ServerData/Demo.txt
If unavailable:

Demo.txt not found
*/

import java.util.*;
import java.io.*;

class SearchFiles63_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        File file = null;
        
        try
        {
            System.out.println("Enter folder name : ");
            String foldername = sobj.nextLine();

            System.out.println("Enter file name to search : ");
            String SearchFile = sobj.nextLine();

            file = new File(foldername);

            if(file.isDirectory())
            {

                File fArr[] = file.listFiles();
                boolean bFlag = false;

                for(int i = 0; i < fArr.length; i++)
                {
                    if(fArr[i].isFile())
                    {
                        String str = fArr[i].getName();
                        

                        if(str.equalsIgnoreCase(SearchFile))
                        {
                            System.out.println("File found");
                            System.out.println("Name : "+SearchFile);
                            System.out.println("Size : "+fArr[i].length()+" Bytes");
                            System.out.println("Path : "+fArr[i].getPath());

                            bFlag = true;
                            break;
                        }
                                             
                    }                   
                }

                if(bFlag != true)
                {
                    System.out.println(SearchFile+" not found");
                }           
            }
            else 
            {
                System.out.println("directory does not exists");
            }

            sobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }
}