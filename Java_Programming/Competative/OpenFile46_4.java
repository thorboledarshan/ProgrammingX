/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Q. Write java program to accept file name from user and check whether
//   that file is regular file or not ..
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

class Operations
{
    public void CheckSum(String str) 
    {
        try
        {
            FileInputStream fisobj = new FileInputStream(str);

            int iRet = 0;
            int i = 0;
            int iSum = 0;

            byte Buffer[] = new byte[1024];

            while((iRet = fisobj.read(Buffer)) != -1)
            {
                for(i = 0; i < iRet; i++)
                {
                    iSum = iSum + Buffer[i];
                }
            }

            System.out.println("Check sum is : "+iSum);

            fisobj.close();
        }
        catch(Exception e)
        {
           System.out.println("Unable to open file"); 
        }
    
    }
}
class OpenFile46_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Operations obj = new Operations();

        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        obj.CheckSum(FileName);

    }
}