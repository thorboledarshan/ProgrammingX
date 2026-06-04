//////////////////////////////////////////////////////////////////////////////////////
//
// Q. write a program which accept distance in kilometer and convert it into meter.
//    (1km = 1000m)
///////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int KMtoMeter(int iKM)
{
    int iMeter = 0;
    iMeter = iKM * 1000;
    return iMeter;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter distance in KM:");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);
    printf("Distance in Meter is: %dm",iRet);
    return 0;
}

//////////////////////////////////////
//
// input : 5
// output: 5000
//
//////////////////////////////////////