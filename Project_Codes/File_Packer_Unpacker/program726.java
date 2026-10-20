import java.io.*;
import java.util.*;

class program726
{
    public static void main(String A[]) throws IOException
    {
      int iRet = 0;
      int size = 0;
      int i = 0;
      int j = 0;

      Scanner sobj = new Scanner(System.in);

      String FolderName = null;
      String PackFileName = null;
      String header = "";

      byte Buffer[] = new byte[1024];
      byte bHeader[] = null;
      

      FileOutputStream foobj = null;
      FileInputStream fiobj = null;

      System.out.println("Enter folder name : ");
      FolderName = sobj.nextLine();

      System.out.println("Enter the name of packing file : ");
      PackFileName = sobj.nextLine();

      File fobjFolder = new File(FolderName);


      if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
      {
         
         System.out.println("Folder exists");

         File fobjpack = new File(PackFileName);
         fobjpack.createNewFile();

         foobj = new FileOutputStream(fobjpack);
         
         File fArr[] = fobjFolder.listFiles();

         System.out.println("number of files in folder : "+fArr.length);


         for(i = 0; i < fArr.length; i++)
         {
            fiobj = new FileInputStream(fArr[i]);

            //write file name and size.(header)
            header = header + fArr[i].getName();
            header = header + " ";
            header = header + fArr[i].length();


            size = 100 - header.length();

            for(j = 1; j <= size; j++)
            {
               header = header + " ";
            }

            bHeader = header.getBytes();

            System.out.println(bHeader.length);


            /*
            //loop to read form fiobj nd write in foobj
            while((iRet = fiobj.read(Buffer)) != -1)
            {
               foobj.write(Buffer,0,iRet);
            }
            */

            fiobj.close();
            header = "";

         }

         foobj.close();
         sobj.close();
      }
      else 
      {
         System.out.println("There is no such folder");
      }
      
    }
}