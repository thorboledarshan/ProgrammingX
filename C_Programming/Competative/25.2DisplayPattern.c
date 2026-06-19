///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept number of rows and number of columns  and display pattern
//
///////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void DisplayPattern(int iRow, int iCol)
{
  int i = 0;
  int j = 0;
  int iCount = 0;

  for(i = 1; i <= iRow; i++)
  {
    if(i % 2 != 0)
    {
      iCount = 2;
    }
    else 
    {
      iCount = 1;
    }

    for(j = 1; j <= iCol; j++)
    {
      printf("%d  ",iCount);
      iCount = iCount + 2;
    }
    printf("\n");
  }
}

int main()
{
  int iValue1 = 0;
  int iValue2 = 0;

  printf("Enter number of rows and columns : \n");
  scanf("%d %d",&iValue1,&iValue2);

  DisplayPattern(iValue1,iValue2);
  return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter number of rows and columns : 4 ,4
// output : 2 4 6 8 10
//          1 3 5 7 9
//          2 4 6 8 10
//          1 3 5 7 9
//         
//
///////////////////////////////////////////////////////////////////////////////////////////////