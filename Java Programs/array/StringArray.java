class StringArray
{
	public static void main(String args[]){
	String names[]= {"anil","kapil","Rashmi","suresh","Sandy"};

	System.out.println("Original Name List..");
	int n = names.length;
	for(int i=0;i<n;i++)
		System.out.print("  "+names[i]);
	
	for(int i = 0; i < n/2;i++)
	{
		String tmp = names[n-i-1];
		names[n-i-1] = names[i];
		names[i] = tmp;
	}

	System.out.println("\nReverse Name List..");

	for(int i=0;i<n;i++)
		System.out.print("  "+names[i]);	
}
}