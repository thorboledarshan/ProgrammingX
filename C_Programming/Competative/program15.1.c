////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and accept one another number as No, check whether NO is
//    present or not.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL Check(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            return TRUE;
        }
    }
    return FALSE;
}


int main()
{
    int iCnt = 0;
    int iSize = 0;
    BOOL  bRet = FALSE;
    int * P = NULL;
    int iValue = 0;

    printf("Enter number of elements:");
    scanf("%d",&iSize);

    P = (int *) malloc (iSize * sizeof(int));
    if(P == NULL)
    {
        return -1;
    }
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ",iCnt+1);
        scanf("%d",&P[iCnt]);
    }

    printf("Enter number to check:");
    scanf("%d",&iValue);

    bRet = Check(P,iSize, iValue);

    if(bRet == TRUE)
    {
        printf("TRUE");
    }
    else
    {
        printf("FALSE");
    }

    free(P);

    return 0;
}

//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 11
//         Enter element 3 : 11
//         Enter number to check: 5
// output: Number is not present
//
//////////////////////////////////////