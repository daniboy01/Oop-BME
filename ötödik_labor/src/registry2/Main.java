package registry2;

import registry2.exceptions.CourseException;
import registry2.exceptions.CourseFullException;

import java.util.ArrayList;

public class Main {
	static public void main(String[] args) {
		
		// 1. példa, Person
		Student s1 = new Student("Gipsz Jakab", "1A2B3C", 1996);
		Teacher t1 = new Teacher("Rend Elek", "Q1W2E3", 1973);
		//Person  p1 = new Person("Nagy Károly", "XXX111", 1998);

		Person p2 = s1;
		Person p3 = t1;

		System.out.println(s1); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(t1); //Rend Elek (Q1W2E3), 1973, assis...
		//System.out.println(p1); //Nagy Károly (XXX111), 1998
		System.out.println(p2); //Gipsz Jakab (1A2B3C), 1996, 0.0, 0
		System.out.println(p3); //Rend Elek (Q1W2E3), 1973, assis...

		// 2. példa, kivételek
		Course c = new Course("Zabhegyezés", "BMEVIIIZZ00", 2);
		Teacher t = new Teacher("Vastagh Béla", "VSTGBL", 1975);
		c.setTeacher(t);
		try {
		  c.addStudent(new Student("Lutz Ernő", "LTZRN0",1996));
		  c.addStudent(new Student("Szőke Barna", "BRN123",1996));
		  c.addStudent(new Student("Hervadt Virág", "HRVDTV",1995));
//		} catch (Exception e) {
//		  System.err.println(e.getMessage());
//		  // e.printStackTrace();
		} catch (CourseFullException ex) {
			System.out.println(ex.getMessage());
		}

		//3. példa Artist leszármazottak
		System.out.println("____________________________3. példa itt kezdődik_____________________");
		/*
		Person a1 = new Artist("Leonardo Da Vinci","ASD123",1452,"minden is");
		Person a2 = new Artist("Michelangelo Buonarroti","DSA321",1475,"szobrász/festő");

		ArrayList<Person> artists = new ArrayList<Person>();
		artists.add(a1);
		artists.add(a2);
		for (Person p : artists) {
			System.out.println(p.toString());
		}
		a1.meet(a2);
		*/

		//5. példa Artist leszármazottai
		System.out.println("----------------5.példa itt kezdődik-------------------");
		Artist painter = new Painter("Raffaello Sanzio","RTZ456",1483);
		Artist singer = new Singer("Luca Marenzio","LCM123",1553);
		Artist writer = new Writer("Janus Pannonius","JNP678",1434);
		System.out.println(painter.toString());
		System.out.println(singer.toString());
		System.out.println(writer.toString());

	}
}
