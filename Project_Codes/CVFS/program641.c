#include<stdalign.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    #ifdef _WIN32
        system("dir");
    #else 
        system("ls");
    #endif 
        
    return 0;
}