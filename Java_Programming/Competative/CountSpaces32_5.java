/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. 4. Write a program which accept string from user and extract only digit from it
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class CountSpaces32_5
{
  public static void CountSpaces(char Brr[])
  {
    int i = 0;
    int iCount = 0;
    for(i = 0; i < Brr.length; i++)
    {
      if(Brr[i] == ' ' )
      {
        iCount++;
      } 
    }
    System.out.println("Number of white spaces are : "+iCount);
  }
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    String Arr = null;

    System.out.println("Enter String : ");
    Arr = sobj.nextLine();

    char str[] = Arr.toCharArray();
    CountSpaces(str); 
  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan Thorbole
// ouput : Number of white spaces are : 1
//
///////////////////////////////////////////////////////////////////////////////////////////////