///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and display summation of digits of each number.
//
///////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

void DigitSum(int Arr[], int iLength)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        int iSum = 0;
        int iDigit = 0;
        int iTemp = Arr[iCnt];

        while(Arr[iCnt] != 0)
        {
            iDigit = Arr[iCnt] % 10;
            iSum = iSum + iDigit;
            Arr[iCnt] = Arr[iCnt] / 10;
        }
        printf("Digit Sum of number %d is : %d \n",iTemp,iSum);
    }
}
int main()
{
    int iCnt = 0;
    int iSize = 0;
    int * P = NULL;

    printf("Enter number of elements :");
    scanf("%d",&iSize);

    P = (int *) malloc (iSize * sizeof(int));

    if(P == NULL)
    {
        return -1;
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ",iCnt + 1);
        scanf("%d",&P[iCnt]);
    }

    DigitSum(P, iSize);

    free(P);
    return 0;
}
//////////////////////////////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 201
//         Enter element 3 : 30
// output: Digit Sum of number 10 is : 1
//         Digit Sum of number 201 is : 3
//         Digit Sum of number 30 is : 3
//
///////////////////////////////////////////////////////////////