import java.io.*;
import java.net.*;

class program927
{
    public static int ClientCount = 1;

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
        System.out.println("New thread gets created for client no : "+ClientCount);
        ClientCount++;

        //Request handler for each clients request
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server");

            while(true)
            {
                //Reads command from client
                String command = dis.readUTF(); 

                System.out.println("command received from client : "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equalsIgnoreCase("Quit"))
                {
                    if(parts.length != 1)
                    {
                        dos.writeUTF("Usage : QUIT");
                        continue;
                    }

                    dos.writeUTF("Disconnected from server ");
                    ClientCount--;
                    
                    break;
                }

                if(operation.equalsIgnoreCase("GET"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : GET <FileName>");
                        continue;
                    }
                }
                else if(operation.equalsIgnoreCase("PUT"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : PUT <FileName>");
                        continue;
                    }
                }
                else if(operation.equalsIgnoreCase("INFO"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : INFO <FileName>");
                        continue;
                    }
                }
                else if(operation.equalsIgnoreCase("SIZE"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : SIZE <FileName>");
                        continue;
                    }
                }
                else if(operation.equalsIgnoreCase("EXISTS"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : EXISTS <FileName>");
                        continue;
                    }
                }
                else if(operation.equalsIgnoreCase("RENAME"))
                {
                    if(parts.length != 3)
                    {
                        dos.writeUTF("Usage : RENAME <OldFileName> <NewFileName>");
                        continue;
                    }
                }
                else if(operation.equalsIgnoreCase("DELETE"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Usage : DELETE <FileName>");
                        continue;
                    }

                }
                else if(operation.equalsIgnoreCase("LIST"))
                {
                    if(parts.length != 1)
                    {
                        dos.writeUTF("Usage : LIST ");
                        continue;
                    }
                }
                else 
                {
                    dos.writeUTF("Invalid operation");
                }

            } //End of while 

            socket.close();
            dis.close();
            dos.close();

            System.out.println("Client disconnected");

        }// End of try

        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }

    }//End of HandleClientrequest method

} //End of class