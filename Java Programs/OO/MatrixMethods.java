import java.util.Scanner;

class MatrixMethods {

	Scanner sc = new Scanner(System.in);
	
	int[][] read2DArray(int r,int c)
	{
		int res[][] = new int[r][c];
		
		for(int i=0; i<r;i++)
		{
			
			for(int j=0; j<c; j++)
				res[i][j]=sc.nextInt();
		}
		return res;

	}

	void dispMat(int a[][])
	{
		int r = a.length;
		int c = a[0].length;
		
		for(int i=0; i<r;i++)
		{
			System.out.println(" ");
			for(int j=0; j<c; j++)
				System.out.print("  "+ a[i][j]);
		}

	
	}

	int[][] matAdd(int a[][],int b[][])
	{ 
		int r = a.length;
		int c = a[0].length;

		int res[][] = new int[r][c];

		for(int i=0; i<r;i++)
		{
			
			for(int j=0; j<c; j++)
				res[i][j] = a[i][j] + b[i][j];
		}
		
		return res;


	
	}


	int[][] matDiff(int a[][],int b[][])
	{ 
		int r = a.length;
		int c = a[0].length;

		int res[][] = new int[r][c];

		for(int i=0; i<r;i++)
		{
			
			for(int j=0; j<c; j++)
				res[i][j] = a[i][j] - b[i][j];
		}
		
		return res;


	
	}
	
	int[][] matTrans(int a[][])
	{ 
		int r = a.length;
	  	int c = a[0].length;
		int res[][] = new int[r][c];
		for(int i=0; i<r;i++)
		{
			
			for(int j=0; j<c; j++)
				res[j][i] = a[i][j];
		}
		
		return res;
		
	
	}
	

}


