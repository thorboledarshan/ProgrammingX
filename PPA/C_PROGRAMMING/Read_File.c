#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    int fd = 0;
    int ret = 0;
    char Arr[20];
    fd = open("Marvellous.txt",O_RDWR);

    if(fd==-1)
    {
        printf("unable to open file:\n");
    }
    else
    {
        printf("file gets open with fd: %d\n",fd);
        ret = read(fd,Arr,6);
        printf("%d bytes get read from  file\n",ret);
        printf("%s\n",Arr);
    }
    close(fd);
    return 0;
}