package foo.collections;

import helpers.PrintIt;

import java.util.*;
import org.apache.commons.collections.*;

public class SimpleTransformer {
    public static void main(String[] args) {
	// String to Integer
	Collection<String> stringOfNumbers = Arrays.asList("1", "2", "3", "4");
	Collection<Integer> intNums = CollectionUtils.collect(stringOfNumbers, new Transformer() {
	    public Object transform(Object o) {
		return Integer.valueOf((String) o);
	    }
	});
	CollectionUtils.forAllDo(intNums, PrintIt.getInstance());

	System.out.println("Another transformer example");
	
	// String - >substring
	Collection<String> stringOfNumbers1 = Arrays.asList("ABC0001", "BCD0002", "CDF0003", "BFA0004");
	Collection<Integer> intNums1 = CollectionUtils.collect(stringOfNumbers1, new Transformer() {
	    public Object transform(Object o) {
		String s = ((String) o);
		return Integer.valueOf(s.substring(3, s.length()));
	    }
	});
	CollectionUtils.forAllDo(intNums1, PrintIt.getInstance());
    }

}
