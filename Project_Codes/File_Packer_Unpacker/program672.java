import java.io.*;
import java.util.*;

class program672
{
    public static void main(String A[])
    {
       String Fname= null;
       Scanner sobj = new Scanner(System.in);

       File fobj = null;
       FileOutputStream foobj = null;
       String Data = "Marvellous Infosystem";


       System.out.println("Enter File Name : ");
       Fname = nextLine();

       fobj = new File(Fname);

       foobj = new FileOutputStream(fobj);

       if(fobj.exists())
       {
            foobj.write(Data); //Error
       }
       else 
       {
        System.out.println("File already exists");
       }
 
    }
}