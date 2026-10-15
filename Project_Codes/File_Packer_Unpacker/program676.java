import java.io.*;
import java.util.*;

class program676
{
    public static void main(String A[])
    {
       String Fname = null;
       Scanner sobj = new Scanner(System.in);

       File fobj = null;
       FileOutputStream foobj = null;
       String Data = "Marvellous Infosystem";


       System.out.println("Enter File Name : ");
       Fname = sobj.nextLine();

       fobj = new File(Fname);

       foobj = new FileOutputStream(fobj);

       byte Arr[] = Data.getBytes();

       if(fobj.exists())
       {
            foobj.write(Arr); 
       }
       else 
       {
        System.out.println("File does not  exists");
       }
 
    }
}