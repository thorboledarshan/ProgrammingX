#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool LinearSearch(int Arr[], int iSize)
{
  int iCnt = 0;

  for(iCnt = 0; iCnt < iSize; iCnt++)
  {
    if(Arr[iCnt] == 11)
    {
      return true;    ///Bad Programming
    }
  }
  return false;

}
int main()
{
    int iLength = 0;
    int iCnt = 0;
    int * Brr = NULL;
    bool bRet = false;

    printf("Enter number of elements:");
    scanf("%d",&iLength);

    Brr = (int *)malloc(iLength * sizeof(int));
    
    printf("Enter the  elements : \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    bRet = LinearSearch(Brr, iLength);
    if(bRet == true)
    {
      printf("Element is present\n");
    }
    else
    {
      printf("Element is not present\n");
    }

    free(Brr);
    
    return 0;
}