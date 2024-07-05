class Student2 {
	int rollno;
	String name;
	String address;
	
	

	Student2() {  
		this(220611);
	System.out.println("Default Constructor");
		  }

	Student2(int roll) {  
		
		this(roll,"Anilkumar");
	System.out.println("Constructor with one parameter");
		  }

	Student2(int rollno, String n1) {  
			this(rollno,n1,"Aurangabad");
	System.out.println("Constructor with two parameter");
			   }

	Student2(int rollno, String name,String address) { 

		this.rollno = rollno;
		this.name = name;
		this.address = address; 
		System.out.println("Constructor with three parameter");
			
			   }
	
	


	void display()
		 { 
			System.out.println("Rollo Number " + rollno); 
			System.out.println("Name " + name);
			System.out.println("Address " + address);
		}
	
	public static void main(String abc[]) {
		Student2 s3 = new Student2();
		s3.display();

		  }  }