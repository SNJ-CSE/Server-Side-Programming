import java.util.Scanner;
public class CMDLine{
 		public static void main(String[] args)
            {
		int len = args.length;
		System.out.println("Total CMD line parameters " + len);
		String s1 = args[0];
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(args[1]);
		int tot = n1 + n2;
		System.out.println("Total " + tot);
	   }
}