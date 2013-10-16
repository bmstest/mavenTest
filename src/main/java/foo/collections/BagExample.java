package foo.collections;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;

/**
 * Hello world!
 *
 */
public class BagExample 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Bag bag = new HashBag(); 
        bag.add("ONE", 6); // add 6 copies of "ONE"
        System.out.println(bag.getCount("ONE"));
        bag.remove("ONE");
        System.out.println(bag.getCount("ONE"));
     //ArrayFloatList    
    }
}
