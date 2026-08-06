#include<stdio.h>

typedef unsigned int UINT;

//position 4
int main()
{
    UINT iMask = 0x8;
    UINT iNo = 0;
    
    printf("Enter number : \n");
    scanf("%d",&iNo);

    iNo = iNo ^ iMask;                      //Toggle the bit
    printf("Updated number : %d\n",iNo);

    return 0;
}