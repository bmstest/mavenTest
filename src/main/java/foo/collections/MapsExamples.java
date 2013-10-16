package foo.collections;

import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.bidimap.TreeBidiMap;
import org.apache.commons.collections.map.CaseInsensitiveMap;
import org.apache.commons.collections.map.LinkedMap;

public class MapsExamples {

    public static void main(String[] args) {
	
    //Case insensitive map
    System.out.println("Case insensitive map");
    Map mapa = new CaseInsensitiveMap();
    mapa.put("One", "One");
    System.out.println(mapa.get("ONE"));
    
    //Convert Array to Map
    System.out.println("Convert Array to Map");
    ResourceBundle b = new ListResourceBundle() {
        @Override
        protected Object[][] getContents() {
          return new String[][] {
        	    {"red", "#FF0000"},
        	    {"green", "#00FF00"},
        	    {"blue", "#0000FF"}
        	    };
        }
    };
    
    Map colorMap = MapUtils.toMap(b);
    System.out.println(colorMap.get("green"));
    
    //Ordered map
    System.out.println("Ordered map");
    OrderedMap map = new LinkedMap();
    map.put("FIVE", "5");
    map.put("SIX", "6");
    map.put("SEVEN", "7");
    System.out.println(map.firstKey()); // returns "FIVE"
    System.out.println(map.nextKey("FIVE")); // returns "SIX"
    System.out.println(map.nextKey("SIX")); // returns "SEVEN"
    
    //Mapy dwukierunkowe
    System.out.println("Mapy dwukierunkowe");
    BidiMap bidi= new TreeBidiMap();
    bidi.put("SIX", "6");
    System.out.println(bidi.get("SIX")); // returns"6"
    System.out.println(bidi.getKey("6")); // returns"SIX"
    bidi.removeValue("6"); // removes the mapping
    BidiMap inverse = bidi.inverseBidiMap(); // returns a map with keys and values swapped
    	
    }
}
