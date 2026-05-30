////////////////////////////////////////////////////////////////////////
//
// Q.write a program whcich accept one number from user and print even 
//   factors of that number
// 
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void DisplayEvenFactor(int iNo)
{
    
    if(iNo<=0)
    {
        iNo = -iNo;
    }

    int i = 0;
    for (i=1;i<iNo;i++)
    {
        if((iNo % i==0) && (i %2==0)) //logic
        printf("%d ",i); 
    }
}
int main()
{
    int iValue=0;
    printf("Enter Number:\n");
    scanf("%d",&iValue);

    DisplayEvenFactor(iValue);
    return 0;
}


///////////////////////////
//
// input : 36
// output: 2 6 12 18 
//
/////////////////////////