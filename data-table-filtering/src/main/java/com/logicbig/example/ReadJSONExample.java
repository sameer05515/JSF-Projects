package com.logicbig.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

//        try (FileReader reader = new FileReader("C:\\Prem\\ECLIPSE-WS\\WS1\\json-reader\\src\\main\\resources\\employees.json"))
		try (FileReader reader = new FileReader(new FileResourcesUtils().getFileFromResource("top500.json"))) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			JSONArray employeeList = (JSONArray) obj;
			System.out.println(employeeList);

			// Iterate over employee array
			employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static List<TopFHB> get() {
		List<TopFHB> list = new ArrayList<TopFHB>();
		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

//        try (FileReader reader = new FileReader("C:\\Prem\\ECLIPSE-WS\\WS1\\json-reader\\src\\main\\resources\\employees.json"))
		try (FileReader reader = new FileReader(new FileResourcesUtils().getFileFromResource("top500.json"))) {
			// Read JSON file
			Object obj = jsonParser.parse(reader);

			JSONArray employeeList = (JSONArray) obj;
			System.out.println(employeeList);

			// Iterate over employee array
			employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp,list));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return list;
	}

	private static void parseEmployeeObject(JSONObject employee, List<TopFHB> list) {
		//JSONObject employeeObject = (JSONObject) employee.get("employee");
		
//		"commonName","citizenship",
//		"industry","rank","worth"
		long id=0;
		String commonName=(String) employee.get("commonName");
		String citizenship=(String) employee.get("citizenship");
		String industry=(String) employee.get("industry");
		int rank=Integer.parseInt((String) employee.get("rank"));
		long worth=Long.parseLong((String) employee.get("worth"));
		list.add(new TopFHB(++id, commonName, rank, worth, citizenship, industry));
	}

	private static void parseEmployeeObject(JSONObject employee) {
		// Get employee object within list
		JSONObject employeeObject = (JSONObject) employee.get("employee");

		// Get employee first name
		String firstName = (String) employeeObject.get("firstName");
		System.out.println(firstName);

		// Get employee last name
		String lastName = (String) employeeObject.get("lastName");
		System.out.println(lastName);

		// Get employee website name
		String website = (String) employeeObject.get("website");
		System.out.println(website);
	}
}