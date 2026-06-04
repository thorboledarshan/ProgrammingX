/////////////////////////////////////////////////////////////////////////////////////////
//
// Q. write a program which accept area  in squarefeet  and convert it into square meter
//    (1Squarefeet =0.0929)
/////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

double SftoSm(float fSquareFeet)
{
    float fSquareMeter = 0.0;
    fSquareMeter = (fSquareFeet * 0.0929);
    return fSquareMeter;
}
int main()
{
    float fValue = 0.0;
    double bRet = 0.0;

    printf("Enter are in squarefeet : ");
    scanf("%f",&fValue);

    bRet = SftoSm(fValue);
    printf("Area in Square Meter is: %f\n",bRet);
    return 0;
}

//////////////////////////////////////
//
// input : 5
// output: 0.046456
//
//////////////////////////////////////