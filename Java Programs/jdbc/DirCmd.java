

import java.io.File;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DirCmd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Eenter directory Name");
		dispDir(input.nextLine());
		
	}
	
	public static void dispDir(String path)
	{
		
		
		File name= new File(path);
		if(name.exists())
		{
	//		System.out.println("File Name"+name.getName()+"exists .Is it File ?"+name.isFile()+"Is it directory ?"+name.isDirectory()+"Length  :"+name.length());
			System.out.println("Directory of "+path);
			
			DateFormat formatter = new SimpleDateFormat();
			
			Calendar calendar = Calendar.getInstance();
			
			
			if(name.isDirectory())
			{
				String directory[] = name.list();
				
			
				for(int i=0;i<directory.length;i++)
				{
					String s1=directory[i];
					File f1= new File(path+"\\"+s1);
					if(f1.isFile())
					{
						Date d=new Date();
						
					long l1=f1.lastModified();
					
					calendar.setTimeInMillis(f1.lastModified());
					
					System.out.print(formatter.format(calendar.getTime())); 

						
						System.out.print("\t"+f1.length()+"  "+f1.getName());
						
					}
					System.out.println(" ");
					if(f1.isDirectory())
					{
						long l1=f1.lastModified();
						
						calendar.setTimeInMillis(f1.lastModified());
						
						System.out.print(formatter.format(calendar.getTime())); 

						
					System.out.print("\t<DIR>\t"+f1.getName() );
					}
					System.out.println(" ");
				}					
					
			}else {
				System.out.println(path + "is not present");
			}
					

					
						
		
		
	}
	
}
}
