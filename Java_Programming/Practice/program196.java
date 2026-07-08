/*
    iRow = 4
    iCol = 4

    # & # &
    # & # &
    # & # &
    # & # &
    



    trick:
      1   2  3  4 
    1 11 12 13 14
    2 21 22 23 24
    3 31 32 33 34
    4 41 42 43 44
*/

import java.util.*;

class program196
{ 
  public static void Display(int iRow, int iCol)
  {
    int i = 0;
    int j = 0;

    for(i = 1; i <= iRow; i++)
    {
      for(j = 1; j <= iCol; j++)
      {
        if(j % 2 == 0)
        {
         System.out.print("&\t");
        }
        else 
        {
          System.out.print("#\t");
        }
      }
      System.out.println();
    }
  }

  public static void main (String A[])
  {
    Scanner sobj = new Scanner(System.in);
    int iValue1 = 0;
    int iValue2 = 0;

    System.out.println("Enter number of rows : ");
    iValue1 = sobj.nextInt();

    System.out.println("Enter number of columns : ");
    iValue2 = sobj.nextInt();

    Display(iValue1,iValue2);
  }
}