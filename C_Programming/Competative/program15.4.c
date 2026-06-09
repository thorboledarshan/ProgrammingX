////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and accept range ,display  all elements from that range.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

void  Range(int Arr[], int iLength, int iStart, int iEnd)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if((Arr[iCnt] >= iStart) && (Arr[iCnt] <= iEnd))
        {
            printf(" %d ",Arr[iCnt]);
        }
    }
    
}

int main()
{
    int iSize = 0;
    int iValue1 = 0;
    int iValue2 = 0;
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

    printf("Enter number to Start Range : ");
    scanf("%d",&iValue1);
    printf("Enter number to End Range : ");
    scanf("%d",&iValue2);

    Range(P, iSize, iValue1, iValue2);

    free(P);

    return 0;

    
    
}

//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 20
//         Enter element 3 : 30
//         Enter number to Start range: 10
//         Enter number to Start range: 30
// output: 10 20 30
//
//////////////////////////////////////