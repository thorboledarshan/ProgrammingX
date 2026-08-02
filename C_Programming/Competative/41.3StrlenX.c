#include<stdio.h>

int StrlenX(char str [])
{
    int  iCount = 0;

    while(*str != '\0')
    {
        iCount++;
        str++;
        StrlenX(str);
    }
    return iCount;
    
}
int main()
{
    int iRet = 0;
    char Arr[20];

    printf("Enter string : \n");
    scanf("%s",Arr);

    iRet = StrlenX(Arr);
    printf("string length is : %d\n",iRet);

    return 0;
}
