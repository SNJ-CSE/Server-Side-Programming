import java.util.Scanner;

class Matrix 
{
public static void main(String args[]){
	int row,col;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of  Matrix  ");
	row = sc.nextInt();
	col = sc.nextInt();

 	int matA[][]= new int[row][col];
	int matB[][]= new int[row][col];
	int matC[][]= new int[row][col];

	MatrixMethods matOp = new MatrixMethods();

	System.out.println(" Enter the elements of first matrix ");

	matA = matOp.read2DArray(row,col);

	System.out.println(" Enter the elements of second matrix ");

	matB = matOp.read2DArray(row,col);

// Display the matrices

	System.out.println(" Matirx A is..");

	matOp.dispMat(matA);

	System.out.println(" \n Matirx B is..");

	matOp.dispMat(matB);

// Display menu

	System.out.println("Matrix operations ");
	System.out.println("1.Transpose of Matrix");
	System.out.println("2. Matrix Addition ");
	System.out.println("3. Matrix Difference ");
        System.out.println("Enter Your Choice[1-3] "); 
// Read the user choice

	int choice;
	choice = sc.nextInt();

	switch(choice)
	{ case 1:
               
		matC = matOp.matTrans(matA);  
                matOp.dispMat(matC);
                break;

		case 2:
               
		matC = matOp.matAdd(matA,matB);
		matOp.dispMat(matC);

                break;

		case 3:
               
		matC = matOp.matDiff(matA,matB);
		matOp.dispMat(matC);

                break;

         }    	
	
}
}





/*
matA = read2DArray(row,col);
matB = read2DArray(row,col);

disp2DArray(matA);

int[][] read2DArray(row,col);
{


}

// read the elements of matrices
System.out.println(" Enter the elements of first matrix ");


	for(int i=0; i<row;i++)
		{
			
			for(int j=0; j<col; j++)
				matA[i][j]=sc.nextInt();
		}


System.out.println(" Enter the elements of Second matrix ");


	for(int i=0; i<row;i++)
		{
			
			for(int j=0; j<col; j++)
				matB[i][j]=sc.nextInt();
		}


System.out.println(" \nMatirx A is ");
	for(int i=0; i<row;i++)
		{
			System.out.println(" ");
			for(int j=0; j<col; j++)
				System.out.print("  "+matA[i][j]);
		}
System.out.println(" \nMatirx B is ");
for(int i=0; i<row;i++)
		{
			System.out.println(" ");
			for(int j=0; j<col; j++)
				System.out.print("  "+matB[i][j]);
		}

System.out.println("\n Matirx Addition ");
	for(int i=0; i<row;i++)
		{
			
			for(int j=0; j<col; j++)
				matC[i][j] =matA[i][j] + matB[i][j];
		}
for(int i=0; i<row;i++)
		{
			System.out.println(" ");
			for(int j=0; j<col; j++)
				System.out.print("  "+matC[i][j]);
		}



	
	}


}

*/