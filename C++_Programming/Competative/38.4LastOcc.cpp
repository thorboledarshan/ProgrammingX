/*
Write generic program to accept N values and count frequency of any specific
value.
*/

#include<iostream>
using namespace std;

template<class T>

int LastOccurence(T *Arr, int iSize, T Value)
{
    int iCount = 1;
    int iCountLast = 0;
    int i = 0;
    for (i = 0; i <= iSize; i++)
    {
        if(Arr[i] == Value)
        {
            iCountLast = iCount;
        }
        iCount++;
    }
    return iCountLast;
    
}

int main()
{
   int Brr[] = {10,20,30,10,10};
   int iRet = LastOccurence(Brr,5,10);
   printf("Last Occurence is at : %d\n",iRet);

   float Crr[] = {10.0f,20.0f,20.0f,40.0f,50.0f};
   float fRet = LastOccurence(Crr,5,20.0f);
   cout<<"Last Occurence is at : "<<fRet<<endl;

    return 0;
}