#include<stdalign.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    #ifdef _WIN32
        printf("Project is running on windows platform"); 
    #else 
        printf("Project is running on linux platform"); 
    #endif 
        
    return 0;
}