#include<stdio.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 100 

int main()
{
    int fd = 0;
    int iRet = 0;
    char Data[BUFFER_SIZE] = {'\0'};

    fd = open("Marvellous.txt",O_RDONLY); 

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else 
    {
        lseek(fd,-10,2);          //(0 = Starting, 1 = cureent position, 2 = End)

        iRet = read(fd,Data,10);
        printf("%d bytes gets successfully read \n",iRet);

        printf("Data from file is %s\n",Data);

        close(fd);
    }
    
    return 0;
}