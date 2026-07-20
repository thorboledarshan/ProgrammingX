#include<stdio.h>


void Update( char *str) 
{
    
    while(*str != 0)
    {
        if(*str == 'l' ) 
        {
            *str = '-';
        }

        str++;
    }
}
int main()
{
    char Arr[50] = {'\0'};
    

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    Update(Arr);
    printf("Updated string is : %s\n",Arr);  //it is call by address so give Arr only

    return 0;   
}