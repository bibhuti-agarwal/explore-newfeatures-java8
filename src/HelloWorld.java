/**
 * simple hello world using Java 8 lambda expression. 
 * 
 * @author Bibhuti
 * @version 1.0
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Example-1 : assigning lambda expression to variable.
		// Runnable is annotated as FunctionalInterface
		Runnable r = () -> {
			System.out.println("Hello World!");
		};
		
		new Thread(r).start();
		
		// Example-2
		// above example-1 can be optimized as below.
		new Thread(() -> System.out.println("Hello World!")).start();
	}

}
