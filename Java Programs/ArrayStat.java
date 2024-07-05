class ArrayStat
{
public static void main(String args[]){
	int marks[]= {67,45,35,4,56,78,9};
	int maxMarks,minMarks,sum;
	double avgMarks;
	maxMarks=marks[0];
	minMarks=marks[0];
	sum=marks[0];
	
	System.out.println("Marks ...");

	for(int i=0;i<marks.length;i++)	System.out.print(marks[i] + "   ");

	for(int i=1; i<marks.length;i++)
		{
			if(marks[i] >maxMarks)maxMarks=marks[i];
			if(marks[i] <minMarks)minMarks=marks[i];
			sum = sum + marks[i];

			
		}	
	
		System.out.println("Maximum Marks " + maxMarks);
		System.out.println("Minimum Marks " + minMarks);
		System.out.println("Total Marks " + sum);
		avgMarks = (double)sum/(double)marks.length;
		System.out.println("Average Marks " +avgMarks);
}
}