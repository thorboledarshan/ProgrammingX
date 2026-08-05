/*
1. Write application which accept file name from user and read it and display all data on screen.

Input :Demo.txt
*/

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

void Display(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0;
    int iRet = 0;

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file \n");
        return ;
    }
    
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        write(1,Buffer,iRet);
        memset(Buffer,'\0',sizeof(Buffer));
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