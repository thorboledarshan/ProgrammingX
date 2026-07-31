/*
2. Write generic program to accept N values and count frequency of any specific
value.

Input : 10 20 30 40 50
Value to check frequency : 10
*/

#include<iostream>
using namespace std;

template<class T>

int FirstOccurence(T *Arr, int iSize, T Value)
{
    int iCount = 1;
    int i = 0;
    for (i = 0; i <= iSize; i++)
    {
        if(Arr[i] == Value)
        {
            return iCount;
        }
        iCount++;
    }
    
}

int main()
{
   int Brr[] = {10,20,30,10,10};
   int iRet = FirstOccurence(Brr,5,10);
   printf("First Occurence is at : %d\n",iRet);

   float Crr[] = {10.0f,20.0f,20.0f,40.0f,50.0f};
   float fRet = FirstOccurence(Crr,5,20.0f);
   cout<<"First Occurence is at : "<<fRet<<endl;

    return 0;
}