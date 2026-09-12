/*
Develop a client-server application that performs different string operations.

The client should send a command containing an operation and a string.

Supported commands:

LENGTH <string>
UPPER <string>
LOWER <string>
REVERSE <string>
PALINDROME <string>
VOWELS <string>
Example

Client:
REVERSE Marvellous

Server:
suollevraM

Client:
VOWELS Marvellous

Server:
Number of vowels
Requirements

The server should perform all string processing. The client should only accept input and display the
response. 

*/

import java.io.*;
import java.net.*;
import java.time.LocalDate;
import java.time.LocalTime;

class InfoServer
{
    public static void main(String A[])
    {
        try 
        {
            ServerSocket serversocket = new ServerSocket(9000); 

            System.out.println("----------------------------------");
            System.out.println("---------Server Started-----------");
            System.out.println("----------------------------------");

            while(true) //infinite loop 
            {    
                System.out.println("Server is waiting for client");

                Socket cliensocket = serversocket.accept();  //connects with client

                System.out.println("Client connected successfully");

                Thread t = new Thread(() -> HandleClientRequest(cliensocket)); //Multiple Thread

                t.start();

            } //End of while loop

        }
        catch (Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }

    } //End of main

    public static void HandleClientRequest(Socket socket) //creates seperate thread for every client
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to server");

            while(true)
            {
                String command = dis.readUTF(); //unicode text format

                System.out.println("Command received from client : "+command);

                String parts[] = command.trim().split(" ");

                String operation = parts[0];

                if(operation.equalsIgnoreCase("Quit"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                // filter
                if(parts.length < 1)
                {
                    dos.writeUTF("Invalid input");
                    continue;
                }
   
                if(operation.equalsIgnoreCase("DATE"))
                {
                    dos.writeUTF(LocalDate.now().toString());
                }
                else if(operation.equalsIgnoreCase("TIME"))
                {
                    dos.writeUTF(LocalTime.now().toString());
                }
                else if(operation.equalsIgnoreCase("SERVERNAME"))
                {
                    String ServerName = InetAddress.getLocalHost().getHostName();

                    dos.writeUTF("Server Name : " + ServerName);
                }
                else if(operation.equalsIgnoreCase("HELP"))
                {
                    dos.writeUTF(
                                    "Available Commands :\n" +
                                    "DATE\n"+
                                    "TIME\n"+
                                    "SERVERNAME\n" +
                                    "HELP\n" +
                                    "QUIT"
                                ); 
                }
                else 
                {
                    dos.writeUTF("Invalid operation");
                }

            }//End of while

            socket.close();


        }
        catch(Exception e) 
        {
            System.out.println("Exception occured "+e);
        }
    }

}//End of class