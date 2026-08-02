#include<stdio.h>

void Display(int iNo)
{
    
    if(iNo > 0)
    {
        printf("%d\t*\t",iNo);
       
        Display(--iNo);
    }
    
}
int main()
{
    int iValue = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    Display(iValue);
    return 0;
}

// 5 * 4 * 3 * 2 * 1 *