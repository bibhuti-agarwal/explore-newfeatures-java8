import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Method references
 * 
 * @author Bibhuti
 * @version 1.0
 */
public class MethodReference {

	public static void main(String[] args) {

		// using lambda expression
		Stream.of(1,2,3,4,5).forEach(x->System.out.println(x));

		System.out.println("-----------------------");
		// using method references to access println
		Stream.of(1,2,3,4,5).forEach(System.out::println);
		
		System.out.println("-----------------------");
		// assigning the method reference to functional interface
		Consumer<Integer> printer = System.out::println;
		Stream.of(1,2,3,4,5).forEach(printer);
		
		System.out.println("----------------------");
		// method reference to a static method.
		Supplier<Double> supplier = Math::random;
		Consumer<Double> consumer = System.out::println;
		Stream.generate(supplier).limit(5).forEach(consumer);
		
		// NOTE: supplier is a functional interface whose single abstract 
		// method takes no argument and produces single result and reverse 
		// is the case with consumer.
		
		System.out.println("----------------------");
		// method reference to a static method, optimized way.
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		System.out.println("----------------------");
		//invoking a multiple argument instance method from a class reference.
		//invoking length method o nstring using a method reference
		List<String> string = Arrays.asList("this","is" ,"a", "list", "of", "string");
		
		(string.stream().sorted((s1,s2) -> s1.compareTo(s2))
				.collect(Collectors.toList()))
		.stream().map(String::length)
				.forEach(System.out::println);	
		
	}

}
