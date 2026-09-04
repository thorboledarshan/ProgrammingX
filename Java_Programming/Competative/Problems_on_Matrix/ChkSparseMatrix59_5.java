/* 
5. Write a program which accept matrix and check whether the matrix is Sparse matrix or not.

Sparse matrix is a matrix with the majority of its elements equal to zero.
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

    public void ChkSparseMatrix() 
    {
        boolean bFlag = true;
        int iCountZero = 0;
        int iCountNonZero = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCountZero++;
                }
                else 
                {
                    iCountNonZero++;
                }
            }
        }

        if (iCountZero < iCountNonZero)
        {
            bFlag = false;
        }

        if(bFlag == true)
        {
            System.out.println("It is Sparse matrix");
        }
        else 
        {
            System.out.println("It is not Sparse matrix");
        }

        
    }

    public void OptimizedCode()
    {
        
    }
}

class ChkSparseMatrix59_5
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

        obj.ChkSparseMatrix();

        //obj.OptimizedCode();
    }
}