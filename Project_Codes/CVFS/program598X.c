/////////////////////////
//
// File System operations
//
/////////////////////////

#include<stdio.h>   //Input and Output
#include<fcntl.h>   // contains system calls and inbuilt macros (Permission ->O_RDONLY)
#include<unistd.h>  // use for linux only
#include<string.h>  // contains properties like memeset,strlen

#define BUFFER_SIZE 1024  //user defined macro

void DisplayFile(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'}; // created Array of character to store read value
    int iRet = 0; //stores no.of bytes after reading of file.
    int fd = 0; // stores file descriptor value which is unique in OS.

    fd = open(FileName,O_RDONLY); //open file with permission read only
    
    if(fd == -1) //Filter if file does not exist
    {
        printf("unable to open file\n");
        return ;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)  //Read from fd into buffer max 1024 bytes
    {
        write(1,Buffer,iRet); //kuthey lihayacha(fd), kashyatla, kiti
        memset(Buffer,'\0',sizeof(Buffer)); //erase previous data of buffer and make it clean.
    }

    close(fd); // close opened file.
}

int main()
{ 
    char Fname[30] = {'\0'}; //Takes file name from user

    printf("Enter the file name :\n");
    scanf("%[^\n]s",Fname); //special scanf for string input
    
    DisplayFile(Fname); //function call

    return 0;
}