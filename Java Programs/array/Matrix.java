import java.util.Scanner;

class Matrix 
{
public static void main(String args[]){
	int row,col;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of first Matrix  ");
	row = sc.nextInt();
	col = sc.nextInt();

 	int matA[][]= new int[row][col];
	int matB[][]= new int[row][col];
	int matC[][]= new int[row][col];

/*
matA = read2DArray(row,col);
matB = read2DArray(row,col);

disp2DArray(matA);

int[][] read2DArray(row,col);
{


}
*/
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