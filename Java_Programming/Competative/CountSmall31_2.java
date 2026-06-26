///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. 1.Write a program which accept string from user and count number of small characters.
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Logic
{
    void CountSmall(final char Brr[])
    {
      int i = 0;
      int iCount = 0;

      for(i = 0; i < Brr.length; i++)
      {
        if(Brr[i] >= 'a' && Brr[i] <= 'z')
        {
            iCount++;
        }
      }
      System.out.println("Number of small characters are : "+iCount);
    }
}


class CountSmall31_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        String Arr = null;

        System.out.println("Enter String : ");
        Arr = sobj.nextLine();
        
        char str[] = Arr.toCharArray();
        lobj.CountSmall(str);
        
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan
// ouput : Number of small characters are : 6
//
///////////////////////////////////////////////////////////////////////////////////////////////