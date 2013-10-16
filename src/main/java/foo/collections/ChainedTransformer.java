package foo.collections;

import helpers.Bill;
import helpers.NewBill;
import helpers.PrintIt;

import java.util.*;
import org.apache.commons.collections.*;

/**
 * Transformowanie kolekcji
 *
 */
public class ChainedTransformer {
    public static void main(String[] args) {
	List<Bill> aList = Arrays.asList(new Bill("A1"), new Bill("A2"), new Bill("A3"), new Bill("A4"));
	Transformer[] chainedTransformer = new Transformer[] { new Transformer() {
	    public Object transform(Object o) {
		return ((Bill) o).getId().replace('A', 'Z'); //zamiana A->Z
	    }
	}, new Transformer() {
	    public Object transform(Object o) {
		char[] c = ((String) o).toCharArray();
		int x = Integer.parseInt(String.valueOf(c[1])) + 500; //dodanie 500 i doklejenie do litery
		return new NewBill(String.valueOf(c[0]) + x);
	    }
	} };
	System.out.println("The aList");
	CollectionUtils.forAllDo(aList, PrintIt.getInstance());
	List<NewBill> bList = (List<NewBill>) CollectionUtils.collect(aList,
		TransformerUtils.chainedTransformer(chainedTransformer));
	System.out.println("\nThe bList");
	CollectionUtils.forAllDo(bList, PrintIt.getInstance());
    }
}