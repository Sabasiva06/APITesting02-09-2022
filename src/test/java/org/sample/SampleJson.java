package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleJson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File f = new File("C:\\Users\\sabas\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Sample.json");

		ObjectMapper mapper = new ObjectMapper();

		List<String> course = new ArrayList<String>();
		course.add("Java");
		course.add("Selenium");
		course.add("API Testing");
		course.add("Appium");
		course.add("Python");

		List<Student> stu = new ArrayList<Student>();
		Student student = new Student("Venki", "venki@gmail.com", 1234567890l);
		Student student1 = new Student("Sarath", "sarath@gmail.com", 2345678901l);
		Student student2 = new Student("Palanivel", "palanivel@gmail.com", 3456789021l);
		Student student3 = new Student("Xavier", "xavi@gmail.com", 4567890321l);

		stu.add(student);
		stu.add(student1);
		stu.add(student2);
		stu.add(student3);

		StuDetails details = new StuDetails("12 Sudhagar Nagar", "Coimbatore", "Tamil Nadu", 609109);
		Employee employee = new Employee("Ram", "ram@gmail.com", 9876543210l, course, stu, details);

		mapper.writeValue(f, employee);
	}

}
