////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and return product of all odd elements.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int ProductOdd(int Arr[], int iLength)
{
    int iCnt = 0;
    int iProduct = 1;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 != 0)
        {
            iProduct = iProduct * Arr[iCnt];
        }
    }
    return iProduct;
    
}

int main()
{
    int iSize = 0;
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

    iRet = ProductOdd(P, iSize);
    printf("%d",iRet);

    free(P);

    return 0;

    
    
}

//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 20
//         Enter element 3 : 30
// output: 1
//
//////////////////////////////////////