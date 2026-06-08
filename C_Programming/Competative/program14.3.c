////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and check whether that numbers contain 11 or not.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL Check(int Arr[], int iLength)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt]  == 11)
        {
           return TRUE;
        }
    }
    return FALSE;

}
int main()
{
    int iSize = 0;
    int iCnt = 0;
    BOOL bRet = FALSE;
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

    bRet = Check(P,iSize);
    if(bRet == TRUE)
    {
        printf("11 is present");
    }
    else
    {
        printf("11 is not present");
    }

    free(P); //De-allocate memory

    return 0;
}

//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 11
//         Enter element 2 : 25
//         Enter element 3 : 378
// output: 11 is present
//
//////////////////////////////////////