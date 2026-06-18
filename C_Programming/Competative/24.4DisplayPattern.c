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
 
 

  for(i = iRow ; i >= 1; i--)
  {
    for(j = 1; j <= iCol; j++)
    {
      printf("%d ",i);
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
// output : 4 4 4 4
//          3 3 3 3
//          2 2 2 2
//          1 1 1 1
//
///////////////////////////////////////////////////////////////////////////////////////////////