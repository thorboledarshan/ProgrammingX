////////////////////////////////////////////////////////////////////////
//
// Q.write a program whcich accept one number from user and print 
//   factors of that number
// 
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

void DisplayFactor(int iNo)
{
    
    if(iNo<=0)
    {
        iNo = -iNo;
    }

    int i = 0;
    for (i=1;i<iNo;i++)
    {
        if((iNo % i==0)) //logic
        printf("%d ",i); 
    }
}
int main()
{
    int iValue=0;
    printf("Enter Number:\n");
    scanf("%d",&iValue);

    DisplayFactor(iValue);
    return 0;
}


///////////////////////////
//
// input : 24
// output: 1 2 4 6 8  12 
//
/////////////////////////