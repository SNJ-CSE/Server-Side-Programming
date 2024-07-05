class Student2 {
	int rollno;
	String name;
	String address;
	
	

Student2() {  
		
		this(220611);
		  }

Student2(int roll) {  
		
		this(roll,"Anilkumar");
		  }

	Student2(int rollno, String n1) {  
			this(rollno,n1,"Aurangabad");
			   }

	Student2(int rollno, String name,String address) { 

		this.rollno = rollno;
		this.name = n1;
		this.address = address; 
			
			   }
	
	


	void display()
		 { 
			System.out.println(rollno + " " + name); 
			System.out.println("Name " + name);
			System.out.println("Address " + address);
}
	
	public static void main(String abc[]) {
	Student1 s3 = new Student1();
		Student1 s1 = new Student1(123456,"Divya");
		Student1 s2 = new Student1(s1);
		
	
		s3.display();

		s1.display();  
		s2.display();

		s1.rollno = 206201;
		s1.name = "xyz";

		s2.rollno = s1.rollno;
		s2.name = s1.name;


		s1.display();  
		s2.display();   }  }