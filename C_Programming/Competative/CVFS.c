//////////////////////////////////////////////////////
//
//  Header Files Inclusion
//
//////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>
#include<stdbool.h>

//////////////////////////////////////////////////////
//
//  User Defined Macros
//
//////////////////////////////////////////////////////

#define MAXINODE 50      //Max number of virtual files
#define MAXFILESIZE 1024 //Maximum size of one file(bytes)1KB
#define MAXOPENFILES 50

#define READ 1
#define WRITE 2
#define EXECUTE 4

#define START 0
#define CURRENT 1
#define END 2

#define EXECUTE_SUCCESS 0

#define REGULARFILE 1
#define SPECIALFILE 2

//////////////////////////////////////////////////////
//
//  User Defined Macros for error handling
//
//////////////////////////////////////////////////////

#define ERR_INVALID_PARAMETER -1

#define ERR_NO_INODES -2

#define ERR_FILE_ALREADY_EXIST -3
#define ERR_FILE_NOT_EXIST -4

#define ERR_PERMISSION_DENIED -5

#define ERR_INSUFFICIENT_SPACE -6
#define ERR_INSUFFICIENT_DATA -7

#define ERR_MAX_FILES_OPEN -8

//////////////////////////////////////////////////////
//
//  Function Name :     DisplayWelcomeBanner()
//  Description :       It is used to display the welcome
//                      banner when the project starts
//  Author :            Darshan Ananta Thorbole
//  Date :              05/08/2026
//
//////////////////////////////////////////////////////

void DisplayWelcomeBanner()
{
    
    printf("-------------------------------...Jay Ganesh...Welcome to CVFS Project...----------------------\n");
    printf("Project : Customised virtual File System which Simulates functioniality of Linux File System .\n");
    printf("Author : Darshan Ananta Thorbole\n");
    printf("-----------------------------------------------------------------------------------------------\n");
}


//////////////////////////////////////////////////////
//
//  Structure Name :    BootBlock
//  Description :       It holds the information to
//                      boot the operating system
//
//////////////////////////////////////////////////////

struct BootBlock
{
    char Information[100];
};

//////////////////////////////////////////////////////
//
//  Structure Name :    SuperBlock
//  Description :       It holds the information of
//                      complete File system
//
//////////////////////////////////////////////////////

struct SuperBlock
{
    int TotalInodes;
    int FreeInodes;
};

//////////////////////////////////////////////////////
//
//  Structure Name :    Inode
//  Description :       It holds information of file
//
//////////////////////////////////////////////////////

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

//////////////////////////////////////////////////////
//
//  Structure Name :    FileTable
//  Description :       It holds information of opened
//                      files
//
//////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////
//
// Structure Name : BACKUPFILE
// Description    : Stores virtual file information
//                  into backup file
// Author         : Darshan Ananta Thorbole
//
/////////////////////////////////////////////////////////

struct BackupFile
{
    char FileName[20];
    int Permission;
    int FileType;
    int ActualFileSize;
    char Buffer[MAXFILESIZE];
};

typedef struct BackupFile BACKUPFILE;

//////////////////////////////////////////////////////
//
//  Structure Name :    UAREA
//  Description :       It holds information of process
//
//////////////////////////////////////////////////////

struct UAREA
{
    char ProcessName[20];
    PFILETABLE UFDT[MAXOPENFILES];
};

//////////////////////////////////////////////////////
//
//  Global variables used in the project
//
//////////////////////////////////////////////////////

struct BootBlock bootobj;
struct SuperBlock superobj;
struct UAREA uareaobj;
struct BackupFile backupobj;

PINODE head = NULL;


//////////////////////////////////////////////////////
//
//  Function Name :     InitialiseUAREA
//  Description :       It is used to initialise UAREA
//  Author :            Darshan Ananta Thorbole
//  Date :              31/07/2026
//
//////////////////////////////////////////////////////

void InitialiseUAREA()
{
    int i = 0;

    strcpy(uareaobj.ProcessName, "Myexe");
    
    for(i = 0; i < MAXOPENFILES; i++)
    {
        uareaobj.UFDT[i] = NULL;
    }

    printf("Marvellous CVFS : UAREA gets initalised succesfully\n");
}

//////////////////////////////////////////////////////
//
//  Function Name :     InitialiseSuperBlock()
//  Description :       It is used to initialise super block
//  Author :            Darshan Ananta Thorbole
//  Date :              31/07/2026
//
//////////////////////////////////////////////////////

void InitialiseSuperBlock()
{
    superobj.TotalInodes = MAXINODE;
    superobj.FreeInodes = MAXINODE;

    printf("Marvellous CVFS : Super Block gets initalised succesfully\n");
}

//////////////////////////////////////////////////////
//
//  Function Name :     CreateDILB()
//  Description :       It is used to create linked list of inodes
//  Author :            Darshan Ananta Thorbole
//  Date :              31/07/2026
//
//////////////////////////////////////////////////////

void CreateDILB()
{
    PINODE temp = NULL;
    PINODE newn = NULL;

    int i = 0;

    temp = head;

    for(i = 1; i <= MAXINODE; i++)
    {
        newn = (PINODE)malloc(sizeof(INODE));

        newn->InodeNumber = i;
        strcpy(newn->FileName,"\0");
        newn->FileSize = 0;
        newn->ActualFileSize = 0;
        newn->FileType = 0;
        newn->ReferenceCount = 0;
        newn->Permission = 0;
        newn->Buffer = NULL;

        if(temp == NULL)
        {
            head = newn;
            temp = head;
        }
        else
        {
            temp->next = newn;
            temp = temp->next;
        }
    }

    printf("Marvellous CVFS : DILB gets created succesfully\n");
}

//////////////////////////////////////////////////////
//
//  Function Name :     StartAuxillaryDataInitialisation()
//  Description :       It is used to call all such functions
//                      which are used to initialise auxillary data
//  Author :            Darshan Ananta Thorbole
//  Date :              31/07/2026
//
//////////////////////////////////////////////////////

void StartAuxillaryDataInitialisation()
{
    strcpy(bootobj.Information,"Booting process of Marvellous CVFS is completed");

    printf("%s\n",bootobj.Information);
    
    InitialiseUAREA();
    
    InitialiseSuperBlock();

    CreateDILB();
}

//////////////////////////////////////////////////////
//
//  Function Name :     DisplayHelp()
//  Description :       It is used to display help to
//                      the user of project
//  Author :            Darshan Ananta Thorbole
//  Date :              1/08/2026
//
//////////////////////////////////////////////////////

void DisplayHelp()
{
    printf("---------------------------------------------------------------------------------\n");
    printf("---------------------------- Marvellous CVFS Help Page --------------------------\n");
    printf("---------------------------------------------------------------------------------\n");

    printf("man     : Display manual page      | Usage : man Command_name\n");
    printf("clear   : Clear terminal screen    | Usage : clear\n");
    printf("creat   : Create new file          | Usage : creat File_name Permission\n");
    printf("open    : Open existing file       | Usage : open File_name Permission\n");
    printf("close   : Close open file          | Usage : close File_descriptor\n");
    printf("write   : Write data into file     | Usage : write File_descriptor\n");
    printf("read    : Read data from file      | Usage : read File_descriptor Size\n");
    printf("stat    : Show file information    | Usage : stat File_name\n");
    printf("unlink  : Delete a file            | Usage : unlink File_name\n");
    printf("ls      : List all files           | Usage : ls\n");
    printf("ls -a   : List files with details  | Usage : ls -a\n");
    printf("exit    : Terminate the project    | Usage : exit\n");

    printf("---------------------------------------------------------------------------------\n");
}

//////////////////////////////////////////////////////
//
//  Function Name :     ManPageDisplay()
//  Description :       It is used to display the manual
//                      page of a specific command in the
//                      standard Linux 'man' page format
//  Input :             Name of command
//  Output :            None
//  Author :            Darshan Ananta Thorbole
//  Date :              01/08/2026 -> 05/08/2026
//
//////////////////////////////////////////////////////

void ManPageDisplay(char Name[])
{
    if(strcmp(Name,"exit") == 0)
    {
        printf("-------------------------------------------------------\n");
        printf("NAME\n");
        printf("       exit - terminate the Marvellous CVFS shell\n\n");
        printf("SYNOPSIS\n");
        printf("       exit\n\n");
        printf("DESCRIPTION\n");
        printf("       Terminates the Marvellous CVFS project and\n");
        printf("       deallocates all resources held by it.\n");
        printf("-------------------------------------------------------\n");
    }
    else if(strcmp(Name,"ls") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       ls - list files present in Marvellous CVFS\n\n");
        printf("SYNOPSIS\n");
        printf("       ls [-a]\n\n");
        printf("DESCRIPTION\n");
        printf("       Lists the names of all files currently present.\n");
        printf("       -a     Also display inode number and file size\n");
        printf("              along with the file name.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"clear") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       clear - clear the terminal screen\n\n");
        printf("SYNOPSIS\n");
        printf("       clear\n\n");
        printf("DESCRIPTION\n");
        printf("       Clears the terminal screen of Marvellous CVFS.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"creat") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       creat - create a new regular file\n\n");
        printf("SYNOPSIS\n");
        printf("       creat File_name Permission\n\n");
        printf("DESCRIPTION\n");
        printf("       Creates a new regular file inside Marvellous CVFS.\n\n");
        printf("       File_name    Name of the file to be created.\n\n");
        printf("       Permission   Access rights for the new file:\n");
        printf("                    1   Read only\n");
        printf("                    2   Write only\n");
        printf("                    3   Read and Write\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"unlink") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       unlink - delete an existing file\n\n");
        printf("SYNOPSIS\n");
        printf("       unlink File_name\n\n");
        printf("DESCRIPTION\n");
        printf("       Deletes the specified file and releases the\n");
        printf("       inode and data block associated with it.\n\n");
        printf("       File_name    Name of the file to be deleted.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"stat") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       stat - display file status information\n\n");
        printf("SYNOPSIS\n");
        printf("       stat File_name\n\n");
        printf("DESCRIPTION\n");
        printf("       Displays detailed inode information for the\n");
        printf("       specified file, including size, permissions,\n");
        printf("       reference count and file type.\n\n");
        printf("       File_name    Name of the file to inspect.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"read") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       read - read data from a file\n\n");
        printf("SYNOPSIS\n");
        printf("       read File_descriptor Size\n\n");
        printf("DESCRIPTION\n");
        printf("       Reads Size bytes of data from the file\n");
        printf("       associated with File_descriptor, starting\n");
        printf("       from the current read offset, and displays\n");
        printf("       the data that was read.\n\n");
        printf("       File_descriptor   Descriptor returned by creat.\n\n");
        printf("       Size              Number of bytes to read.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"write") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       write - write data into a file\n\n");
        printf("SYNOPSIS\n");
        printf("       write File_descriptor\n\n");
        printf("DESCRIPTION\n");
        printf("       Writes data, entered by the user on the next\n");
        printf("       line, into the file associated with\n");
        printf("       File_descriptor, starting from the current\n");
        printf("       write offset.\n\n");
        printf("       File_descriptor   Descriptor returned by creat.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"open") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       open - open an existing file\n\n");
        printf("SYNOPSIS\n");
        printf("       open File_name Permission\n\n");
        printf("DESCRIPTION\n");
        printf("       Opens an existing file and returns a file\n");
        printf("       descriptor that can be used with read and\n");
        printf("       write. In this version of Marvellous CVFS,\n");
        printf("       creat performs file creation and opening\n");
        printf("       together.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"close") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       close - close an open file descriptor\n\n");
        printf("SYNOPSIS\n");
        printf("       close File_descriptor\n\n");
        printf("DESCRIPTION\n");
        printf("       Closes the file associated with\n");
        printf("       File_descriptor and releases the file table\n");
        printf("       entry, decrementing the file's reference\n");
        printf("       count.\n");
        printf("----------------------------------------------------------\n");
    }
    else if(strcmp(Name,"ls -a") == 0)
    {
        printf("----------------------------------------------------------\n");
        printf("NAME\n");
        printf("       ls -a - list files with detailed information\n\n");
        printf("SYNOPSIS\n");
        printf("       ls -a\n\n");
        printf("DESCRIPTION\n");
        printf("       Lists the name, inode number and actual\n");
        printf("       file size of every file currently present\n");
        printf("       in Marvellous CVFS.\n");
        printf("----------------------------------------------------------\n");
    }
    else
    {
        printf("No manual entry for %s\n", Name);
    }
}

//////////////////////////////////////////////////////
//
//  Function Name :     IsFileExist()
//  Description :       It is used to check whether the
//                      file is presnt or not
//  Input :             Name of file 
//  Output :            True of presnt
//                      False is not present
//  Author :            Darshan Ananta Thorbole
//  Date :              1/08/2026
//
//////////////////////////////////////////////////////

bool IsFileExist(
                    char name[]     // Name of file
                )
{
    PINODE temp = head;
    bool bFlag = false;

    while(temp != NULL)
    {
        if(strcmp(temp->FileName, name) == 0)
        {
            bFlag = true;
            break;
        }

        temp = temp ->next;
    }

    return bFlag;
}

//////////////////////////////////////////////////////
//
//  Function Name :     CreateFile()
//  Description :       It is used to create new file
//  Input :             Name of file & Permissions
//  Output :            File Descriptor
//  Author :            Darshan Ananta Thorbole
//  Date :              1/08/2026
//
//////////////////////////////////////////////////////

int CreateFile (
                    char name[],        // Name of file
                    int permission      // File permission
               )
{
    int i = 0;

    PINODE temp = head;

    if(superobj.FreeInodes == 0)
    {
        return ERR_NO_INODES;
    }

    // If permission value is wrong
    // Permission = 1 -> READ
    // Permission = 2 -> WRITE
    // Permission = 3 -> READ + WRITE

    if(permission < 1 || permission > 3)
    {
        return ERR_INVALID_PARAMETER;
    }
    
    if(IsFileExist(name) == true)
    {
        return ERR_FILE_ALREADY_EXIST;
    }
    
    // Search for empty inode
    while(temp != NULL)
    {
        if(temp->FileType == 0)
        {
            break;
        }

        temp = temp -> next;
    }   

    // Rare case
    if(temp == NULL)
    {
        return ERR_NO_INODES;
    }

    // Search empty UFDT entry
    // Reserve first 3 FD's
    
    for(i = 3; i < MAXINODE; i++)
    {
        if(uareaobj.UFDT[i] == NULL)
        {
            break;
        }
    }

    if(i == MAXOPENFILES)
    {
        return ERR_MAX_FILES_OPEN;
    }

    // Allocate memory for file table

    uareaobj.UFDT[i] = (PFILETABLE)malloc(sizeof(FILETABLE));

    // Initialise File table
    uareaobj.UFDT[i]->ReadOffset = 0;
    uareaobj.UFDT[i]->WriteOffset = 0;
    uareaobj.UFDT[i]->Mode = permission;
    
    // Connect File table with Inode
    uareaobj.UFDT[i]->ptrinode = temp;

    // Initialise all members of inode
    strcpy(uareaobj.UFDT[i]->ptrinode->FileName,name);

    uareaobj.UFDT[i]->ptrinode->FileSize = MAXFILESIZE;

    uareaobj.UFDT[i]->ptrinode->ActualFileSize = 0;

    uareaobj.UFDT[i]->ptrinode->FileType = REGULARFILE;

    uareaobj.UFDT[i]->ptrinode->ReferenceCount = 1;

    uareaobj.UFDT[i]->ptrinode->Permission = permission;

    // Allocate memory for files data (Data Block)

    uareaobj.UFDT[i]->ptrinode->Buffer = (char *)malloc(MAXFILESIZE);

    superobj.FreeInodes--;
    
    return i;
}

//////////////////////////////////////////////////////
//
//  Function Name :     LsFile()
//  Description :       It is used to display names of 
//                      all files
//  Input :             None
//  Output :            None
//  Author :            Darshan Ananta Thorbole
//  Date :              1/08/2026
//
//////////////////////////////////////////////////////

void LsFile()
{
    PINODE temp = head;

    printf("-----------------------------------------------\n");
    printf("------ Marvellous CVFS Files Information ------\n");
    printf("-----------------------------------------------\n");

    while(temp != NULL)
    {
        if(temp->FileType != 0)
        {
            printf("%s\n",temp->FileName);
        }

        temp = temp->next;
    }
}

//////////////////////////////////////////////////////
//
//  Function Name :     LsFile_All()
//  Description :       It is used to display all details  
//                      of all files
//  Input :             None
//  Output :            None
//  Author :            Darshan Ananta Thorbole
//  Date :              2/08/2026
//
//////////////////////////////////////////////////////

void LsFile_All()
{
    PINODE temp = head;

    printf("-----------------------------------------------\n");
    printf("------ Marvellous CVFS Files Information ------\n");
    printf("-----------------------------------------------\n");

    while(temp != NULL)
    {
        if(temp->FileType != 0)
        {
            printf("%s %d %d\n",temp->FileName, temp->InodeNumber, temp->ActualFileSize);
        }

        temp = temp->next;
    }
}

//////////////////////////////////////////////////////
//
//  Function Name :     stat_file()
//  Description :       It is used to display all details  
//                      of specific files
//  Input :             File name
//  Output :            Exit status of function
//  Author :            Darshan Ananta Thorbole
//  Date :              2/08/2026
//
//////////////////////////////////////////////////////

int stat_file(
                char name[]     // Name of file
             )
{
    PINODE temp = NULL;
    
    int Permission = 0;
    int Type = 0;

    if(IsFileExist(name) == false)
    {
        return ERR_FILE_NOT_EXIST;
    }
    
    temp = head;

    while(temp != NULL)
    {
        if(strcmp(temp->FileName, name) == 0)
        {
            printf("-----------------------------------------------\n");
            printf("------- Statistical information of File -------\n");
            printf("-----------------------------------------------\n");
  
            printf("File name : %s\n",temp->FileName);
            
            printf("Inode number : %d\n",temp->InodeNumber);
            
            printf("File size : %d\n",temp->FileSize);

            printf("Actual File size : %d\n",temp->ActualFileSize);

            printf("Reference Count : %d\n",temp->ReferenceCount);

            Permission = temp->Permission;

            if(Permission == READ)
            {
                printf("File Permission : Read Only\n");
            }
            else if(Permission == WRITE)
            {
                printf("File Permission : Write\n");
            }
            else if(Permission == READ + WRITE)
            {
                printf("File Permission : Read + Write\n");
            }

            Type = temp->FileType;

            if(Type == REGULARFILE)
            {
                printf("File type : Regular File\n");
            }
            else if(Type == SPECIALFILE)
            {
                printf("File type : Special File\n");
            }

            printf("-----------------------------------------------\n");

            break;
        }

        temp = temp->next;
    }
    
    return EXECUTE_SUCCESS;
}

//////////////////////////////////////////////////////
//
//  Function Name :     unlink_file()
//  Description :       It is used to delete
//                      the specific file
//  Input :             File name
//  Output :            Exit status of function
//  Author :            Darshan Ananta Thorbole
//  Date :              2/08/2026
//
//////////////////////////////////////////////////////

int unlink_file(
                    char name[]     // Name of file
               )
{
    int i = 0;

    if(IsFileExist(name) == false)
    {
        return ERR_FILE_NOT_EXIST;
    }

    // Travel the UFDT
    for(i = 0; i < MAXOPENFILES; i++)
    {
        if(uareaobj.UFDT[i] != NULL)
        {
            if(strcmp(uareaobj.UFDT[i]->ptrinode->FileName, name) == 0)
            {
                // Deallocate memory of Buffer
                free(uareaobj.UFDT[i]->ptrinode->Buffer);
    
                uareaobj.UFDT[i]->ptrinode->Buffer = NULL;

                strcpy(uareaobj.UFDT[i]->ptrinode->FileName,"\0");

                uareaobj.UFDT[i]->ptrinode->FileSize = 0;

                uareaobj.UFDT[i]->ptrinode->ActualFileSize = 0;

                uareaobj.UFDT[i]->ptrinode->FileType = 0;

                uareaobj.UFDT[i]->ptrinode->Permission = 0;

                uareaobj.UFDT[i]->ptrinode->ReferenceCount = 0;

                // Deallocate memory of File table

                free(uareaobj.UFDT[i]);

                uareaobj.UFDT[i] = NULL;

                superobj.FreeInodes++;

                break;  // IMPORTANT
            }
        } // End of if
    } // End of for

    return EXECUTE_SUCCESS;
    
} // End of unlink_file function

/////////////////////////////////////////////////////////
//
//  Function Name :     open_file()
//  Description :       It is used to open an existing
//                      file and get a file descriptor
//                      for it
//  Input :             Name of file & Permission with
//                      which it should be opened
//  Output :            File Descriptor on success,
//                      negative error code on failure
//  Author :            Darshan Ananta Thorbole
//  Date :              05/08/2026
//
////////////////////////////////////////////////////////

int open_file(char name[], int permission)
{
    int i = 0;
    PINODE temp = head;

    // Permission value must be valid
    if(permission < 1 || permission > 3)
    {
        return ERR_INVALID_PARAMETER;
    }

    // File must already exist then only program will not go further. it will terminate here.
    if(IsFileExist(name) == false)
    {
        return ERR_FILE_NOT_EXIST;
    }

    // Locate the inode for this file
    while(temp != NULL)
    {
        if(strcmp(temp->FileName, name) == 0)
        {
            break;
        }
        temp = temp->next;
    }

    // Requested access cannot exceed the file's actual permission
    if(permission > temp->Permission)
    {
        return ERR_PERMISSION_DENIED;
    }

    // Search for an empty UFDT entry (first 3 FDs reserved)
    for(i = 3; i < MAXOPENFILES; i++)
    {
        if(uareaobj.UFDT[i] == NULL)
        {
            break;
        }
    }

    if(i == MAXOPENFILES)
    {
        return ERR_MAX_FILES_OPEN;
    }

    // Allocate and initialise a new File Table entry
    uareaobj.UFDT[i] = (PFILETABLE)malloc(sizeof(FILETABLE));

    uareaobj.UFDT[i]->ReadOffset = 0;
    uareaobj.UFDT[i]->WriteOffset = 0;
    uareaobj.UFDT[i]->Mode = permission;
    uareaobj.UFDT[i]->ptrinode = temp;

    // One more open instance now references this inode
    temp->ReferenceCount++;

    return i;
}

/////////////////////////////////////////////////////////
//
//  Function Name :     close_file()
//  Description :       It is used to close an existing
//                      file.
//  Input :            File Descriptor
//  Output :            Positive on success,
//                      negative error code on failure
//  Author :            Darshan Ananta Thorbole
//  Date :              05/08/2026
//
////////////////////////////////////////////////////////

int close_file(int fd)
{
    //Invalid fd range
    if(fd < 3 || fd >=MAXOPENFILES)
    {
        return ERR_INVALID_PARAMETER;
    }

    //file not open
    if(uareaobj.UFDT[fd] == NULL)
    {
        return ERR_FILE_NOT_EXIST;
    }

    // Reduce Refference Count
    if(uareaobj.UFDT[fd]->ptrinode->ReferenceCount > 0)
    {
        uareaobj.UFDT[fd]->ptrinode->ReferenceCount--;
    }

    free(uareaobj.UFDT[fd]);

    uareaobj.UFDT[fd] = NULL;

    return EXECUTE_SUCCESS;
}

///////////////////////////////////////////////////////////////////
//
//  Function Name :     lseek_file()
//  Description :       It is used to reposition of 
//                      read/write offset of file.
//  Input :             File Descriptor,
//                      No.of bytes to move offset pointer(Offset),
//                      Starting Position
//  Output :            Positive on success,
//                      negative error code on failure
//  Author :            Darshan Ananta Thorbole
//  Date :              05/08/2026
//
///////////////////////////////////////////////////////////////////

int lseek_file(int fd, int Offset, int Position)
{
    int NewOffset = 0;

    //validate fd
    if(fd < 3 || fd >=MAXOPENFILES)
    {
        return ERR_INVALID_PARAMETER;
    }

    //Check file is open or not
    if(uareaobj.UFDT[fd] == NULL)
    {
        return ERR_FILE_NOT_EXIST;
    }

    while(1)
    {
        if(Position == 0)
        {
            NewOffset = Offset;
            break;
        }
        else if(Position == 1)
        {
            NewOffset = uareaobj.UFDT[fd]->ReadOffset + Offset;
            break;
        }
        else if(Position == 2)
        {
            NewOffset = uareaobj.UFDT[fd]->ptrinode->ActualFileSize + Offset;
            break;
        }
        else 
        {
            return ERR_INVALID_PARAMETER;
            break;
        }
    }

    // Boundary Check
    if(NewOffset < 0 || NewOffset > uareaobj.UFDT[fd]->ptrinode->ActualFileSize)
    {
        return ERR_INVALID_PARAMETER;
    }

    uareaobj.UFDT[fd]->ReadOffset = NewOffset;
    uareaobj.UFDT[fd]->WriteOffset = NewOffset;

    return EXECUTE_SUCCESS;
}

//////////////////////////////////////////////////////
//
//  Function Name :     write_file()
//  Description :       It is used to write the data
//                      into specific file
//  Input :             File Descriptior
//                      Data that we want to write
//                      Size of data
//  Output :            Number of bytes succesfully written
//  Author :            Darshan Ananta Thorbole
//  Date :              2/08/2026
//
//////////////////////////////////////////////////////

int write_file(
                    int fd,
                    char *data,
                    int size
              )
{
    int offset = 0;

    printf("File Descriptor : %d\n",fd);
    printf("Data that we want to write : %s\n",data);
    printf("Size of data : %d\n",size);

    // If fd is invalid
    if(fd < 0 || fd > MAXOPENFILES)
    {
        return ERR_INVALID_PARAMETER;
    }

    // If writting permission is not there
    if(uareaobj.UFDT[fd]->ptrinode->Permission < WRITE)
    {
        return ERR_PERMISSION_DENIED;
    }

    // Check the space is there or not
    if((MAXFILESIZE - uareaobj.UFDT[fd]->WriteOffset) < size)
    {
        return ERR_INSUFFICIENT_SPACE;
    }

    

    // Actual data writting
    strncpy(uareaobj.UFDT[fd]->ptrinode->Buffer + uareaobj.UFDT[fd]->WriteOffset,data,size);


    // Update the write offset

    uareaobj.UFDT[fd]->WriteOffset = uareaobj.UFDT[fd]->WriteOffset + size;

    // Update actual file size

    uareaobj.UFDT[fd]->ptrinode->ActualFileSize = uareaobj.UFDT[fd]->ptrinode->ActualFileSize + size;

    return size;
}

//////////////////////////////////////////////////////
//
//  Function Name :     read_file()
//  Description :       It is used to read the data
//                      from specific file
//  Input :             File Descriptior
//                      address of empty buffer
//                      Size of data
//  Output :            Number of bytes succesfully read
//  Author :            Darshan Ananta Thorbole
//  Date :              2/08/2026
//
//////////////////////////////////////////////////////

int read_file(
                int fd,
                char *data,
                int size
            )
{
    // Invalid FD

    if(fd < 0 || fd > MAXOPENFILES)
    {
        return ERR_INVALID_PARAMETER;
    }

    if(size < 0)
    {
        return ERR_INVALID_PARAMETER;
    }

    if(uareaobj.UFDT[fd] == NULL)
    {
        return ERR_FILE_NOT_EXIST;
    }

    // Filter for permission
    if(uareaobj.UFDT[fd]->ptrinode->Permission < READ)
    {
        return ERR_PERMISSION_DENIED;
    }

    // Insufficent data
    if((MAXFILESIZE - uareaobj.UFDT[fd]->ReadOffset) < size)
    {
        return ERR_INSUFFICIENT_DATA;
    }

    // Read the data
    strncpy(data,uareaobj.UFDT[fd]->ptrinode->Buffer + uareaobj.UFDT[fd]->ReadOffset, size);

    uareaobj.UFDT[fd]->ReadOffset = uareaobj.UFDT[fd]->ReadOffset + size;

    return size;
}

/////////////////////////////////////////////////////////
//
// Function Name : backup()
// Description   : Stores all virtual files into
//                 backup.dat before termination
// Author        : Darshan Ananta Thorbole
// Date :        : 5/08/2026
//
/////////////////////////////////////////////////////////

void backup()
{
    FILE *fp = NULL;
    PINODE temp = head;


    fp = fopen("backup.data","wb");

    if(fp == NULL)
    {
        printf("Unable to create backup file\n");
        return;
    }

    while(temp != NULL)
    {
        if(temp->FileType == REGULARFILE)
        {
            memset(&backupobj,0,sizeof(BACKUPFILE));

            strcpy(backupobj.FileName,temp->FileName);
            backupobj.Permission = temp->Permission;
            backupobj.FileType = temp->FileType;
            backupobj.ActualFileSize = temp->ActualFileSize;

            if(temp->ActualFileSize > 0)
            {
                memcpy(backupobj.Buffer,temp->Buffer, temp->ActualFileSize); 
            }

            fwrite(&backupobj,sizeof(BACKUPFILE),1,fp);
        }

        temp = temp->next;
    }

    fclose(fp);

    printf("\nBackup completed successfully.\n");
}

/////////////////////////////////////////////////////////
//
// Function Name : restore()
// Description   : Restores all virtual files from
//                 backup.data during startup
// Author        : Darshan Ananta Thorbole
// Date :        : 5/08/2026
//
/////////////////////////////////////////////////////////

void restore()
{
    FILE *fp = NULL;
    

    int fd = 0;

    fp = fopen("backup.data","rb");

    if(fp == NULL)
    {
        printf("No backup file found.\n");
        return;
    }

    while(fread(&backupobj,sizeof(BACKUPFILE),1,fp) == 1)
    {
        fd = CreateFile(backupobj.FileName,backupobj.Permission);

        if(fd >= 3)
        {
            memcpy(uareaobj.UFDT[fd]->ptrinode->Buffer,
                   backupobj.Buffer,
                   backupobj.ActualFileSize);

            uareaobj.UFDT[fd]->ptrinode->ActualFileSize = backupobj.ActualFileSize;
            uareaobj.UFDT[fd]->WriteOffset = backupobj.ActualFileSize;
        
            close_file(fd);
        }
    }

    printf("Backup restored successfully.\n");

    fclose(fp);
}


//////////////////////////////////////////////////////
//
//  Entry Point function of the CVFS project
//
//////////////////////////////////////////////////////

int main()
{
    // Input command
    char str[80] = {'\0'};

    char str1[10] = {'\0'};
    
    // Tokenised command
    char Command[5][20] = {{'\0'}};
    
    // Data for write system call
    char InputBuffer[MAXFILESIZE] = {'\0'};

    int iCount = 0, iRet = 0;

    int size = 0;
    
    char *EmptyBuffer = NULL;

    DisplayWelcomeBanner();

    StartAuxillaryDataInitialisation();

    restore();
    
    printf("-----------------------------------------------\n");
    printf("----- Marvellous CVFS started succesfully -----\n");
    printf("-----------------------------------------------\n");

    printf("Note : Type command help to open help page\n");

    // Infinite Listening Shell
    while(1)
    {
        fflush(stdin);
        
        strcpy(str,"");

        printf("\nMarvellous CVFS : > ");
        fgets(str,sizeof(str),stdin);

        iCount = sscanf(str,"%s %s %s %s %s",Command[0],Command[1],Command[2],Command[3],Command[4]);

        fflush(stdin);
        
        if(iCount == 1)
        {
            // Marvellous CVFS : > exit
            if(strcmp(Command[0],"exit") == 0)
            {
               printf("Do you want to backup current files? (Y/N): ");
               scanf("%s", str1);

               if(strcmp(str1,"Y") == 0)
               {
                    backup();
                    printf("Backup stored into backup.data\n");
               }
               
               printf("Thank you for using Marvellous CVFS\n");
               printf("Deallocating all resources...\n");
               break;
            }
            // Marvellous CVFS : > help
            else if(strcmp(Command[0],"help") == 0)
            {
                DisplayHelp();
            }
            // Marvellous CVFS : > clear            
            else if(strcmp(Command[0],"clear") == 0)
            {
                #ifdef _WIN32
                    system("cls");
                #else
                    system("clear");
                #endif
            }
            // Marvellous CVFS : > ls            
            else if(strcmp(Command[0],"ls") == 0)
            {
                LsFile();
            }
            else
            {
                printf("Command not found\n");
                printf("Please refer help option to get more information\n");
                printf("Please refer manual page of command using man\n");
            }
        }
        else if(iCount == 2)
        {
            // Marvellous CVFS : > man open
            if(strcmp(Command[0],"man") == 0)
            {
                ManPageDisplay(Command[1]);
            }
            // Marvellous CVFS : > ls -a
            else if((strcmp(Command[0],"ls") == 0) && (strcmp(Command[1],"-a") == 0))
            {
                LsFile_All();
            }
            // Marvellous CVFS : > stat Ganesh.txt
            else if(strcmp(Command[0],"stat") == 0)
            {
                iRet = stat_file(Command[1]);

                if(iRet == ERR_FILE_NOT_EXIST)
                {
                    printf("Error : File not exist\n");
                }
            }
            // Marvellous CVFS : > unlink Ganesh.txt
            else if(strcmp(Command[0],"unlink") == 0)
            {
                iRet = unlink_file(Command[1]);

                if(iRet == ERR_FILE_NOT_EXIST)
                {
                    printf("Error : File not exist\n");
                }
            }
            // Marvellous CVFS : > close fd
            else if(strcmp(Command[0],"close") == 0)
            {
                iRet = close_file(atoi(Command[1]));

                if(iRet == ERR_INVALID_PARAMETER)
                {
                    printf("Error : Invalid file descriptor\n");
                }
                else if(iRet == ERR_FILE_NOT_EXIST)
                {
                    printf("Error : File descriptor is not open\n");
                }
                else
                {
                    printf("File succesfully closed\n");
                }
            }
            // Marvellous CVFS : > write 1
            else if(strcmp(Command[0],"write") == 0)
            {
                printf("Enter the data that you want to write into the file\n");

                fgets(InputBuffer,MAXFILESIZE,stdin);

                size = strlen(InputBuffer);

                iRet = write_file(atoi(Command[1]), InputBuffer, size-1);

                if(iRet == ERR_INVALID_PARAMETER)
                {
                    printf("Error : Invalid parameters\n");

                    printf("Please refer man page for more information\n");
                }
                else if(iRet == ERR_FILE_NOT_EXIST)
                {
                    printf("Error : File not exist\n");
                }
                else if(iRet == ERR_PERMISSION_DENIED)
                {
                    printf("Error : There is no perission to write the data\n");
                }
                else if(iRet == ERR_INSUFFICIENT_SPACE)
                {
                    printf("Error : There is no space to write the data\n");
                }
                else
                {
                    printf("%d bytes gets succesfully written into the file\n",iRet);
                }
            }
            else
            {
                printf("Command not found\n");
                printf("Please refer help option to get more information\n");
                printf("Please refer manual page of command using man\n");
            }
        }
        else if(iCount == 3)
        {
            // Marvellous CVFS : > creat Ganesh.txt 3
            if(strcmp(Command[0], "creat") == 0)
            {
                iRet = CreateFile(Command[1], atoi(Command[2]));
            
                if(iRet == ERR_NO_INODES)
                {
                    printf("Error : Unable to create new file\n");
                    printf("Because there is no free inode\n");
                }
                else if(iRet == ERR_INVALID_PARAMETER)
                {
                    printf("Error : Unable to create new file\n");
                    printf("Because parameters of command are invalid\n");
                    printf("Please use man page to get actual parameters\n");
                }
                else if(iRet == ERR_FILE_ALREADY_EXIST)
                {
                    printf("Error : Unable to create new file\n");
                    printf("Because the file name is already present\n");
                    printf("Please use ls command to check names of all files\n");
                }
                else if(iRet == ERR_MAX_FILES_OPEN)
                {
                    printf("Error : Unable to create new file\n");
                    printf("Because the UFDT is full\n");
                    printf("Please close some opened file\n");
                }
                else
                {
                    printf("File succesfully created with FD : %d\n",iRet);
                }
            }
             // Marvellous CVFS : > open Demo.txt 3
            else if(strcmp(Command[0], "open") == 0)
            {
                iRet = open_file(Command[1], atoi(Command[2]));

                if(iRet == ERR_INVALID_PARAMETER)
                {
                    printf("Error : Invalid parameters\n");
                    printf("Please refer man page for more information\n");
                }
                else if(iRet == ERR_FILE_NOT_EXIST)
                {
                    printf("Error : File not exist\n");
                }
                else if(iRet == ERR_PERMISSION_DENIED)
                {
                    printf("Error : Requested permission exceeds file's permission\n");
                }
                else if(iRet == ERR_MAX_FILES_OPEN)
                {
                    printf("Error : Unable to open file\n");
                    printf("Because the UFDT is full\n");
                }
                else
                {
                    printf("File succesfully opened with FD : %d\n",iRet);
                }
            }
            // Marvellous CVFS : > read 3 10
            else if(strcmp(Command[0], "read") == 0)
            {
                EmptyBuffer = (char *)malloc(atoi(Command[2]));

                iRet = read_file(atoi(Command[1]), EmptyBuffer, atoi(Command[2]));

                if(iRet == ERR_INVALID_PARAMETER)
                {
                    printf("Error : Invalid parameters\n");
                }
                else if(iRet == ERR_FILE_NOT_EXIST)
                {
                    printf("Errr : File not exist\n");
                }
                else if(iRet == ERR_INSUFFICIENT_DATA)
                {
                    printf("Error : Insufficient data\n");
                }
                else if(iRet == ERR_PERMISSION_DENIED)
                {
                    printf("Error : Permission denied\n");
                }
                else
                {
                    printf("Read operation is succesful\n");

                    printf("Data from file is : \n");
                    printf("%s\n",EmptyBuffer);

                    free(EmptyBuffer);
                }
            }
            else
            {
                printf("Command not found\n");
                printf("Please refer help option to get more information\n");
                printf("Please refer manual page of command using man\n");
            }
        }
        else if(iCount == 4)
        {
           if(strcmp(Command[0],"lseek") == 0)
           {
             iRet = lseek_file(atoi(Command[1]),atoi(Command[2]),atoi(Command[3]));

             if(iRet == ERR_INVALID_PARAMETER)
             {
                printf("Error : Invalid parameters\n");
             }
             else if(iRet == ERR_FILE_NOT_EXIST)
             {
                printf("Errr : File not exist\n");
             }
             else if(iRet == EXECUTE_SUCCESS)
             {
                printf("Offset changed successfully\n");
             }
             else 
             {
                printf("Command not found\n");
                printf("Please refer help option to get more information\n");
                printf("Please refer manual page of command using man\n");
             }
             
           }     
        }
        else
        {
            printf("Command not found\n");
            printf("Please refer help option to get more information\n");
            printf("Please refer manual page of command using man\n");
        }
    } // End of while

    return 0;
} // End of main
