import java.io.*;
import java.util.*;

class program690
{
    public static void main(String A[]) throws IOException
    {
      Scanner sobj = new Scanner(System.in);
      String FolderName = null;
      String PackFileName = null;


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
         
         File fArr[] = fobjFolder.listFiles();

         System.out.println("number of files in folder : "+fArr.length);

         for(int i = 0; i < fArr.length; i++)
         {
            //Logic
         }
      }
      else 
      {
         System.out.println("There is no such folder");
      }
      
    }
}