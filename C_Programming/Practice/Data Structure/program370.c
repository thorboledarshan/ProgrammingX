////////////////////////////////////////
// Template for Singly Linear LinkedList
////////////////////////////////////////

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

void Display(PNODE first)
{}

int Count(PNODE first)
{return 0;}

void InsertFirst(PPNODE first, int ino)
{}

void InsertLast(PPNODE first, int ino)
{}

void InsertAtPos(PPNODE first, int ino, int iPos)
{}

void DeleteFirst(PPNODE first)
{}

void Deletelast(PPNODE first)
{}

void DeleteAtPos(PPNODE first, int iPos)
{}

int main()
{
    PNODE head = NULL;
    
    return 0;
}