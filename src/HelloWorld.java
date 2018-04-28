/**
 * simple hello world using Java 8 lambda expression. 
 */

/**
 * @author Bibhuti
 * @version 1.0
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Hello World!")).start();
	}

}
