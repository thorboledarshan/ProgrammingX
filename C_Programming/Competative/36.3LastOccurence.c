#include<stdio.h>
#include<stdlib.h>


struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;


int Count(PNODE first)
{
    int iCount = 0;
    while(first != NULL) 
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else 
    {
        newn->next = *first;
        *first = newn;
    }
}

void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else 
    {
        temp = *first;

        while(temp->next != NULL)
        {  
            temp = temp->next;  
        }
        temp->next = newn;
    }
}

void InsertAtPos(PPNODE first, int iNo, int iPos)
{
    int iCount = 0;
    int i =0;

    PNODE newn = NULL;
    PNODE temp = NULL;

    iCount = Count(*first);
    
    //Filter
    if((iPos < 1) || (iPos > iCount+1))
    {
        printf("Invalid Position");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,iNo);
    }
    else if(iPos == iCount+1)
    {
        InsertLast(first,iNo);
    }
    else 
    {
      newn = (PNODE)malloc(sizeof(NODE));

      newn->data = iNo;
      newn->next = NULL;

      temp = *first;

      for(i = 1; i < iPos-1; i++)
      {
        temp = temp->next;
      }

      newn->next = temp->next;
      temp->next = newn;
    }   
}

int LastOccur(PNODE first, int iNo)
{
    int iCountX = 1;
    int iLastCount = 0;
    
    while(first != NULL)
    {   
        if(first->data == iNo)
        {
           iLastCount = iCountX;
        }
        iCountX++;
        first = first->next;
    }
    return iLastCount;
}

int main()
{
    PNODE head = NULL;
    int iValue = 0;
    int iRet = 0;

    printf("Enter number to check its First Occurrence :\n");
    scanf("%d",&iValue);

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    InsertLast(&head,101);
    InsertLast(&head,11);

    InsertAtPos(&head,105,4);

    iRet = LastOccur(head,iValue);
    printf("Last Occurrence of given number is : %d\n",iRet);
    
    
    return 0;
}