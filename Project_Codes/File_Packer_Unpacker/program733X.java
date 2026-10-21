///////////////////////////
// FILE UNPACKER CODE
//////////////////////////

import java.io.*; //classes related File
import java.util.*; // input / output

class program733X
{
    public static void main(String A[]) throws IOException
    {
      Scanner sobj = new Scanner(System.in); //object to take input

      String PackFileName = null; //stores input packfile name
      String strHeader = null; //use to split words
      String Tokens[] = null; //stores split words seperately

      File fpackobj = null; //packedfileobj
      FileInputStream fiobj = null; //refference to input stream object
      FileOutputStream foobj = null; //refference to output stream object
      File NewFile = null; //stores object of NewFile

      int iRet = 0; //stores return value of read

      byte Buffer[] = null;         //used to read data
      byte Header[] = new byte[100]; //used to read only headers of file

      System.out.println("Enter the name of packed file : ");
      PackFileName = sobj.nextLine();

      fpackobj = new File(PackFileName); //stores object of PackFileName

      if(fpackobj.exists())
      {
         fiobj = new FileInputStream(fpackobj); //opens PackFileName and stores its address

         
         while((iRet = fiobj.read(Header,0,100)) != -1) //reads header from PackFile and stores in Header
         {

            strHeader = new String(Header); //Converts header from byte to string

            System.out.println("header is : "+strHeader);

            strHeader = strHeader.trim();  //removes first and last white spaces from header
            strHeader = strHeader.replaceAll("\\s+"," "); //replaces multiple spaces between names with only one space

            Tokens = strHeader.split(" "); //used to split words by space to make tokens

            System.out.println("File name : "+Tokens[0]); //filename
            System.out.println("File size : "+Tokens[1]); //file size

            NewFile = new File(Tokens[0]);  //creates object which holds new file path 
            NewFile.createNewFile(); //creates new file

            foobj  = new FileOutputStream(NewFile); //stores output stream object

            Buffer = new byte[Integer.parseInt(Tokens[1])]; //allocates memory for specified memory size(Token[1])

            //Read Data(kuthey,kuthun,kiti)
            fiobj.read(Buffer,0,Integer.parseInt(Tokens[1])); //read data from file into buffer from 
                                                              //start(offset) of fixed size bytes(Token[1])

            //write the data
            foobj.write(Buffer,0,Integer.parseInt(Tokens[1])); //write data from buffer into new file
                                                               //start(offset), of fixed no.of bytes(Token[1])

            foobj.close();

         }

         fiobj.close();
         sobj.close();

      }
      else 
      {
         System.out.println("There is no such file");
      } 

    }
}