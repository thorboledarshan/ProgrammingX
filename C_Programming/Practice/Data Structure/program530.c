#include<stdio.h>

// input: 4!
// output: 4 * 3 * 2 * 1= 10

typedef unsigned long int ULONG;

ULONG Factorial(int iNo)
{
    static ULONG iFact = 1;
    
    if(iNo > 0)
    {
        iFact = iFact * iNo;
        iNo--;
        Factorial(iNo);
    }
    return iFact;
}

int main()
{
    int iValue = 0;
    ULONG iRet = 0;

    printf("Enter Frequency : \n");
    scanf("%d",&iValue);

    iRet =Factorial(iValue);
    printf("Factorial is : %lu\n",iRet);
    
    return 0;
}