import java.io.*;

class program661
{
    public static void main(String A[]) 
    {
        File fobj = null;
        boolean bRet = false;

        try
        {
            fobj = new File("Demo.txt");

            bRet = fobj.exists(); 
            
            if(bRet == true)
            {
                fobj.delete();  //$

                System.out.println("File gets deleted");
            }
            else 
            {
                System.out.println("File does not exists");
            }
            
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }    }
}