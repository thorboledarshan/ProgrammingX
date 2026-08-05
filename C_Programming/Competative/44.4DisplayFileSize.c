/*
1. Write application which accept file name from user and display file size

Input :Demo.txt
*/

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int Display(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0;
    int iRet = 0;
    int i = 0;
    int iCount = 0;

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file \n");
        return -1;
    }
    
    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        iCount = iRet + iRet; 
        memset(Buffer,'\0',sizeof(Buffer));
    }

    close(fd);
    return iCount;
    
}
int main()
{
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Enter File Name :\n");
    scanf("%[^'\n']s",Fname);


    iRet = Display(Fname);
    printf("File size is : %d\n",iRet);
    

    return 0;
}