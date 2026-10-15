import java.io.*;
import java.util.*;

class program674
{
    public static void main(String A[])
    {
       String Data =" Marvellous Infosystem";

       byte Arr[] = Data.getBytes();  //String to array conversion

       System.out.println(Data.length());
       System.out.println(Arr.length);

       for(int i = 0; i < Arr.length; i++)
       {
        System.out.println(Arr[i]);
       }
       
    }
}