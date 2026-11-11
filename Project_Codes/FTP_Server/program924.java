import java.io.*;
import java.net.*;

class program924
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket  = new ServerSocket(9000);  //port number

            System.out.println("-------------------------------------");
            System.out.println("-----Marvellous Server Started ------");
            System.out.println("-------------------------------------");

            //Loop for multiple client request
            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept(); //binding of client and server

                System.out.println("Client connected successfully");

                //Thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clientsocket));

                t.start();
            } //End of while loop

        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    } //End of main

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server");

            while(true)
            {
                String command = dis.readUTF(); //unicode text format

                System.out.println("command received from client : "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equalsIgnoreCase("Quit"))
                {
                    dos.writeUTF("Disconnected from server ");
                    break;
                }

                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);

                double result = 0.0;

                if(operation.equalsIgnoreCase("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equalsIgnoreCase("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equalsIgnoreCase("MUL"))
                {
                    result = no1 * no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equalsIgnoreCase("DIV"))
                {
                    result = no1 / no2;

                    dos.writeUTF("Result is : "+result);
                }
                else 
                {
                    dos.writeUTF("Invalid operation");
                }

            } //End of while 

            socket.close();

            System.out.println("Client disconnected");

        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
    }

} //End of class