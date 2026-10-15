import java.io.*;
import java.util.*;

class program679
{
    public static void main(String A[]) throws IOException
    {
       String Fname = null;
       Scanner sobj = new Scanner(System.in);

       File fobj = null;
       FileOutputStream foobj = null;
       FileInputStream fiobj = null;

       String Data = "Marvellous Infosystem";


       System.out.println("Enter File Name : ");
       Fname =sobj.nextLine();

       fobj = new File(Fname);

       fiobj = new FileInputStream(fobj);

       byte Arr[] = new byte[50];

       if(fobj.exists())
       {
            fiobj.read(Arr);

            String str = new String(Arr);
            System.out.println(str); 
       }
       else 
       {
        System.out.println("File does not  exists");
       }
 
    }
}