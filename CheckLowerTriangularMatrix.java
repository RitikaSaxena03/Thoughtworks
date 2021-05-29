import java.util.Scanner;

public class CheckLowerTriangularMatrix {
    public static int isLowerTriangular(int matrix[][], int numOfRows, int numOfCol)
    {
        for (int i = 0; i < numOfRows; i++)
            for (int j = i + 1; j < numOfCol; j++)
                if (matrix[i][j] != 0)
                    return 0;

        return 1;
    }
    public static void main(String[] args)
    {
        int numOfRows,i,j, numOfCol;
        Scanner sc = new Scanner(System.in);
        numOfRows=sc.nextInt();
        numOfCol= sc.nextInt();
        if(numOfCol==numOfRows)
        {
            int matrix[][] = new int[numOfRows][numOfCol];
            for(i=0;i<numOfRows;i++)
                for(j=0;j<numOfCol;j++)
                    matrix[i][j]=sc.nextInt();

            int  result= isLowerTriangular(matrix, numOfRows,numOfCol);
            if(result==0)
                System.out.println("no");
            else
                System.out.println("yes");
        }
        else
            System.out.println("Input a valid square matrix!");
    }

}
