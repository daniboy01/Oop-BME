package registry;

public class Course {
	private String name; 
	private String neptun;
	private Student students[];
	private Teacher teacher;

	public Course(String na, String ne, int sn) {
		name = na; neptun = ne;
		students = new Student[sn]; // no Student is created!!!
	}

	public String getName() { return name; }

	public String getNeptun() { return neptun; }

	public void setTeacher(Teacher t) { teacher = t; }

	public void addStudent(Student s) throws Exception  {
		for (int i = 0; i < students.length; i++) {
			if (isInTheCourse(students,s)){
				throw new Exception("Ez a hallgató már felvette a kurzust!");
			}
			if (students[i] == null) {
				students[i] = s;
				return;
			}
		}
		throw new Exception("Kurzus megtelt");
	}

	public boolean isInTheCourse(Student [] students, Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				return true;
			}
		}
		return false;
	}

	public void listStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i]);
			}
		}
	}
	public void removeByNeptun(String neptun) throws Exception {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) continue;
			String actNeptun = students[i].getNeptun();
			if (actNeptun.equals(neptun)) {
				students[i] = null;
				return;
			}
		}
		throw new Exception("Nincs ilyen neptunkód!");
		
	}
	public String toString() {
		return name+" ("+neptun+")";
	}
}  
