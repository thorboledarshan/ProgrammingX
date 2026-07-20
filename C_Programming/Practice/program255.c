#include<stdio.h>


int CountSmall(const char *str) 
{
    int iCount = 0;
    while(*str != 0)
    {
        if((*str >= 97 ) && (*str <= 122 )) //Bad practice
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

    iRet = CountSmall(Arr);
    printf("Frequency  is : %d\n",iRet);

    return 0;   
}