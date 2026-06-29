#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[],int iSize)
{
  int iCnt = 0;
  int iSum = 0;
  for(iCnt = 0; iCnt < iSize; iCnt++)
  {
    iSum = iSum + Arr[iCnt];
  }
  return iSum;
}

int main()
{
    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;
    int iRet = 0;
    
    //(STEP 1)Accept number of elements 
    printf("Enter number of elements :\n");
    scanf("%d",&iLength);
    
    //(STEP 2) Allocate the memory
    Brr = (int *)malloc(iLength*sizeof(int)); //typecast

    //(STEP 3) Accept the value from user
    printf("Enter the elements: \n");
    for(iCnt=0;iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    //(STEP 4) Use the memory(logic)
    iRet = Summation(Brr,iLength);
    printf("Summation of elements is: %d\n ",iRet);


    // (STEP 5) Deallocate the memory
    free(Brr);

    return 0;
}