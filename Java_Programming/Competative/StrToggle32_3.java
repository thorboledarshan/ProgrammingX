/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. 4. Write a program which accept string from user and toggle it
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StrToggle32_3
{
  public static void StrToggle(char Brr[])
  {
    int i = 0;
    for(i = 0; i < Brr.length; i++)
    {
      if(Brr[i] >='A' && Brr[i] <='Z')
      {
        Brr[i] = (char) (Brr[i] + 32);
      }
      else if(Brr[i] >='a' && Brr[i] <='z')
      {
        Brr[i] = (char) (Brr[i] - 32);
      }
    }
    System.out.println(Brr);
  }
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);

    String Arr = null;

    System.out.println("Enter String : ");
    Arr = sobj.nextLine();
    
    char str[] = Arr.toCharArray();
    StrToggle(str); 

  }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan
// ouput : DARSHAN
//
///////////////////////////////////////////////////////////////////////////////////////////////