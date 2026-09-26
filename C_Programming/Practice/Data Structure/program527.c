#include<stdio.h>

// input: 4!
// output: 4 * 3 * 2 * 1= 10


int Factorial(int iNo)
{
    int iFact = 1;
    
    while(iNo != 0)
    {
        iFact = iFact * iNo;
        iNo--;
    }
    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Frequency : \n");
    scanf("%d",&iValue);

    iRet =Factorial(iValue);
    printf("Factorial is : %d\n",iRet);
    
    return 0;
}