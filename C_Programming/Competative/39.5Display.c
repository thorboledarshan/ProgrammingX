#include<stdio.h>

void Display()
{
    static char ch = 'a';
    if(ch < 'g')
    {
        printf("%c\t", ch);
        ch++;

        Display();
    }
    
}
int main()
{
    Display();
    return 0;
}