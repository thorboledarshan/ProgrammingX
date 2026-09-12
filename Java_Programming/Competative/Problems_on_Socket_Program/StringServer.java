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

class StringServer
{
    public static void main(String A[])
    {
        try 
        {
            ServerSocket serversocket = new ServerSocket(9002); 

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
                if(parts.length < 2)
                {
                    dos.writeUTF("Number is required");
                    continue;
                }

                String input = parts[1];


                
                if(operation.equalsIgnoreCase("LENGTH"))
                {

                    int iCount = 0;

                    for(char s : input.toCharArray())
                    {
                        iCount++;
                    }

                    dos.writeUTF("length of "+input+" : "+String.valueOf(iCount));
                }
                else if(operation.equalsIgnoreCase("UPPER"))
                {
                    char str[] = input.toCharArray();

                    for(int i = 0; i < str.length;i++)
                    {
                        if(str[i] >= 'a' && str[i] <= 'z')
                        {
                            str[i] = (char) (str[i] - 32);
                        }
                    }

                    dos.writeUTF(new String(str));
                }
                else if(operation.equalsIgnoreCase("LOWER"))
                {
                    char str[] = input.toCharArray();

                    for(int i = 0; i < str.length;i++)
                    {
                        if(str[i] >= 'A' && str[i] <= 'Z')
                        {
                            str[i] = (char) (str[i] + 32);
                        }
                    }

                    dos.writeUTF(new String(str));
                }
                else if(operation.equalsIgnoreCase("REVERSE"))
                {
                    char str[] = input.toCharArray();

                    int iStart = 0;
                    int iEnd = 0;
                    char iTemp = 0;

                    iEnd = str.length - 1;

                    while(iStart < iEnd)
                    {
                        iTemp = str[iStart];
                        str[iStart] = str[iEnd];
                        str[iEnd] = iTemp;
                        
                        iStart++;
                        iEnd--;
                    }

                    dos.writeUTF(new String(str));
                }
                else if(operation.equalsIgnoreCase("PALLINDROME"))
                { 
                    char str[] = input.toCharArray();

                    int iStart = 0;
                    int iEnd = 0;
                    char iTemp = 0;

                    iEnd = str.length - 1;

                    while(iStart < iEnd)
                    {
                        iTemp = str[iStart];
                        str[iStart] = str[iEnd];
                        str[iEnd] = iTemp;
                        
                        iStart++;
                        iEnd--;
                    }

                    String strX = new String(str);

                    if(strX.equals(input))
                    {
                        dos.writeUTF(input+"is Pallindrome");
                    }
                    else 
                    {
                        dos.writeUTF(input+"is not Pallindrome");
                    }                   
                }
                else if(operation.equalsIgnoreCase("VOWELS"))
                {
                    int iCount = 0;

                    for(char s : input.toCharArray())
                    {
                        if(s =='A' || s == 'E' || s == 'I'|| s == 'O' || s == 'U' ||
                           s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'
                          )
                        {
                            iCount++;
                        }
                    }

                    dos.writeUTF("Number of Vowels : "+String.valueOf(iCount));
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