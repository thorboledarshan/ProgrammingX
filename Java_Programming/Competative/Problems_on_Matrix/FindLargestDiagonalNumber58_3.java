/* 
3. Write a program which accept matrix and return largest number from both the diagonals.

*/
import java.util.*;

class Solution
{
    private int iRow;
    private int iCol;   
    private int Arr[][];
    
    public Solution(int Arr[][], int a, int b)
    {
        this.Arr = Arr; 
        this.iRow = a;
        this.iCol = b;
    }

    public void FindLargestDiagonalNumber() 
    {
        int iMax = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }

                if((i + j) == iCol - 1)
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        System.out.println("Largest element from both diagonal is  : "+iMax);
    }

    public void OptimizedCode() 
    {
        int iMax = 0;

        for(int i = 0; i < iRow && i < iCol; i++)
        {
            // Main diagonal
            if(Arr[i][i] > iMax)
            {
                iMax = Arr[i][i];
            }

            // Secondary diagonal
            int j = iCol - 1 - i;

            if(j >= 0 && Arr[i][j] > iMax)
            {
                iMax = Arr[i][j];
            }
        }

        System.out.println("Largest element from both diagonal is : " + iMax);
    }
}

class FindLargestDiagonalNumber58_3
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
         

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter elements : ");

        for(int i = 0; i < iRow ; i++)
        {
            for(int j = 0; j < iCol ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }

            System.out.println();
        }

        Solution obj = new Solution(Arr,iRow,iCol);

        obj.FindLargestDiagonalNumber();

        //obj.OptimizedCode();
    }
}