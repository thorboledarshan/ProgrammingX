////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and return the smallest number.
//
////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

int Smallest(int Arr[], int iLength)
{
    int iCnt = 0;
    int iMin =Arr[0];

    for(iCnt = 1; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
    }
    return iMin;
}
int main()
{
    int iSize = 0;
    int iCnt = 0;
    int * P = NULL;
    int iRet = 0;

    printf("Enter number of elements: ");
    scanf("%d",&iSize);

    P = (int *) malloc (iSize * sizeof(int));

    if(P ==NULL)
    {
        return -1;
    }

    for(iCnt  = 0;iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ",iCnt+1);
        scanf("%d",&P[iCnt]);
    }
    
    iRet = Smallest(P, iSize);
    printf("Smallest number is : %d ",iRet);
    free(P);
    return 0;
}
//////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 20
//         Enter element 3 : 30
// output: 10
//
//////////////////////////////////////