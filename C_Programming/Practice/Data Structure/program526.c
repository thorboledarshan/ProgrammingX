#include<stdio.h>

// input: 4
// output: 1 + 2 + 3 + 4 = 10


int Summation(int iNo)
{
    static int iSum = 0; 

    if(iNo > 0)
    {
        iSum = iSum + iNo;
        iNo--;
        Summation(iNo);
    }
    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Frequency : \n");
    scanf("%d",&iValue);

    iRet =Summation(iValue);
    printf("Summation is : %d\n",iRet);
    
    return 0;
}