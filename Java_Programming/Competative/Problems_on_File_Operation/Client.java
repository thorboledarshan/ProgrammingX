import java.io.*;
import java.net.*;
import java.util.*;

class Server
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try 
        {
            System.out.println("Client started");

            Socket socket = new Socket("127.0.0.1",9000);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos  = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            System.out.println("Enter command -> INFO <FileName> : ");
            String command = sobj.nextLine();

            dos.writeUTF(command);

            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF());

            sobj.close();
            socket.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
