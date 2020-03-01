package registry;

public class Main {
	static public void main(String[] args) {
		// 1. pelda
		Student s1 = new Student("Gipsz Jakab", "1A2B3C", 1996);
		Student s2 = new Student("Nagy Károly", "XXX111", 1998);
		Student s3 = new Student("Kis Pippin", "111XXX", 1999);

		s1.addMark(4, 2);

		Teacher t1 = new Teacher("Rend Elek", "Q1W2E3", 1973);
		Teacher t2 = new Teacher("Csirke Béla", "OKTAT6", 1980);

//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//
//		System.out.println(t1);
//		System.out.println(t2);

		// 2. pelda 
		Course c = new Course("Zabhegyezés", "BMEVIIIZZ00", 3);
		Teacher t = new Teacher("Vastagh Béla", "VSTGBL", 1975);
		c.setTeacher(t);


		try {
			c.addStudent(s1);
			c.addStudent(s2);
			c.addStudent(s3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			c.removeByNeptun("1A2B3C");
			c.removeByNeptun("XXX111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			c.addStudent(s3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		c.listStudents();


//		c.removeByNeptun("BRN123");
//
//		c.listStudents();

	}
}
