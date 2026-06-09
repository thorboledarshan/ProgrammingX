////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and accept one another number as No, and return index of
//    first occurence of that number.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int FirstOccurence(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            return iCnt;
            break;
        }
    }
}

int main()
{
    int iSize = 0;
    int iValue = 0;
    int * P = NULL;
    int iCnt = 0;
    int iRet = 0;

    printf("Enter number  elements:");
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

    printf("Enter number to check : ");
    scanf("%d",&iValue);

    iRet = FirstOccurence(P, iSize, iValue);
    printf("Index of first occurence is : %d",iRet);

    free(P);

    return 0;

    
    
}

//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 11
//         Enter element 3 : 11
//         Enter number to check: 11
// output: Index of first occurence is : 1
//
//////////////////////////////////////