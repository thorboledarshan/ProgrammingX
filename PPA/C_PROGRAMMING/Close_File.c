#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    int fd = 0;
    fd = open("Marvellous.txt",O_RDWR);

    if(fd==-1)
    {
        printf("unable to open file:\n");
    }
    else
    {
        printf("file gets open with fd: %d\n",fd);
    }
    close(fd);
    return 0;
}