/* 
1. Write a program which accept matrix from user and return addition of diagonal elements.

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

    public void AddDiagonalElements() 
    {
        int iSum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                    break;
                }
            }
        }

        System.out.println("Sum of diagonal elements is : "+iSum);
    }

    public void OptimizedCode() 
    {
        int iSum = 0;

        for(int i = 0; i < iRow && i < iCol; i++)  //we now fixed elements to add 
        {
            iSum = iSum + Arr[i][i];
        }

        System.out.println("Sum of diagonal elements is : " + iSum);
    }
}

class AddDiagonal58_1
{
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
        int Arr[][] = {{'\0'}};

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        Arr = new int[iRow][iCol];

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

        obj.AddDiagonalElements();

        //obj.OptimizedCode();
    }
}