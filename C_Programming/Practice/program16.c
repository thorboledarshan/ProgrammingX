#include<stdio.h>
#include<stdbool.h>

int CheckEvenOdd(int iNo)
{
    if((iNo %2) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int iValue=0;
    bool bRet=false;

    printf("Enter number to check even or odd number:\n");
    scanf("%d",&iValue);

    bRet =CheckEvenOdd(iValue);

    if(bRet == true)
    {
        printf("%d is even\n",iValue);
    }
    else
    {
        printf("%d is odd\n",iValue);
    }
    return 0;

}