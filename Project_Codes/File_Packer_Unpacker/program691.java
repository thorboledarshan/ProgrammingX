import java.io.*;
import java.util.*;

class program691
{
    public static void main(String A[]) throws IOException
    {
      Scanner sobj = new Scanner(System.in);
      String FolderName = null;
      String PackFileName = null;
      int iRet = 0;

      FileOutputStream foobj = null;
      FileInputStream fiobj = null;

      System.out.println("Enter folder name : ");
      FolderName = sobj.nextLine();

      System.out.println("Enter the name of packed file : ");
      PackFileName = sobj.nextLine();

      File fobjFolder = new File(FolderName);

      if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
      {
         
         System.out.println("Folder exists");

         File fobjpack = new File(PackFileName);
         fobjpack.createNewFile();

         foobj = new FileOutputStream(fobjpack);
         
         File fArr[] = fobjFolder.listFiles();

         byte Buffer[] = new byte[1024];

         System.out.println("number of files in folder : "+fArr.length);

         for(int i = 0; i < fArr.length; i++)
         {
            fiobj = new FileInputStream(fArr[i]);

            //loop to read form fiobj and write in foobj
            while((iRet = fiobj.read(Buffer)) != -1)
            {
               foobj.write(Buffer,0,iRet);
            }

         }
      }
      else 
      {
         System.out.println("There is no such folder");
      }
      
    }
}