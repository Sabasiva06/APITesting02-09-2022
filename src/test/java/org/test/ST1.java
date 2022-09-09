package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.WebRowSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ST1 {

	public static void main(String[] args) throws IOException, ParseException {

		File file = new File("C:\\Users\\sabas\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\TestS.json");

		FileReader fileReader = new FileReader(file);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(fileReader);

		JSONObject object = (JSONObject) parse;
		Object object2 = object.get("departments");
		JSONArray array = (JSONArray) object2;
		System.out.println(array);
		Object object3 = array.get(0);
		System.out.println(object3);
		Object object4 = array.get(1);
		System.out.println(object4);
		Object object5 = array.get(2);
		System.out.println(object5);
		Object object6 = object.get("empName");
		String empName = object6.toString();
		System.out.println(empName);
		Object object7 = object.get("empId");
		String string = object7.toString();
		System.out.println(string);
		System.out.println(object3);
		System.out.println(object2);
		System.out.println(object);
		System.out.println(object3);
		System.out.println(object3);
		System.out.println(object2);
		System.out.println(object);
		List<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("c");
		li.add("f");
		li.add("e");
		li.add("g");
		for (int i = 0; i < li.size(); i++) {
			String str = li.get(i);
			System.out.println(str);
		}

	}

}
