#include<stdio.h>
#include<string.h>

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String : \n");
    scanf("%s",Arr);         //issue

    printf("Entered String is : %s\n",Arr);

    return 0;   
}