/* 
2. Write a program which accept matrix and reverse the contents of each Column.

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

    public void ReverseColumnElements() 
    {
        int iTemp = 0;

        for(int j = 0; j < iCol; j++)
        {
            int k = 0;
            int i = 0;

            for(i = 0, k = iRow - 1; i < k; i++,k--)  //Two pointers method
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[k][j];
                Arr[k][j] = iTemp;

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

class ReverseColumnElements59_3
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

        obj.ReverseColumnElements();

        //obj.OptimizedCode();
    }
}