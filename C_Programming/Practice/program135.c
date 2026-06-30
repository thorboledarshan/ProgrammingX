#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

//Time Complexity: O(N) 
int Maximum(int Arr[], int iSize)
{
  int iCnt = 0;
  int iMax  =0;

  iMax = Arr[0];
  while( iCnt < iSize )
  {
    if(Arr[iCnt] > iMax)
    {
      iMax = Arr[iCnt];
    }
    iCnt++;
  }
  return iMax;

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

    

    iRet = Maximum(Brr, iLength);
    printf("Maximum element is : %d",iRet);

    free(Brr);
    
    return 0;
}