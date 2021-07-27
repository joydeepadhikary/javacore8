package javacore8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingListByLambda {	  

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				 new Person("Anuran", "Adhikary", 3),
				 new Person("Kanchan","Adhikary", 60),
				 new Person("Joydeep", "Adhikary", 40)
				 );
		

		
		/*Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge().compareTo(o2.getAge());				
			}			
		});
		*/

		Collections.sort(persons, (o1,o2) ->o1.getAge().compareTo(o2.getAge()));
		persons.forEach((p)->System.out.println(p));	

	}
	
}