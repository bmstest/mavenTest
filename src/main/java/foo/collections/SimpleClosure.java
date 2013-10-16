package foo.collections;

import helpers.DTO;

import helpers.Gender;
import helpers.PrintIt;
import helpers.State;

import java.util.*;
import org.apache.commons.collections.*;
import org.apache.commons.lang.*;




/**
 * Wykonanie akcji na wszystkich elementach kolekcji
 *
 */
public class SimpleClosure {
    public static void main(String[] args) {
	System.out.println("\nTest Number One Results :");
	List<String> collectionOfWords = Arrays.asList("Java", "Example", "Help", "Tips", "And", "Tricks", "Apache",
		"Commons", "Collections");
	// Lets call toString on every object and print it out.
	CollectionUtils.forAllDo(collectionOfWords, new Closure() {
	    public void execute(Object o) {
		assert o != null;
		System.out.print(o.toString() + " ");
	    }
	});
	System.out.println("\n\nTest Number Two Results :");
	int i = 1;
	List<DTO> collectionOfDTOs = Arrays.asList(new DTO(i++, "Java Tips and Tricks", Gender.Male, State.WI),
		new DTO(i++, "Apache Commons", Gender.Male, State.WI), new DTO(i++, "", Gender.Male, State.WI),
		new DTO(i++, "Collections", Gender.Male, State.WI), new DTO(i++, "Closures", Gender.Male, State.WI));
	CollectionUtils.forAllDo(collectionOfDTOs, new Closure() {
	    public void execute(Object o) {
		DTO dto = (DTO) o;
		assert dto != null;
		String s = StringUtils.defaultIfEmpty(dto.getName(), "null");
		dto.setName(s);
	    }
	});
	CollectionUtils.forAllDo(collectionOfDTOs, PrintIt.getInstance());
    }
}
