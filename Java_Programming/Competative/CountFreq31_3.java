///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept string from user and return
//    difference between frequency of small characters and frequency of
//   capital characters.
//
///////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Logic
{
    void CountSmall(final char Brr[])
    {
      int i = 0;
      int iCountC = 0;
      int iCountS = 0;
      int iFreqDiff = 0;

      for(i = 0; i < Brr.length; i++)
      {
        if(Brr[i] >= 'A' && Brr[i] <= 'Z')
        {
            iCountC++;
        }
        else if((Brr[i] >= 'a' && Brr[i] <= 'z'))
        {
            iCountS++;
        }
      }
      iFreqDiff = iCountS - iCountC; 
      if(iFreqDiff < 0)
      {
        iFreqDiff = -(iFreqDiff);
      }
      System.out.println("Frequency Difference  of small characters and capital character is : "+iFreqDiff);
    }
}


class CountFreq31_3
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
// ouput : Frequency Difference  of small characters and capital character is : 5
//
///////////////////////////////////////////////////////////////////////////////////////////////

