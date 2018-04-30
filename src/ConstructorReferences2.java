import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * constructor reference 2
 * 
 * @author bibhuti
 * @version 1.0
 */
public class ConstructorReferences2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Rahul Mohit Saya Ria");
		
		System.out.println(names);
		List<Person> persons = names.stream()
				.map(name -> name.split(" "))
				.map(Person::new)
				.collect(Collectors.toList());
		
		System.out.println(persons);
		
		System.out.println("----------------------");
		// creating array of person reference
		names = new ArrayList<>();
		names.add("Rahul"); 
		names.add("Mohit"); 
		names.add("Saya");
		names.add("Ria");
		
		Person[] personArray = names.stream().map(Person::new).toArray(Person[]::new);
		
		System.out.println(Arrays.toString(personArray));
	}
	
	// inner class
    static class Person {
    	private String name;
    	
    	public Person(String...names){
    		System.out.println(Arrays.toString(names));
    		this.name = Arrays.stream(names).collect(Collectors.joining(" "));
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
