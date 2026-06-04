//////////////////////////////////////////////////////////////////////////////////////
//
// Q. Write a program which accept radius of circle from user and calculate its area.
//    Consider value of PI as 3.14. (Area = PI * Radius * Radius) .
//
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

double CircleArea(float fRadius)
{
    float PI = 3.14;
    double dArea = 0;
    dArea = PI * fRadius * fRadius;
    return dArea;
}
int main()
{
    float fValue = 0;
    double dRet = 0;

    printf("Enter Radius of circle:");
    scanf("%f", &fValue);

    dRet = CircleArea(fValue);
    printf("Area of circle is: %d\n",dRet);

    return 0;
}

//////////////////////////////////////
//
// input : 10.4
// output: 339.425
//
//////////////////////////////////////