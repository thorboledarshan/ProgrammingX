/*
5. Write application which accept file name from user and one string from user. Write
that string at the end of file.

Demo.txt
Hello World
Output : Write Hello World at the end of Demo.txt file
*/

#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

void Display(char FileName[], char str[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0;
    int iRet = 0;
    int i = 0;
    int iCount = 0;

    fd = open(FileName,O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open file \n");
        return;
    }
    
    write(fd,str,strlen(str)); 

    close(fd);

    printf("String written successfully.\n");

    
}
int main()
{
    char Fname[30] = {'\0'};
    char str[30] = {'\0'};
    int iRet = 0;

    printf("Enter File Name :\n");
    scanf("%[^'\n']s",Fname);

    printf("Enter string :\n");
    scanf(" %[^'\n']s",str);


    Display(Fname,str);
    
    

    return 0;
}