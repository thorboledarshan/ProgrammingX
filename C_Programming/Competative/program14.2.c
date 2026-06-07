////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and return difference between  frequency of even numbers 
//    and frequency of odd numbers
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int FrequencyEvenOdd(int Arr[], int iLength)
{
    int iCnt = 0;
    int iFreqEven = 0;
    int iFreqOdd = 0;
    int iDiff = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
           iFreqEven = iFreqEven + 1;
        }
        else
        {
          iFreqOdd = iFreqOdd + 1;  
        }
    }
    iDiff = iFreqEven - iFreqOdd;
    return iDiff;

}
int main()
{
    int iSize = 0;
    int iCnt = 0;
    int iRet = 0;
    int *P = NULL;

    printf("Enter number of elements:");
    scanf("%d",&iSize);

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

    iRet = FrequencyEvenOdd(P,iSize);
    printf("Result is : %d",iRet);

    free(P); //De-allocate memory

    return 0;
}

//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 20
//         Enter element 3 : 30
// output: 1 (2-1)
//
//////////////////////////////////////