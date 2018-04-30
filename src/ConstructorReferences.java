import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Constructor references.
 * 
 * @author Bibhuti
 * @version 1.0
 */
public class ConstructorReferences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// list of people
		List<Person> people = Arrays.asList(
				new Person("Rahul"),
				new Person("Mohit"),
				new Person("Raju"),
				new Person("Megha")
		);
		
		// convert list of people to a list of names.
		List<String> names = people.stream()
				.map(Person::getName)
				.collect(Collectors.toList());
		
		System.out.println("--> " + names);
		
		// convert list of names into list of person object.
		List<Person> personList = names.stream()
//				.map(name -> new Person(name))
				.map(Person::new)
				.collect(Collectors.toList());
		
		System.out.println("--> " + personList);
	}
	
	// inner class
    static class Person {
    	private String name;
    	
    	public Person(String name){
    		this.name = name;
    	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + "]";
		}
    }
}
