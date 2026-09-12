/*
Develop a client-server application where the server performs different number-related operations
requested by the client.

The client should send commands in the following format:

EVEN <number>
ODD <number>
PRIME <number>
PERFECT <number>
FACTORIAL <number>
REVERSE <number>
Example

Client:
PRIME 11

Server:
11 is a Prime Number

Client:
FACTORIAL 5

Server:
Factorial is : 120

Requirements

. Write separate methods for different mathematical operations.

. Server should identify the requested operation.

. Invalid commands should generate an appropriate message.

. Server should support multiple clients. 

*/

import java.io.*;
import java.net.*;

class MathsServer
{
    public static void main(String A[])
    {
        try 
        {
            ServerSocket serversocket = new ServerSocket(9001); 

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

                double no1 = Double.parseDouble(parts[1]);
                
                if(operation.equalsIgnoreCase("Even"))
                {
                    if(Even(no1))
                    {
                        dos.writeUTF(no1+" is Even number");
                    }
                    else 
                    {
                       dos.writeUTF(no1+" is not Even number"); 
                    }
                }
                else if(operation.equalsIgnoreCase("Odd"))
                {
                    if(Odd(no1))
                    {
                        dos.writeUTF(no1+" is Odd number");
                    }
                    else 
                    {
                        dos.writeUTF(no1+" is not Odd number");
                    }
                }
                else if(operation.equalsIgnoreCase("PRIME"))
                {
                    if(Prime(no1))
                    {
                        dos.writeUTF(no1+" is Prime number");
                    }
                    else
                    {
                        dos.writeUTF(no1+" is not Prime number");
                    }
                }
                else if(operation.equalsIgnoreCase("PERFECT"))
                {
                    if(Perfect(no1))
                    {
                        dos.writeUTF(no1+" is Perfect number");
                    }
                    else
                    {
                        dos.writeUTF(no1+" is not Perfect number");
                    }
                }
                else if(operation.equalsIgnoreCase("FACTORIAL"))
                { 
                    dos.writeUTF("Factorial is : "+Factorial(no1));  
                }
                else if(operation.equalsIgnoreCase("REVERSE"))
                {
                    dos.writeUTF("Reverse is : " + Reverse(no1));
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

    public static boolean Even(double iNo)
    {
        boolean  Ans = false;

        if(iNo % 2 == 0)
        {
            Ans = true;
        }

        return Ans;

    }

    public static boolean Odd(double iNo)
    {
        boolean  Ans = false;

        if(iNo % 2 != 0)
        {
            Ans = true;
        }

        return Ans;

    }

    public static boolean Prime(double iNo)
    {
        if(iNo < 2)
        {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(iNo); i++)
        {
            if(iNo % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static boolean Perfect(double iNo)
    {
        if(iNo < 1)
        {
            return false;
        }

        double iTemp = 0;
        iTemp = iNo;
        double iSum = 0;

        for(int i = 1; i <= iNo / 2; i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else 
        {
            return false;
        }    
    }

    public static double Factorial(double iNo)
    {

        double Fact = 1;

        for(int i = 1; i <= iNo; i++)
        {
            Fact = Fact * i;
        }

        return Fact;
    }

    public static double Reverse(double iNo)
    {
        double Digit = 0;
        double Rev = 0;

        while(iNo != 0)
        {
            Digit = iNo % 10;
            
            Rev = Rev * 10 + Digit;

            iNo = iNo / 10;
        }
        
        return  Rev;
    }



}//End of class