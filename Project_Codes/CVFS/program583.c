#include<stdio.h>
#include<fcntl.h>
#include<string.h>

int main()
{
    int fd = 0;
    int iRet = 0;
    char Data[100] = {'\0'};

    fd = open("Marvellous.txt",O_RDONLY); 

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else 
    {
        printf("Files gets successfully opened with fd : %d\n",fd);

        iRet = read(fd,Data,13);
        printf("%d bytes gets successfully read \n",iRet);
        printf("Data from file is : %s\n",Data);


        // ISSUE -> Buffer clean

        iRet = read(fd,Data,3);
        printf("%d bytes gets successfully read \n",iRet);
        printf("Data from file is : %s\n",Data);
        
        close(fd);
    }
    
    return 0;
}