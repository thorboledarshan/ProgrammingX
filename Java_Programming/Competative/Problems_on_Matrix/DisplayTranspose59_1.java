/* 
1.Write a program which accept matrix from user and display transpose of the
matrix.

The transpose of a given matrix is formed by interchanging the rows and
columns of a matrix.

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

    public void DisplayTranspose() 
    {
        int Transpose[][] = new int[iRow][iCol];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Transpose[j][i] = Arr[i][j]; //Transpose
            }
        }

        //Display
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Transpose[i][j]+ " ");
            }

            System.out.println();
        }

        
    }

    public void OptimizedCode() 
    {
        for(int i = 0; i < iRow; i++)
        {
            for(int j = i + 1; j < iCol; j++)  //Swapping values
            {
                int iTemp = Arr[i][j];

                Arr[i][j] = Arr[j][i];

                Arr[j][i] = iTemp;
            }
        }

        // Display
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}

class DisplayTranspose59_1
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

        obj.DisplayTranspose();

        //obj.OptimizedCode();
    }
}