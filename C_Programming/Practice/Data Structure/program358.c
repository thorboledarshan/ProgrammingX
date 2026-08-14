#include<stdio.h>
#pragma pack(1)

typedef struct node NODE;

struct node
{
  int data;
  struct node *next;
};

int main()
{
  NODE *head = NULL;
  NODE obj1,obj2,obj3; 

  head = &obj1;

  obj1.data = 11;
  obj1.next = &obj2;

  obj2.data = 21;
  obj2.next = &obj3;

  obj3.data = 51;
  obj3.next = NULL;
  
  printf("%d\n",head->data); //11
  printf("%d\n",head->next->data); //21
  printf("%d\n",head->next->next->data); //51
  
  return 0;
}