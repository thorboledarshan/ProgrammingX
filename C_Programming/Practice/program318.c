#include<stdio.h>

typedef unsigned int UINT;
int main()
{
    int  iCnt = 0;
    UINT iMask = 0x1;
  
    printf("%d\n",iMask);
    iMask = iMask << 1;

    printf("%d\n",iMask);
    iMask = iMask << 1;

    printf("%d\n",iMask);
    iMask = iMask << 1;

    printf("%d\n",iMask);
    iMask = iMask << 1;

    printf("%d\n",iMask);
    iMask = iMask << 1;

   
    
    return 0;
}