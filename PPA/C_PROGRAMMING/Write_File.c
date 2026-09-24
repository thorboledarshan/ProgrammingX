#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    int fd = 0;
    int ret = 0;
    char Arr[]="Marvellous Infosystems";
    fd = open("Marvellous.txt",O_RDWR);

    if(fd==-1)
    {
        printf("unable to open file:\n");
    }
    else
    {
        printf("file gets open with fd: %d\n",fd);
        ret = write(fd,Arr,10);
        printf("%d bytes get written into the file\n",ret);
    }
    close(fd);
    return 0;
}