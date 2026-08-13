#include<stdio.h>

typedef unsigned int UINT;

 
int main()
{
    UINT iMask = 0x00010100; //Position 9 and 17       0000 0000   0000 0100    0001 0000   0000 0000   0000 0000
    UINT iNo = 0;  
    UINT iResult = 0;

    printf("Enter number : ");
    scanf("%d",&iNo);

    iResult = iNo ^ iMask;
    printf("Updated number : %d\n",iResult);

    return 0;
}