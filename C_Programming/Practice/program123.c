#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[], int iLength)
{
  int iCnt = 0;
  int iSum = 0;

  for(iCnt = 0; iCnt < iLength; iCnt++)
  {
    iSum = iSum + Arr[iCnt];
  }
  return iSum;

}
int main()
{
    int iSize = 0;
    int iCnt = 0;
    int * Brr = NULL;
    int iRet = 0;

    printf("Enter number of elements:");
    scanf("%d",&iSize);

    Brr = (int *)malloc(iSize * sizeof(int));
    
    printf("Enter the  elements : \n");

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet = Summation(Brr, iSize);
    printf("Addition is : %d",iRet);

    free(Brr);
    
    return 0;
}