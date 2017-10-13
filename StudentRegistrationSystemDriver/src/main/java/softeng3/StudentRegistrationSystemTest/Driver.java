package softeng3.StudentRegistrationSystemTest;

import org.joda.time.LocalDate;
import java.util.ArrayList;

import softeng3.StudentRegisrationSystem.CourseProgram;
import softeng3.StudentRegisrationSystem.Module;
import softeng3.StudentRegisrationSystem.Student;

public class Driver {
	
	public static void main(String [] args){
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Module> modules = new ArrayList<Module>();
		
		Student student1 = new Student("Joe", "Murphy", 21, 13350761, new LocalDate(1995,12,04));
		Student student2 = new Student("Louise", "Heduan", 22, 1234567, new LocalDate(1995,06,23));
		Student student3 = new Student("John", "Smith", 25, 9876543, new LocalDate(1991,12,25));
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		Module module1 = new Module("Programming 3", "CT123", students);
		Module module2 = new Module("Machine Learning", "CT321", students);
		Module module3 = new Module("Artificial Intelligence", "CT678", students);
		modules.add(module1);
		modules.add(module2);
		modules.add(module3);
		
		CourseProgram course1 = new CourseProgram("Computer Science and IT", modules, new LocalDate(2014,9,01), new LocalDate(2018,9,01));
		
		for(Student student: students){
			System.out.println(student);
		}
	}
}
