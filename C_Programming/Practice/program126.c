#include<stdio.h>
#include<stdlib.h>

int CountOdd(int Arr[], int iSize)
{
  int iCnt = 0;
  int iCount = 0;

  for(iCnt = 0; iCnt < iSize; iCnt++)
  {
    if(Arr[iCnt] % 2 != 0)
    {
      iCount++;
    }
  }
  return iCount;

}
int main()
{
    int iLength = 0;
    int iCnt = 0;
    int * Brr = NULL;
    int iRet = 0;

    printf("Enter number of elements:");
    scanf("%d",&iLength);

    Brr = (int *)malloc(iLength * sizeof(int));
    
    printf("Enter the  elements : \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet = CountOdd(Brr, iLength);
    printf("Count of odd numbers are : %d",iRet);

    free(Brr);
    
    return 0;
}