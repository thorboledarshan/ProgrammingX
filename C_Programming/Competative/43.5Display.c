/*
5. Write a program which accepts file name and one count from user and read
that number of characters from starting position. 
*/

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

void Display(char FileName[], int iSize)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0;
    int fd = 0;

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file \n");
        return ;
    }
   
    iRet = read(fd,Buffer,iSize);

    write(1,Buffer,iRet);

    close(fd);
    
}
int main()
{
    char Fname[30] = {'\0'};
    int iFreq = 0;

    printf("Enter File Name :\n");
    scanf("%[^'\n']s",Fname);

    printf("Enter count :\n");
    scanf("%d",&iFreq);

    Display(Fname,iFreq);
    

    return 0;
}