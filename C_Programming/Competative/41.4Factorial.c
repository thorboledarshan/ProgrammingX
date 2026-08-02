#include<stdio.h>

int Factorial(int iNo)
{
    static int  iFact = 1;

    if (iNo > 0)
    {
        iFact = iFact * iNo;
        Factorial(--iNo);
    }
    return iFact;
    
}
int main()
{
    int iRet = 0;
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);
    printf("Factorial  is : %d\n",iRet);

    return 0;
}
