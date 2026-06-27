/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. 4. Write a program which accept string from user and extract only digit from it
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class DisplayDigit32_4
{
  public static void DisplayDigit(char Brr[])
  {
    int i = 0;
    for(i = 0; i < Brr.length; i++)
    {
      if(Brr[i] >= '0' && Brr[i] <= '9')
      {
        System.out.print(Brr[i]);
      }
      
    }
  }
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    String Arr = null;

    System.out.println("Enter String : ");
    Arr = sobj.nextLine();

    char str[] = Arr.toCharArray();
    DisplayDigit(str); 
  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan123
// ouput : 123
//
///////////////////////////////////////////////////////////////////////////////////////////////