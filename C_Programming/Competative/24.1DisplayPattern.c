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
  char ch = '\0';

  for(i = 1; i <= iRow; i++)
  {
    for(j = 1,ch = 'A'; j <= iCol; j++,ch++)
    {
      printf("%c ",ch);
    }
    printf("\n");
  }
}

int main()
{
  int iValue1 = 0;
  int iValue2 = 0;

  printf("Enter number of rows : \n");
  scanf("%d",&iValue1);
  printf("Enter number of columns : \n");
  scanf("%d",&iValue2);

  DisplayPattern(iValue1,iValue2);
  return 0;
}


///////////////////////////////////////////////////////////////////////////////////////////////
//
// input : Enter number of rows and columns : 4 ,4
// output : A B C D
//          A B C D
//
///////////////////////////////////////////////////////////////////////////////////////////////