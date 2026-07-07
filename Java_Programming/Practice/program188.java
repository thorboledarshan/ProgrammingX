///////////////////////////////////
//input : 11
//output : * * * # # # * * * # #
//////////////////////////////////

import java.util.*;

class program188
{ 
  public static void Display(int iNo)
  {
    int i = 0;
    
    for(i = 1; i <= iNo; i++)
    {
      if(((i-1)/3) % 2 == 0)
      {
        System.out.print("*\t");
      }
      
      else
      {
        System.out.print("#\t");
      }
    }
    
    System.out.println();
  }

  public static void main (String A[])
  {
    Scanner sobj = new Scanner(System.in);
    int iValue = 0;

    System.out.println("Enter number of elements : ");
    iValue = sobj.nextInt();

    Display(iValue);
  }
}