///////////////////////////////////////////////////////////////////////////////////////////////
//
// Q. Accept N numbers from user and display all such elements which contains 3 digits in it.
//
///////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>

void Digit(int Arr[], int iLength)
{
    int iCnt = 0;
    int iCount = 0;
    int iTemp = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        int iCount = 0;
        int iTemp = Arr[iCnt];

        while(Arr[iCnt] != 0 )
        {
           iCount = iCount + 1;
           Arr[iCnt] = Arr[iCnt] /10;
        }
        if(iCount == 3)
        {
            printf("%d has 3 digits in it\n",iTemp);
        }
    }
}
int main()
{
    int iSize = 0;
    int iCnt = 0;
    int * P = NULL;

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
    
    Digit(P, iSize);

    free(P);
    return 0;
}
//////////////////////////////////////////////////////////////
//
// input : Enter number of elements: 3
//         Enter element 1 : 10
//         Enter element 2 : 201
//         Enter element 3 : 30
// output: 201 has 3 digits in it 
//
///////////////////////////////////////////////////////////////