#include<iostream>
using namespace std;
#pragma pack(1)

class ArrayX
{
  public:
    int *Arr;
    int iSize;
    ArrayX()               //Default constructor
    {

    }
    ArrayX(int X)          //Parameterised constructor
    {

    }
};

int main()
{
  ArrayX aobj1;      //Default constructor
  ArrayX aobj2(5);   //Parameterised constructor
  cout<<sizeof(aobj1)<<endl; 
  return 0;
}