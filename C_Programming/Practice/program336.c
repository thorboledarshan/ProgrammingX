#include<stdio.h>

typedef unsigned int UINT;

// position : 4
UINT OFFBit(UINT iNo, UINT iPos)
{
   UINT iMask = 0xFFFFFFF7;
   UINT iResult = 0;
   
   if(iPos < 1 || iPos >32)
   {
    printf("Invalid Bit Position\n");
    return iNo;
   }

   iMask = iMask << (iPos -1);

   iResult = iNo ^ iMask ; 
   
   return iResult; 
}

int main()
{
    UINT iValue = 0;
    UINT iLocation = 0;
    UINT iRet = 0;
    
    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Enter the Bit Position : \n");
    scanf("%d",&iLocation);
    
    iRet = OFFBit(iValue,iLocation);
    printf("Updated number : %d\n",iRet);

    return 0;
}