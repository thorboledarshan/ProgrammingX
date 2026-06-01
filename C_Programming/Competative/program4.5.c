////////////////////////////////////////////////////////////////////////
//
// Q.Write a program which accept number from user  and return difference  
//   between summation of all its non-factors and factors
//
////////////////////////////////////////////////////////////////////////
#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;
    int iSumNF = 0;
    int iSumF = 0;
    int iDiff = 0;
    for(iCnt =1 ;iCnt < iNo; iCnt++)
    {
        if(iNo % iCnt != 0)
        {
          iSumNF = iSumNF + iCnt;
        }
        else
        {
            iSumF = iSumF + iCnt;
        }
    }
    iDiff = iSumF - iSumNF; 
    return iDiff;
    
}
int main()
{
    int iValue = 0;
    int iRet = 0;
    printf("Enter number: ");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);
    printf("Difference between  factors is : %d\n",iRet);
    return 0;
}

///////////////////////////
//
// input : 12
// output: 50
//
/////////////////////////