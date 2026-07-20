#include<stdio.h>


int CountVowels(const char *str) 
{
    int iCount = 0;
    while(*str != 0)
    {
        if((*str == 'a' || *str == 'A') || (*str == 'e' || *str == 'E') || (*str == 'i' || *str == 'I') || (*str == 'o' || *str == 'O') ||(*str == 'u' || *str == 'U')) //case insensitive
        {
         iCount++;
        }

        str++;
    }
    return iCount;
}
int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    iRet = CountVowels(Arr);
    printf("Frequency  is : %d\n",iRet);

    return 0;   
}