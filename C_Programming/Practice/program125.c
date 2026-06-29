#include<stdio.h>
#include<stdlib.h>

int SumEven(int Arr[], int iSize)
{
  int iCnt = 0;
  int iSum = 0;

  for(iCnt = 0; iCnt < iSize; iCnt++)
  {
    if(Arr[iCnt] % 2 == 0)
    {
      iSum = iSum + Arr[iCnt];
    }
  }
  return iSum;

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

    iRet = SumEven(Brr, iLength);
    printf("Count of even numbers are : %d",iRet);

    free(Brr);
    
    return 0;
}