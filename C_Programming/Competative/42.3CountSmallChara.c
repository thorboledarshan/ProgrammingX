#include<stdio.h>

int SmallChar(char str [])
{
    static int  iCount = 0;

    if(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCount++;
        }
        str++;
        SmallChar(str);
    }
    return iCount;
    
}
int main()
{
    int iRet = 0;
    char Arr[20];

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    iRet = SmallChar(Arr);
    printf("Number of small characters are : %d\n",iRet);

    return 0;
}
