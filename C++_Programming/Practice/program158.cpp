#include<iostream>
using namespace std;
#pragma pack(1)

class ArrayX
{
  public:
    int *Arr;
    int iSize;

    ArrayX(int X)           //Parameterised constructor
    {
      cout<<"Inside Constructor\n";
      iSize = X;             //character initialization
      Arr = new int[iSize];  //Resource allocation
    }

    ~ArrayX()                //Destructor
    {
      cout<<"Inside destructor\n";
      delete []Arr;          //Resource De-allocation
    }
};

int main()
{
  ArrayX aobj1(5);       
  return 0;
}