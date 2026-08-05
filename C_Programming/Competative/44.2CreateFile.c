/*
1. Write application which accept file name from user and open that file in read mode.

Input :Demo.txt

Output :File opened successfully.
*/

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

void Display(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0;

    fd = creat(FileName,0777);

    if(fd == -1)
    {
        printf("Unable to open file \n");
        return ;
    }
    else 
    {
        printf("File created successfully\n");
    }
   
    close(fd);
    
}
int main()
{
    char Fname[30] = {'\0'};

    printf("Enter File Name :\n");
    scanf("%[^'\n']s",Fname);


    Display(Fname);
    

    return 0;
}