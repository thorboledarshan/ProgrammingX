/* 
2. Write a program which accept matrix and reverse the contents of each row.

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

    public void ReverseRowElements() 
    {
        int iTemp = 0;

        for(int i = 0; i < iRow; i++)
        {
            int k = 0;
            int j = 0;

            for(j = 0, k = iCol - 1; j < k; j++,k--)  //Two pointers method
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i][k];
                Arr[i][k] = iTemp;

            }
        }

        //Display
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
        
    }
}

class ReverseRowElements59_2
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

        obj.ReverseRowElements();

        //obj.OptimizedCode();
    }
}