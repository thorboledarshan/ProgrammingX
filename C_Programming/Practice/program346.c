#include<stdio.h>

typedef unsigned int UINT;

 
int main()
{
    UINT iMask = 0x04100000; //Position 21 and 27       
    UINT iNo = 0;   
    UINT iResult = 0;

    printf("Enter number : ");
    scanf("%d",&iNo);

    iResult = iNo ^ iMask;
    printf("Updated number : %d\n",iResult);

    return 0;
}