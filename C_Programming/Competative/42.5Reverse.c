#include<stdio.h>

int RevDigit(int iNo)
{
    static int iRev = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        iRev = (iRev * 10) + iDigit;

        RevDigit(iNo / 10);
    }
    return iRev;
    
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = RevDigit(iValue);
    printf("Revrse digits  are : %d\n",iRet);

    return 0;
}

