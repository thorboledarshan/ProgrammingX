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

  for(i = 1; i <= iRow; i++)
  {
    for(j = 1; j <= iCol; j++)
    {
      if(j == i || i == iRow || j == iCol || j == 1 || i == 1  )
      {
        printf("$  ");
      }
      else 
      {
        printf("   ");
      }
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
// input : Enter number of rows and columns : 4 ,4
// output :  *  *  *  * 
//           *  *     *
//           *     *  *
//           *  *  *  *
//         
//
///////////////////////////////////////////////////////////////////////////////////////////////