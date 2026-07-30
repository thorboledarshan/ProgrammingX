/*
Write generic program to accept N values from user and return max of that values.
*/

#include<iostream>
using namespace std;

template<class T>

T Max(T *Arr, int iSize)
{
    T Max = 0;
    int i = 0;

    for(i = 0; i < iSize; i++)
    {
        if(Arr[i] > Max)
        {
            Max = Arr[i];
        }
    }
    return Max;
}

int main()
{
    int Brr[] = {10,20,30,40,50};
    float Crr[] = {10.0f,20.0f,30.5f,40.0f,50.0f};

    int iRet = Max(Brr,5);
    printf("Max number  is : %d\n",iRet);

    float fRet = Max(Crr,5);
    printf("Max number is : %f\n",fRet);

    
    return 0;
}