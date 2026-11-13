import java.io.*;
import java.net.*;
import java.util.*;

class program933
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);


        try
        {
            System.out.println("-------------------------------------");
            System.out.println("---- Marvellous Client Started ------");
            System.out.println("-------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",  
                                        9000
                                      );
            
            System.out.println("Connection with server is successfully");

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while(true)
            {
                System.out.println("-------------------------------------");
                System.out.println("------------FTP commands-------------");
                System.out.println("-------------------------------------");
                
                System.out.println("LIST");
                System.out.println("EXISTS <FileName>");
                System.out.println("INFO <FileName>");
                System.out.println("SIZE <FileName>");
                System.out.println("GET <FileName>");
                System.out.println("PUT <FileName>");
                System.out.println("DELETE <FileName>");
                System.out.println("RENAME <OldFileName> <NewFileName>");
                System.out.println("QUIT");
                System.out.println("-------------------------------------");

                System.out.println("Enter command : ");

                // RENAME Demo.txt DemoX.txt

                String command = sobj.nextLine();

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equalsIgnoreCase("GET"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : GET <FileName>");
                        continue;
                    }

                    dos.writeUTF(command);

                    String response = dis.readUTF();

                    if(response.equalsIgnoreCase("FILE_NOT_FOUND"))
                    {
                        System.out.println("File not found on server");

                        continue;
                    }

                    long filesize = dis.readLong();

                    System.out.println("File size is : "+filesize);

                    String NewFileName = "Download_"+parts[1];

                    FileOutputStream fos = new FileOutputStream(NewFileName);

                    byte buffer = new byte[1024];

                    long received = 0;

                    while(received < filesize)
                    {
                        long remaining = filesize - received;

                        int toread;

                        if(remaining > buffer.length)
                        {
                            toread = buffer.length;
                        }
                        else 
                        {
                            toread = (int)remaining;
                        }

                        int bytesread = dis.read(buffer,0,toread);

                        if(bytesread == -1)
                        {
                            break;
                        }

                        fos.write(buffer,0,bytesread);

                        received = received + bytesread;

                    }//End of while

                    fos.close();

                    if(received == filesize)
                    {
                        System.out.println("Download completed successfully");
                    }
                    else 
                    {
                        System.out.println("Download failed");
                    }

                }
                else if(operation.equalsIgnoreCase("PUT"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : PUT <FileName>");
                        continue;
                    }

                    dos.writeUTF(command);
                }

                else if(operation.equalsIgnoreCase("INFO"))
                {
                   if(parts.length != 2)
                    {
                        System.out.println("Usage : INFO <FileName>");
                        continue;
                    } 

                    dos.writeUTF(command);

                    String response = dis.readUTF();
                    
                    System.out.println("-------------------------------------");
                    System.out.println("File information : ");
                    System.out.println(response);
                    System.out.println("-------------------------------------");
                }

                else if(operation.equalsIgnoreCase("SIZE"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : SIZE <FileName>");
                        continue;
                    }

                    dos.writeUTF(command);

                    System.out.println("-------------------------------------");
                    String response = dis.readUTF();
                    System.out.println(response);
                    System.out.println("-------------------------------------");

                }

                else if(operation.equalsIgnoreCase("Exists"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : EXIST <FileName>");
                        continue;
                    }

                    dos.writeUTF(command);
                    
                    System.out.println("-------------------------------------");
                    String response = dis.readUTF();
                    System.out.println(response);
                    System.out.println("-------------------------------------");

                }

                else if(operation.equalsIgnoreCase("RENAME"))
                {
                   if(parts.length != 3)
                    {
                        System.out.println("Usage : RENAME <OldFileName> <NewFileName>");
                        continue;
                    } 

                    dos.writeUTF(command);

                    System.out.println("-------------------------------------");
                    String response = dis.readUTF();
                    System.out.println(response);
                    System.out.println("-------------------------------------");

                }
                else if(operation.equalsIgnoreCase("DELETE"))
                {
                    if(parts.length != 2)
                    {
                        System.out.println("Usage : DELETE <FileName>");
                        continue;
                    }

                    dos.writeUTF(command);

                    System.out.println("-------------------------------------");
                    String response = dis.readUTF();
                    System.out.println(response);
                    System.out.println("-------------------------------------");

                }

                else if(operation.equalsIgnoreCase("LIST"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Usage : LIST");
                        continue;
                    }

                    dos.writeUTF(command);
                    
                    System.out.println("-------------------------------------");
                    String response = dis.readUTF();

                    System.out.println("Files present on server are : ");
                    System.out.println(response);
                    
                    System.out.println("-------------------------------------");

                }
                else if(operation.equalsIgnoreCase("QUIT"))
                {
                    if(parts.length != 1)
                    {
                        System.out.println("Usage : QUIT ");
                        continue;
                    }
                    System.out.println("Thank you for using FTP Server");

                    dos.writeUTF(command);


                    System.out.println("-------------------------------------");
                    String response = dis.readUTF();
                    System.out.println(response);
                    System.out.println("-------------------------------------");
                    

                    break; //it will terminate client loop
                }
                else 
                {
                    System.out.println("There is no such command");
                    continue;
                }
                
                
            }//End of while

            socket.close();
            sobj.close();
            dos.close();
            dis.close();

        }// End of try

        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    } //End of main
}//End of class