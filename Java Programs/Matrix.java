class Matrix 
{
public static void main(String args[]){
	int matA[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0; i<3;i++)
		{
			System.out.println("  ");
			for(int j=0; j<3; j++)
				System.out.print("   " + matA[i][j]);
		}	
	}


}