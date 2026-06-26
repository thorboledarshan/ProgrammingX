///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. 1.Write a program which accept string from user and count number of capital characters.
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Logic
{
    void CountCapital(char Brr[])
    {
      int i = 0;
      int iCount = 0;
      for(i = 0; i < Brr.length; i++)
      {
        if(Brr[i] >= 'A' && Brr[i] <='Z' )
        {
         iCount++; 
        }
      }
      System.out.println("Number of capital characters are : "+iCount);
    }
}


class CountCapital31_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();
        String Arr = null;

        System.out.println("Enter String : ");
        Arr = sobj.nextLine();

        char str[]  = Arr.toCharArray();
        lobj.CountCapital(str);

    }
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Darshan
// ouput : Number of capital characters are : 1
//
///////////////////////////////////////////////////////////////////////////////////////////////