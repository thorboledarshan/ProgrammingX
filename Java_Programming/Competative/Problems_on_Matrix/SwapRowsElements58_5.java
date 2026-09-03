/* 
5. Write a program which accept matrix and swap the contents of consecutive rows.

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

    public void SwapConsecutiveRowElements() 
    {

        for(int j = 0; j < iCol; j++)
        {
            int iTemp = 0;

            for(int i = 0; i+1 < iRow; i+=2)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = iTemp;

            }
        }

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+ " ");
            }

            System.out.println();
        }

        
    }

    public void OptimizedCode() 
    {
        
        for(int i = 0; i + 1 < iRow; i += 2)
        {
            for(int j = 0; j < iCol; j++)
            {
                int iTemp = Arr[i][j];

                Arr[i][j] = Arr[i + 1][j];

                Arr[i + 1][j] = iTemp;
            }
        }

        // Display matrix
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

class SwapRowsElements58_5
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

        obj.SwapConsecutiveRowElements();

        //obj.OptimizedCode();
    }
}