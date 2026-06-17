///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept number of rows and number of columns  and display pattern
//
///////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void DisplayPattern(int iRow , int iCol)
{
  int Row = 0;
  int Col = 0;
  for(Row = 1; Row <=iRow; Row++)
  {
    for(Col = iCol; Col >= 1; Col--)
    {
      printf("%d  ",Col);
    }
    printf("\n");
  }
}

 

int main()
{
   int iValue1 = 0;
   int iValue2 = 0;
   printf("Enter number of rows and columns :\n");
   scanf("%d %d",&iValue1,&iValue2);

   DisplayPattern(iValue1,iValue2);
   return 0;
}
///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter number of rows and columns : 3 ,5
// output : 5 4 3 2 1
//          5 4 3 2 1
//          5 4 3 2 1
//
///////////////////////////////////////////////////////////////////////////////////////////////