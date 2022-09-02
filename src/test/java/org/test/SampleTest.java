package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleTest {

	public static void main(String[] args) throws IOException, ParseException {

		File file = new File("C:\\Users\\sabas\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\TestS.json");

		// Enter address details, for thses we need to create object for address class

		Address address = new Address("12A", "Customes Colony", "Chennai", "Tamil Nadu");

		Employee employee = new Employee("Ajay", 9070806050l, 12345, address);
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(file, employee);
		
		
	}

}
