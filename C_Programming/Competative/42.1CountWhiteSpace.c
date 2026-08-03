#include<stdio.h>

int WhiteSpaces(char str [])
{
    static int  iCount = 0;

    if(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }
        str++;
        WhiteSpaces(str);
    }
    return iCount;
    
}
int main()
{
    int iRet = 0;
    char Arr[20];

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    iRet = WhiteSpaces(Arr);
    printf("Number of white spaces are : %d\n",iRet);

    return 0;
}
