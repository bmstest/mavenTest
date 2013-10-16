package foo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

// http://opencsv.sourceforge.net/

public class OpenCsvSample {
	public static void main(String[] args) throws IOException {
		// line by line
		CSVReader reader = new CSVReader(new FileReader("usPresidents.csv"));
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			// nextLine[] is an array of values from the line
			System.out.println(nextLine[0] + "\t"+nextLine[1] + " etc...");
		}
		
		//convert to list
		CSVReader reader2 = new CSVReader(new FileReader("usPresidents.csv"));
		List myEntries = reader2.readAll();
		Iterator itr = myEntries.iterator(); 
		while(itr.hasNext()) {
			System.out.println(((String[])itr.next())[1]);
		}
	}
}
