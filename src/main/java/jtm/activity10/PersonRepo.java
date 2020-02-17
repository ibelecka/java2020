package jtm.activity10;

/*
TODO Necessary imports commented */
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class PersonRepo {

	private List<Person> personList;

	public PersonRepo() {
		init();
	}

	public void init() {

		try {
			// 1. Read file data.json from resources folder into String
			// 2. Use ObjectMapper to convert String to List of Persons and
			// store in personList field
			// Hint: Correct way how to use ObjectMapper to convert String to List below
			ObjectMapper mapper = new ObjectMapper();
			File data = new File("/home/student/Downloads/JTM_IB/src/main/resources/data.json");
			Person[] personArray = mapper.readValue(data, Person[].class);
			personList = Arrays.asList(personArray);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Person oldestPerson() {
		Date oldestYear = personList.get(0).getBirthDate();
		int oldestIndex = 0;
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getBirthDate().compareTo(oldestYear) == -1) {
				oldestIndex = i;
				oldestYear = personList.get(i).getBirthDate();
		
			}
		}
		return personList.get(oldestIndex);
	}

	public Person youngestPerson() {
		Date youngestYear = personList.get(0).getBirthDate();
		int youngestIndex = 0;
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getBirthDate().compareTo(youngestYear) == 1) {
				youngestIndex = i;
				youngestYear = personList.get(i).getBirthDate();
			}
		}
		return personList.get(youngestIndex);
	}

	
	public String largestPopulation() {
		List<String> country = new ArrayList<String>();
		country.add(personList.get(99).getCountry());

		for (int i = 0; i < personList.size(); i++) {
			int a = 0;
			for (int j = 0; j < country.size(); j++) {
				if (personList.get(i).getCountry().equals(country.get(j))) {
					a++;
				}
			}
			if (a == 0) {
				country.add(personList.get(i).getCountry());
			}
		}
		int[] countryCount = new int[country.size()];
		
		for (int i = 0; i < personList.size(); i++) {
			for (int j = 0; j < country.size(); j++) {
				if (personList.get(i).getCountry().equals(country.get(j))) {
					countryCount[j]++;
				}
			}
		}
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < countryCount.length; i++) {
			if (countryCount[i] > max) {
				max = countryCount[i];
				maxIndex = i;
			}
		}
		
		System.out.println(Arrays.toString(countryCount));
		
		
		
		
//		System.out.println(Arrays.toString(country.toArray()));
		return country.get(maxIndex);
	}

}

/*
 * 
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * Arrays.asList(personArray);
 */
