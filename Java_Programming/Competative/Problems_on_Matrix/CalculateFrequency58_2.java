/* 
2. Write a program which accept matrix and one number from user and return frequency of that number.

*/
import java.util.*;

class Solution
{
    private int iRow;
    private int iCol; 
    private int iNo;  
    private int Arr[][];
    
    public Solution(int Arr[][], int a, int b, int c)
    {
        this.Arr = Arr; 
        this.iRow = a;
        this.iCol = b;
        this.iNo = c;
    }

    public void CalculateFrequency() 
    {
        int iFreq = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iFreq++;
                }
            }
        }

        System.out.println("Frequency of given element is : "+iFreq);
    }

    public void OptimizedCode() 
    {
       //no need to optimize
    }
}

class CalculateFrequency58_2
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
        int iValue = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        System.out.println("Enter number to check frequency : ");
        iValue = sobj.nextInt();

        int Arr[][]  = new int[iRow][iCol];

        System.out.println("Enter elements : ");

        for(int i = 0; i < iRow ; i++)
        {
            for(int j = 0; j < iCol ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }

            System.out.println();
        }

        Solution obj = new Solution(Arr,iRow,iCol,iValue);

        obj.CalculateFrequency();

        //obj.OptimizedCode();
    }
}