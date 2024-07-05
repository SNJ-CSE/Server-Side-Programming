/** Documentation Comments
* <h1>Program demonstrate the use of command line parameters </h1>
* @author S N Jaiswal
* @version 1.0
* @since 16-03-2021
*/

import java.util.Scanner;
public class CMDLine{
 		public static void main(String[] args)
            {
		int len = args.length;
		System.out.println("Total CMD line parameters " + len);
		String s1 = args[0];
		// double d1 = Double.parseDouble(s1);
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(args[1]);
		int tot = n1 + n2;
		System.out.println("Total " + tot);
		int sum=0,p1;
		for(int i = 0; i<len ; i++)
		{	p1 = Integer.parseInt(args[i]);
			sum = sum + p1;
 		}
		
		System.out.println("Total of all parameters" + sum);
	   }
}