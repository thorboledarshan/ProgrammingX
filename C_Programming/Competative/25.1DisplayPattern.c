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
  int iCount = 1;
 

  for(i = 1 ; i <= iRow; i++)
  {
    for(j = 1; j <= iCol; j++)
    {
      if(iCount > 9)
      {
        iCount = 1;
      }
      
       printf("%d   ",iCount);
       iCount++;
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
// output : 1 2 3 4
//          5 6 7 8
//          9 1 2 3
//          4 5 6 7
//         
//
///////////////////////////////////////////////////////////////////////////////////////////////