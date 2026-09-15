import java.io.*;
import java.net.*;
import java.util.*;

class Server
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("Server started");

            Socket cliensocket = serversocket.accept();

            HandleRequest(cliensocket);


        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
    }

    public static void HandleRequest(Socket socket)
    {
        FileInputStream  fisobj = null;
        File file = null;
        int iRet = 0;
        int iSum = 0;

        try 
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to server");

            String command = dis.readUTF();

            System.out.println("Command received from client : "+command);

            String parts[] = command.trim().split(" ");

            String filename = parts[1];

            file = new File(filename);

            if(file.exists())
            {
                fisobj = new FileInputStream(file);

                byte buffer[] = new byte[1024]; 

                while((iRet = fisobj.read(buffer))!= -1)
                {
                    iSum = iSum + iRet; 
                }

                dos.writeUTF("File Name : "+filename);
                dos.writeUTF("Absolute Path : "+file.getAbsolutePath());
                dos.writeUTF("FileSize : "+iSum+" Bytes");
                dos.writeUTF("Readable : "+file.canRead());
                dos.writeUTF("Writable : "+file.canWrite());
                dos.writeUTF("Last modified : "+new Date(file.lastModified()));

                fisobj.close();
            }
            else 
            {
                System.out.println("File does not exists");
            }


        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
