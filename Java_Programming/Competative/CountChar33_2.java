/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept string from user and accept one character . check count of that
//   character.
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class StringX
{
  int CountChar(String str, String ch)
  {
    char Arr[] = str.toCharArray();
    char Crr [] = ch.toCharArray();

    int i = 0;
    int iCount = 0;

    for(i = 0; i < Arr.length; i++)
    {
      if(Arr[i] == Crr[0])
      {
        iCount++;
      }
    }
    return iCount;
  }
}


class CountChar33_2
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

    iRet = strobj.CountChar(data , sValue);
    System.out.println("frequency of given char in string is : "+iRet);

  }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan , a
// ouput : frequency of given char in string is : 2
//
///////////////////////////////////////////////////////////////////////////////////////////////