#include<stdio.h>

int main()
{
    char str[50] = {'\0'};
    int iRet = 0;

    iRet = sprintf(str,"Jay Ganesh...");     //returns successfully data printed only
    
    printf("value from iRet is : %d\n",iRet);
    
    printf("Data from str is : %s\n",str);

    return 0;
}