class Statistics
{
public static void main(String args[]){
	double input[]= {15,45,55,55,66,78,99};
	double sum=0.0,mean;
	
	

	for(int i=0;i<input.length;i++)	System.out.print(input[i] + "   ");
	System.out.println("Sum and mean of Input data set..");

	for(int i=0; i<input.length;i++)
		{
			
			sum = sum + input[i];

			
		}	
		
		mean = sum/input.length;

		System.out.println("sum= "+sum +"Mean= " +mean);

// Median
		double median=0.0;
		if(input.length % 2!=0)median = input[input.length/2];
		else
			median = (input[input.length/2] + input[1+input.length/2]) / 2;

	System.out.println("Median is  ="+median);



// Mode
//double maxVal=0.0,maxCnt=0.0;
//	for


//Varaince
		double variance = 0.0;
		for(int i=0;i<input.length;i++)
			variance = variance + Math.pow(input[i]-mean,2);
		double var1 = variance/input.length;
		double stdDev=0.0;
		stdDev = Math.sqrt(variance / input.length); 

		System.out.println("variance = "+var1 +"Standard Deviation= " +stdDev);
		
}
}