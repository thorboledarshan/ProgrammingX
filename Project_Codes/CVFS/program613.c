///////////////////////////////////////////////////////////////////
//
// Header Files Inclusion
//
////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdbool.h>
#include<fcntl.h>
#include<unistd.h>

///////////////////////////////////////////////////////////////////
//
// User Defined Macros
//
////////////////////////////////////////////////////////////////////

#define MAXINODE 10
#define MAXFILESIZE 50
#define MAXOPENFILES 10

#define READ 1
#define WRITE 2
#define EXECUTE 4

#define START 0
#define CURRENT 1
#define END 2

#define EXECUTE_SUCCESS 0

#define REULARFILE 1
#define SPECIALFILE 2

///////////////////////////////////////////////////////////////////
//
// User defined Macros For Error Handling
//
////////////////////////////////////////////////////////////////////

#define ERR_INVALID_PARAMETER -1

#define ERR_NO_INODES -2

#define ERR_FILE_ALREADY_EXIST -3
#define ERR_FILE_NOT_EXIST -4

#define ERR_PERMISSION_DENIED -5

#define ERR_INSUFFICIENT_SPACE -6
#define ERR_INSUFFICIENT_DATA -7

#define ERR_MAX_FILES_OPEN -8

///////////////////////////////////////////////////////////////////
//
// Structure Name : 
// Description : 
//
////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////
//
// Structure Name : BootBlock
// Description : It holds the information to boot the OS.
//
////////////////////////////////////////////////////////////////////

struct BootBlock
{
    char Information[100];
};

///////////////////////////////////////////////////////////////////
//
// Structure Name :  SuperBlock
// Description : It holds the information of complete File system.
//
////////////////////////////////////////////////////////////////////

struct SuperBlock
{
    int TotalInodes;
    int FreeInodes;
};

///////////////////////////////////////////////////////////////////
//
// Structure Name : Inode
// Description : it holds information of file
//
////////////////////////////////////////////////////////////////////


#pragma pack(1)
struct Inode
{
    char FileName[20];
    int InodeNumber;
    int FileSize;
    int ActualFileSize;
    int FileType;
    int ReferenceCount;
    int Permission;
    char *Buffer;
    struct Inode *next;
};

typedef struct Inode INODE;
typedef struct Inode* PINODE;
typedef struct Inode** PPINODE;

///////////////////////////////////////////////////////////////////
//
// Structure Name : FileTable
// Description : It holds information of opened files
//
////////////////////////////////////////////////////////////////////

#pragma pack(1)
struct FileTable
{
    int ReadOffset;
    int WriteOffset;
    int Mode;
    PINODE ptrinode;
};

typedef struct FileTable FILETABLE;
typedef struct FileTable* PFILETABLE;

///////////////////////////////////////////////////////////////////
//
// Structure Name : UAREA
// Description : It holds information of process
//
////////////////////////////////////////////////////////////////////

struct UAREA
{
    char ProcessName[20];
    PFILETABLE UFDT[MAXOPENFILES];
};

///////////////////////////////////////////////////////////////////
//
// Global Variables used in the projext
//
////////////////////////////////////////////////////////////////////

struct BootBlock bootobj;
struct SuperBlock superobj;
struct UAREA uareaobj;

PINODE head = NULL;

///////////////////////////////////////////////////////////////////
//
// Function Name : InitialiseUAREA
// Description : It is used to initialize UAREA
// Author : Darshan Ananta Thorbole
// Date : 31/7/26
//
////////////////////////////////////////////////////////////////////

void InitialiseUAREA()
{
    int i = 0;

    strcpy(uareaobj.ProcessName,"Myexe");

    for(i = 0; i < MAXOPENFILES; i++)
    {
        uareaobj.UFDT[i] = NULL;
    }

    printf("Marvellous CVFS projects :  UAREA gets initialised successfully \n");

}

///////////////////////////////////////////////////////////////////
//
// Function Name : InitialiseSuperBlock()
// Description : It is used to initialize super block
// Author : Darshan Ananta Thorbole
// Date : 31/7/26
//
////////////////////////////////////////////////////////////////////

void InitialiseSuperBlock()
{
    superobj.TotalInodes = MAXINODE;
    superobj.FreeInodes = MAXINODE;

    printf("Marvellous CVFS project :  Super Block gets initialised successfully \n");
}

///////////////////////////////////////////////////////////////////
//
// Entry Point Function Of CVFS Project
//
////////////////////////////////////////////////////////////////////

int main()
{
    InitialiseUAREA();
    InitialiseSuperBlock();

    return 0;
}