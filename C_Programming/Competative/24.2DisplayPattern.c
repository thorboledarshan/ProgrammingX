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
  char ch2 = '\0';

  for(i = 1; i <= iRow; i++)
  {
    if(i % 2 != 0)
    {
      for(j = 1,ch1 = 'A'; j <= iCol; j++,ch1++)
      {
        printf("%c ",ch1);
      }
      printf("\n");
    }
    else 
    {
      for(j = 1,ch2 = 'a'; j <= iCol; j++,ch2++)
      {
        printf("%c ",ch2);
      }
      printf("\n");
    }

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
// output : A B C D
//          a b c d
//          A B C D
//          a b c d
//
///////////////////////////////////////////////////////////////////////////////////////////////