class OpPrec {
public static void main(String[] args)
{
	int x = 10, y = 5, z =1, res;

//	res = x-++z-++y;
	res = x - ++y - ++z;
	System.out.println(" Res " + res);
	
	int i=10;
	int n = i++%5;
	System.out.println(" Output" +n + i );

	float f1 = 345.66f;
	int n1 = (int)f1;
	System.out.println(" float to int" +n1);

	double d1 = 6667.9999999989;
	float f2 = (float)d1;
System.out.println(" double to float " +f2);

	long l1 = 333;
	int l2 = (int)l1;
System.out.println(" long to int " +l2);

}

}