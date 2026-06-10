////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and return the largest number.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int Maximum(int Arr[], int iLength)
{
    int iCnt = 0;
    int iMax = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }
    return iMax;

}


int main()
{
    int iSize = 0;
    int iCnt = 0;
    int iRet = 0;
    int * P = NULL;

    printf("Enter Number of elements:");
    scanf("%d",&iSize);

    P = (int *)malloc(iSize * sizeof(int));

    if( P == NULL)
    {
        return -1;
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d :",iCnt+1);
        scanf("%d",&P[iCnt]);
    }
    
    iRet = Maximum(P, iSize);
    printf("Largest number is %d",iRet);
    

    return 0;
}
//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 20
//         Enter element 3 : 30
// output: 30
//
//////////////////////////////////////