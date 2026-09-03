/* 
4. Write a program which accept matrix and display addition of elements From each column.

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

    public void AddColumnElements() 
    {
        int iSum = 0;

        for(int j = 0; j < iCol; j++)
        {
            iSum = 0;

            for(int i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.print(iSum+"  ");
        }

        
    }

    public void OptimizedCode() 
    {
        //no need to optimize
    }
}

class AddColumnElements58_4
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

        obj.AddColumnElements();

        //obj.OptimizedCode();
    }
}