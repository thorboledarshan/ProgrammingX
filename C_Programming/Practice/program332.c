#include<stdio.h>

typedef unsigned int UINT;

//position of 28 bit 
int main()
{
    UINT iMask = 0x8000000;
    UINT iNo = 0;
    
    printf("Enter number : \n");
    scanf("%d",&iNo);

    iNo = iNo ^ iMask;                      //Toggle the bit
    printf("Updated number : %d\n",iNo);

    return 0;
}