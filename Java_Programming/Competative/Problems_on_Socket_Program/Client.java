import java.net.Socket;
import java.util.Scanner;
import java.io.*;

class Client
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try 
        {
            System.out.println("-------------------------------------");
            System.out.println("---------Client started------------- ");
            System.out.println("-------------------------------------");

            Socket socket = new Socket("127.0.0.1",9000); //connects with server

            System.out.println("Connection with server is successful");

            DataInputStream dis = new DataInputStream(socket.getInputStream()); //to read data
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); //to send data

            System.out.println(dis.readUTF());

            
            System.out.println("-------------------------------------");      
            System.out.println("-----------Select Operation----------");       
            System.out.println("-------------------------------------");

            System.out.println("Maths operations <MATHS>");
            System.out.println("String operations <STRING>");
            System.out.println("Info About Server <INFO>");

            System.out.println("-------------------------------------");

            System.out.println("Enter operation : ");

            String operation = sobj.nextLine();
            
            while(true)
            {
                if(operation.equalsIgnoreCase("INFO"))
                {   
                    System.out.println("-------------------------------------");
                    System.out.println("---------Info About Server-----------");
                    System.out.println("-------------------------------------");

                    System.out.println("DATE");
                    System.out.println("TIME");
                    System.out.println("SERVERNAME");
                    System.out.println("HELP");
                    System.out.println("QUIT");
                    System.out.println("-------------------------------------");
                }
                else if(operation.equalsIgnoreCase("Maths"))
                {
                    System.out.println("-------------------------------------");
                    System.out.println("------Maths Operation Commands-----");
                    System.out.println("-------------------------------------");

                    System.out.println("EVEN <NUMBER>");
                    System.out.println("ODD <NUMBER>");
                    System.out.println("PRIME <NUMBER>");
                    System.out.println("PERFECT <NUMBER>");
                    System.out.println("FACTORIAL <NUMBER>");
                    System.out.println(" REVERSE<NUMBER>");
                    System.out.println("QUIT");
                    System.out.println("-------------------------------------");
                }
                else if(operation.equalsIgnoreCase("String"))
                {   
                    System.out.println("-------------------------------------");
                    System.out.println("------Strings Operation Commands-----");
                    System.out.println("-------------------------------------");

                    System.out.println("LENGTH <STRING>");
                    System.out.println("UPPER <STRING>");
                    System.out.println("LOWER <STRING>");
                    System.out.println("REVERSE <STRING>");
                    System.out.println("PALLINDROME <STRING>");
                    System.out.println("VOWELS <STRING>");
                    System.out.println("QUIT");
                    System.out.println("-------------------------------------");
                }
                

                System.out.println("Enter command : ");

                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                dos.writeUTF(command);

                String response = dis.readUTF();

                if(parts[0].equalsIgnoreCase("QUIT"))
                {
                    break;
                }
                
                System.out.println("Client : "); 
                System.out.println(command);
                
                System.out.println("Server : ");

                System.out.println(response);

            }//End of while

            socket.close();
            sobj.close();
            dos.close();
            dis.close();
            
        }
        catch (Exception e)
        {
            System.out.println("Exception occured : "+e);
        }

    }//end of main

}//end of class