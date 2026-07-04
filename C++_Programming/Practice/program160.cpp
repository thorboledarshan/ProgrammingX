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
  //Static memory allocation for object
  //ArrayX aobj1(5); 
  
  ArrayX *aobj1 = new ArrayX(5);
  
  delete aobj1;
  cout<<"End of main \n";
  return 0;
}