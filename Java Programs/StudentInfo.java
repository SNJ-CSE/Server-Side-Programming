import java.util.Scanner;
public class StudentInfo {
 		public static void main(String[] args)
            {
			String name;
			int roll;
			double marks;
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter Name");
			name = sc.nextLine();
			System.out.println(" Enter Roll Number");
			roll = sc.nextInt(); 
			System.out.println(" First Parameter" + args[0]);
			System.out.println(" Second Parameter" + args[1]);
   }}
