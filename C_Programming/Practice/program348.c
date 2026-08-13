#include<stdio.h>

typedef unsigned int UINT;

 
int main()
{
    UINT iMask1 = 0x4; //Position 3 
    UINT iMask2 = 0x80; //Position 8 
    UINT iMask = 0;

    UINT iNo = 0;   
    UINT iResult = 0;

    printf("Enter number : ");
    scanf("%d",&iNo);

    iMask = iMask1 | iMask2;

    iResult = iNo ^ iMask;
    printf("Updated number : %d\n",iResult);

    return 0;
}