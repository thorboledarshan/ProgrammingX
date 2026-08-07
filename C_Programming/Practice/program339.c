#include<stdio.h>

typedef unsigned int UINT;

 
int main()
{
    UINT iMask = 0xFFBFFFFF; //23rd position
    UINT iNo = 0;
    
    printf("Enter number : \n");
    scanf("%d",&iNo);

    iNo = iNo & iMask ;                      
    printf("Updated number : %d\n",iNo);

    return 0;
}