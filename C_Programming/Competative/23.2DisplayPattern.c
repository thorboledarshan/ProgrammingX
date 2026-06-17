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
  for(Row = 1; Row <iRow; Row++)
  {
    for(Col = 1; Col <iRow; Col++)
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
// input : Enter number of rows and columns : 4,3
// ouput : 1  2  3
//         1  2  3
//         1  2  3 
//         1  2  3
//
///////////////////////////////////////////////////////////////////////////////////////////////