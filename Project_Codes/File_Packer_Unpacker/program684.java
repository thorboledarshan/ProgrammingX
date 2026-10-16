import java.io.*;
import java.util.*;

class program684
{
    public static void main(String A[]) throws IOException
    {
       String FnameSrc = null;
       String FnameDest = null;

       int iRet = 0;

       File fobjsrc = null;
       File fobjdest = null;

       FileInputStream fiobj = null;
       FileOutputStream foobj = null;

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter Source  File Name : ");
       FnameSrc =sobj.nextLine();

       System.out.println("Enter Destination  File Name : ");
       FnameDest =sobj.nextLine();

       fobjsrc = new File(FnameSrc);
       fobjdest = new File(FnameDest);

       fiobj = new FileInputStream(fobjsrc);

       foobj = new FileOutputStream(fobjdest);
      
       fobjdest.createNewFile();    

       byte Buffer[] = new byte[1024];

       if(fobjsrc.exists())
       {
         while((iRet = fiobj.read(Buffer)) !=-1)
         {
            foobj.write(Buffer,0,iRet);
         }
         foobj.close();
         fiobj.close();

       }
       else 
       {
        System.out.println("File does not  exists");
       }
 
    }
}