#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountCapital(char FileName[]) 
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int iRet = 0, fd = 0, iCountCap = 0, i = 0;

    fd = open(FileName,O_RDONLY);
    
    if(fd == -1)
    {
        printf("unable to open file\n");
        return -1;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] >='A' && Buffer[i] <= 'Z')
            {
                iCountCap++;
            }
        } 
        memset(Buffer,'\0',sizeof(Buffer));
    }

    return iCountCap;
}

int main()
{ 
    char Fname[30] = {'\0'};
    int iRet = 0;
    printf("Enter the file name :\n");
    scanf("%[^'\n']s",&Fname);
    
    iRet = CountCapital(Fname);
    printf("Capital letters are : %d\n",iRet);

    return 0;
}