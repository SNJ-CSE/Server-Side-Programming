package p1;

import java.util.List;

public class HibDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDao studentDao = new StudentDao();
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        studentDao.saveStudent(student);

        List < Student > students = studentDao.getStudents();
        students.forEach(s-> System.out.println(s.getFirstName()));
	}

}
