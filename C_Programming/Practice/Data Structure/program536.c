#include<stdio.h>

// input : 571
// output : 5 + 7 + 1 = 13

int Summation(int iNo)
{
    int iDigit = 0;
    static int iSum = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iSum = iSum + iDigit;
        
        Summation(iNo / 10);   
    }
    return iSum;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Summation(iValue);
    printf("Summation of digit is : %d\n",iRet);
    
    return 0;
}