#include<stdio.h>

typedef unsigned int UINT;

 
int main()
{
    UINT iMask = 0x1;
    UINT iNo = 0;
    UINT iPos = 0;
    
    printf("Enter number : \n");
    scanf("%d",&iNo);

    printf("Enter the Bit Position : \n");
    scanf("%d",&iPos);
    
    iMask = iMask << (iPos -1);
    iNo = iNo ^ iMask ;                      //Toggle the bit
    printf("Updated number : %d\n",iNo);

    return 0;
}