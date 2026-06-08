////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and accept one another number as No, return frequency of
//    of that number.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int CountFrequency(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;
    int iFreq = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
           iFreq = iFreq + 1;
        }
    }
    return iFreq;


}
int main()
{
    int iSize = 0;
    int iValue = 0;
    int iCnt = 0;
    int iRet = 0;
    int *P = NULL;

    printf("Enter number of elements:");
    scanf("%d",&iSize);
    printf("Enter number to count frequency:");
    scanf("%d",&iValue);

    P = (int *)malloc(iSize * sizeof(int));  //memory allocation

    if(P == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ", iCnt+1);
        scanf("%d",&P[iCnt]);
    }

    iRet = CountFrequency(P,iSize,iValue);
    printf(" %d ",iRet);

    free(P); //De-allocate memory

    return 0;
}

//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 11
//         Enter element 3 : 11
// output: 2
//
//////////////////////////////////////