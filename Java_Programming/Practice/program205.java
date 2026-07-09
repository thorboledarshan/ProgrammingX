/*
    iRow = 4
    iCol = 4

    a b c d
    a b c d
    a b c d
    a b c d

    
    



    trick:
      1   2  3  4         1  2  3  4    
    1 11 12 13 14        1
    2 21 22 23 24        2
    3 31 32 33 34        3
    4 41 42 43 44        4
*/

import java.util.*;

class Pattern
{
  public void Display(int iRow, int iCol)
  {
    int i = 0;
    int j = 0;
    char ch = '\0';

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1, ch = 97; j <= iCol; j++, ch++)
        {
          System.out.print(ch+"\t");
        }
        System.out.println();

    }

  }
}

class program205
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);
       int iValue1 = 0;
       int iValue2 = 0;

       System.out.println("Enter number of Rows : ");
       iValue1 = sobj.nextInt();

       System.out.println("Enter number of Columns : ");
       iValue2 = sobj.nextInt();

       Pattern pobj = new Pattern();
       pobj.Display(iValue1,iValue2);
    }
}