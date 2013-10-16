package foo.collections;

import helpers.PrintIt;

import java.util.*;
import org.apache.commons.collections.*;

public class SimplePredicate {
    public static void main(String[] args) {
	List<String> mixedup = Arrays.asList("A", "0", "B", "C", "1", "D", "F", "3");
	// Tylko obiekty, ktore przechodza test moga byc dodane do kolekcji
	Collection numbersOnlyList = CollectionUtils.predicatedCollection(new ArrayList(), new Predicate() {
	    public boolean evaluate(Object o) {
		try {
		    Integer.valueOf((String) o);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	    }
	});
	
	for (String s : mixedup) {
	    try {
		numbersOnlyList.add(s);
	    } catch (IllegalArgumentException e) {
		System.out.println("Illega argument for : " + s);
	    }
	}
	System.out.println("\nResults of the predicatedCollection List:");
	CollectionUtils.forAllDo(numbersOnlyList, PrintIt.getInstance());
    }
}
