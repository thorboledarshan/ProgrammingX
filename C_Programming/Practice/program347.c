#include<stdio.h>

typedef unsigned int UINT;

 
int main()
{
    UINT iMask = 0x84; //Position 3 and 8       
    UINT iNo = 0;   
    UINT iResult = 0;

    printf("Enter number : ");
    scanf("%d",&iNo);

    iResult = iNo ^ iMask;
    printf("Updated number : %d\n",iResult);

    return 0;
}