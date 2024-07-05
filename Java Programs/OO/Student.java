class Student {
int rollno;
String name;

Student() {  
		rollno = 123456;
		name = "Divya";   }

Student(int r1, String s1)
{	rollno = r1;
	name = s1;
}


public static void main(String abc[]) {
Student studObj = new Student();
Student s2 = new Student(34567, " Anilkumar");

System.out.println("Roll Number " + studObj.rollno + "  Name  " +studObj.name); 
System.out.println("Roll Number " + s2.rollno + "  Name  " +s2.name); 

}
}
