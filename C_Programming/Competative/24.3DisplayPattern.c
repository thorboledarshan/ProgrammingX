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
  char ch1 = '\0';
 

  for(i = 1 ,ch1 = 'A'; i <= iRow; i++, ch1++)
  {
    for(j = 1; j <= iCol; j++)
    {
      printf("%c ",ch1);
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
// output : A A A A
//          B B B B
//          C C C C
//          D D D D
//
///////////////////////////////////////////////////////////////////////////////////////////////