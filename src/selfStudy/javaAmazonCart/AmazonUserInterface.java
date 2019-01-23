package selfStudy.javaAmazonCart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class AmazonUserInterface {
	public static void main(String[] args) throws IOException {
		
//		InputStream input = new FileInputStream("./src/selfStudy/javaAmazonCart/Price.properties");
//		Properties prop = new Properties();
//		prop.load(input);

		
//		RetrievePrice ob1 = new RetrievePrice();
//		
//		ob1.loadPriceMap();
		
		Book book1 = new Book("paperback", "weka");
		
		
//		System.out.println(prop.stringPropertyNames());
//		System.out.println(prop.keySet());

//		created an iterator of string named itr, on the right hand side
//		we obtain an iterator from a set, which is a set of property names and we got it from stringPropertyNames() function from the properties
//		then we assign the iterator to itr	
//		Iterator<String> itr = prop.stringPropertyNames().iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		List<String> someList = new ArrayList<String>();
//		someList.add("string1"); 
//		someList.add("string2");
//		someList.add("string3"); 
//		someList.add("string4");
//		
//		for (String currentString : someList) {
//		    System.out.println(currentString);
//		}
//		
//		
//
//		List<Integer> someList2 = new ArrayList<Integer>();
//		someList2.add(2134123); 
//		someList2.add(234234);
//		someList2.add(65643); 
//		someList2.add(234523);
//		
//		for (int x : someList2) {
//		    System.out.println(x);
//		}
//		
//		for (int x = 0; x < someList2.size(); x++ ) {
//			System.out.println(someList2.get(x));
//		}
		
		
		
	}

}
