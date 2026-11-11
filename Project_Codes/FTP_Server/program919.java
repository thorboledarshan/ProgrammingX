import java.io.*;
import java.net.*;
import java.util.*;

class program919
{
    public static void main(String A[])
    {
        try
        {
            System.out.println("-------------------------------------");
            System.out.println("---- Marvellous Client Started ------");
            System.out.println("-------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",  //ip address
                                        9000
                                      );
            
            System.out.println("Connection with server is successfully");


        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    }
}