/* 
4. Write a program which accept matrix and check whether the matrix is identity matrix or not.

Identity matrix is a square matrix with 1's along the diagonal from upper left to lower right and 0's in all other positions.

If it satisfies the structure as explained before then the matrix is called as
identity matrix.
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

    public void ChkIdentityMatrix() 
    {
        boolean bFlag = true;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        bFlag = false;
                        break;
                    }
                }
                else 
                {
                    if(Arr[i][j] != 0)
                    {
                        bFlag = false;
                        break;
                    }
                }
            }

            if(bFlag == false)
            {
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println("It is identity matrix");
        }
        else 
        {
            System.out.println("It is not identity matrix");
        }

        
    }

    public void OptimizedCode()
    {
        if(iRow != iCol)
        {
            System.out.println("It is not identity matrix");
            return;
        }

        boolean bFlag = true;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)  //Combined two conditions
            {
                if(i == j && Arr[i][j] != 1)
                {
                    bFlag = false;
                    break;
                }

                if(i != j && Arr[i][j] != 0)
                {
                    bFlag = false;
                    break;
                }
            }

            if(bFlag == false)
            {
                break;
            }
        }

        if(bFlag)
        {
            System.out.println("It is identity matrix");
        }
        else
        {
            System.out.println("It is not identity matrix");
        }
    }
}

class ChkIdentityMatrix59_4
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

        obj.ChkIdentityMatrix();

        //obj.OptimizedCode();
    }
}