import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * find the list of files having extension .cvs inside 
 * given folder directory.
 * 
 * @author Bibhuti
 * @version 1.0
 */
public class FindFileinDirectory {

	public static void main(String[] args) {
		File directory = new File("./resources");
		String[] names = null;
		
		// without lambda expression
		names = directory.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".csv");
			}
		});
		
		System.out.println("Without lambda -> " + Arrays.asList(names));
		
		// using lambda expression
		// FilenameFilter is FunctionalInterface
		names = directory.list((file, name) -> {
			return name.endsWith(".csv");
		});
		
		System.out.println("Using lambda -> " + Arrays.asList(names));
	}

}
