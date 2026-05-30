////////////////////////////////////////
//
// Q.Print 5 to 1 Numbers on screen
//
////////////////////////////////////////
#include<stdio.h>

void Display()
{
    int i = 0;
    i=5;
    while(i>=1)
    {
        printf("%d ",i);
        i--;
    }
}
int main()
{
    Display();
    return 0;
}

///////////////////////
//
// output: 5 4 3 2 1
//
///////////////////////