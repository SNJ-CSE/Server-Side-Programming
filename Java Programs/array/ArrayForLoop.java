class ArrayForLoop {
public static void main(String[] args)
{
	String branch[] = {"Civil","Mech","ECT","CSE","EEP","Chem","Arch","IT"};
	for(int i=0;i<=branch.length;i++)
	System.out.println(branch[i]);
	
	for(String i:branch)	
	System.out.println(i);
	

}

}