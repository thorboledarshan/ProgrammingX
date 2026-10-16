import java.io.*;
import java.util.*;

class program681
{
    public static void main(String A[]) throws IOException
    {
       String Fname = null;
       int iRet = 0;
       Scanner sobj = new Scanner(System.in);

       File fobj = null;
       FileOutputStream foobj = null;
       FileInputStream fiobj = null;

       String Data = "Marvellous Infosystem";


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
            str = new String(Buffer);

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