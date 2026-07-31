/*
2. Write generic program to accept N values and count frequency of any specific
value.

Input : 10 20 30 40 50
Value to check frequency : 10
*/

#include<iostream>
using namespace std;

template<class T>

int Frequency(T *Arr, int iSize, T Value)
{
    int iFreq = 0;
    int i = 0;
    for (i = 0; i <= iSize; i++)
    {
        if(Arr[i] == Value)
        {
            iFreq++;
        }
    }
    return iFreq;
}

int main()
{
   int Brr[] = {10,20,30,10,10};
   int iRet = Frequency(Brr,5,10);
   printf("%d\n",iRet);

   float Crr[] = {10.0f,20.0f,20.0f,40.0f,50.0f};
   float fRet = Frequency(Crr,5,20.0f);
   cout<<fRet<<endl;

    return 0;
}