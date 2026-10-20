import java.io.*;
import java.util.*;

class program729
{
    public static void main(String A[]) throws IOException
    {
      Scanner sobj = new Scanner(System.in);
      File fpackobj = null;
      String PackFileName = null;
      String strHeader = null;
      FileInputStream fiobj = null;
      FileOutputStream foobj = null;

      byte Header[] = new byte[100];

      System.out.println("Enter the name of packed file : ");
      PackFileName = sobj.nextLine();

      fpackobj = new File(PackFileName);

      if(fpackobj.exists())
      {
         fiobj = new FileInputStream(fpackobj);

         fiobj.read(Header,0,100);

         strHeader = new String(Header);

         System.out.println("header is : "+strHeader);
      }
      else 
      {
         System.out.println("There is no such file");
      }

      

    }
}