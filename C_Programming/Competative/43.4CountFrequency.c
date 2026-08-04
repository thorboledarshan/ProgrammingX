#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountFrequency(char FileName[], char ch)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0;
    int fd = 0;
    int iCount = 0;
    int i = 0;

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file \n");
        return -1;
    }
   
    while((iRet = read(fd,Buffer,sizeof(Buffer)))!= 0)
    {
        for (i = 0; i < iRet; i++)
        {
            if(Buffer[i] == ch) 
            {
                iCount++;
            }
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);
    
    return iCount;
    
}
int main()
{
    char Fname[30] = {'\0'};
    int iRet = 0;
    char ch = '\0';

    printf("Enter File Name :\n");
    scanf("%[^'\n']s",Fname);

    printf("Enter character :\n");
    scanf(" %c",&ch);

    iRet = CountFrequency(Fname,ch);
    printf("frequency is : %d\n",iRet);

    return 0;
}