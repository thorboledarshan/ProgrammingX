#include<stdio.h>

int main()
{
    int iNo = 0;
    int iCount = 0;
    int iDigit = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    while(iNo != 0)
    {
        iDigit = iNo % 2;
        if(iDigit == 1)
        {
            iCount++;
        }
        iNo = iNo / 2;
    }
    printf("Count of 1 is : %d",iCount);

    return 0;
}