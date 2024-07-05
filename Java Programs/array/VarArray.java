import java.util.Scanner;

class VarArray 
{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int varArr[][] = new int[4][];
	varArr[0] = new int[2];
	varArr[1] = new int[4];
	varArr[2] = new int[3];
	varArr[3] = new int[5];
	System.out.println(" Enter the elements of array ");

	for(int i=0;i<varArr.length;i++)	{
		for(int j=0;j<varArr[i].length;j++)
			varArr[i][j] = sc.nextInt();
	}

System.out.println("\n Elements of variable size array ");
	for(int i=0;i<varArr.length;i++)
	{	System.out.println("  ");
		for(int j=0;j<varArr[i].length;j++)
			System.out.print("  "+varArr[i][j]);	
	}

}
}


