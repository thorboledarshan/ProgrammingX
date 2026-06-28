/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept string from user and accept one character . return index of first
//    occurence of that character.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
  int CheckIndex(String str, String ch)
  {
    char Arr[] = str.toCharArray();
    char Crr [] = ch.toCharArray();

    int i = 0;

    for(i = 0; i < Arr.length; i++)
    {
      if(Arr[i] == Crr[0])
      {
        return i;
      }
    }
    return -1;
    
  }
}


class ChkIndex33_3
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    StringX strobj = new StringX();
    String data = null;
    String sValue = null;

    System.out.println("Enter String : ");
    data = sobj.nextLine();

    System.out.println("Enter Character to check Count : ");
    sValue = sobj.nextLine();
    
    int iRet = 0;

    iRet = strobj.CheckIndex(data , sValue);
    System.out.println("index of given character is  : "+iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan , a
// ouput : index of given character is  : 1
//
///////////////////////////////////////////////////////////////////////////////////////////////