import java.io.*;
import java.util.*;

class program683
{
    public static void main(String A[]) throws IOException
    {
       String Fname = null;
       int iRet = 0;
       Scanner sobj = new Scanner(System.in);

       File fobj = null;
      
       FileInputStream fiobj = null;

       System.out.println("Enter File Name : ");
       Fname =sobj.nextLine();

       fobj = new File(Fname);

       fiobj = new FileInputStream(fobj);

       byte Buffer[] = new byte[50];

       if(fobj.exists())
       {
          String str = null;

          while((iRet = fiobj.read(Buffer)) != -1)
          {
            str = new String(Buffer,0,iRet);  //IMP (reads data and directly prints on console from buffer)

            System.out.print(str);

            str = null;
          }
       }
       else 
       {
        System.out.println("File does not  exists");
       }
 
    }
}