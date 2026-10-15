import java.io.*;
import java.util.*;

class program671
{
    public static void main(String A[])
    {
     String Fname= null;
       Scanner sobj = new Scanner(System.in);

       File fobj = null;

       System.out.println("Enter File Name : ");
       Fname = nextLine();

       fobj = new File(Fname);

       if(fobj.exists())
       {
            System.out.println("File Name : " + fobj.getName());
             System.out.println("File Path"+ fobj.getAbsolutePath);
              System.out.println("File Size"+ fobj.length());
       }
       else 
       {
        System.out.println("File already exists");
       }
 
    }
}