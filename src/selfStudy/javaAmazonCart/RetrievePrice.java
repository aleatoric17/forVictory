package selfStudy.javaAmazonCart;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

public class RetrievePrice {
	
	//dbHost : Database Host, this is usually the IP address, or the URL string
	private String dbHost;
	
	//dbPort : Database usually would expose ports from its server, not all ports can be used, this will depend on the database
	private String dbPort;
	
	//dbDriver : This is the driver that tells java how to connect to the database
	private String dbDriver;
	
	private String dbUsername;
	private String dbPassword;
	
	//This is for initializing the properties
	InputStream input = null;
	Properties prop = new Properties();
	
	
	//Creating HashMap
	//Remember in collection when you specify the type, you must use OBJECTS, 
	//int is a primitive not a object, so we have to use Integer which is an wrapper class of int
	HashMap<String, Integer> priceMap = new HashMap<String, Integer>();
	
	
	public RetrievePrice() throws IOException {   
		this.input = new FileInputStream("./src/selfStudy/javaAmazonCart/AmazonCart.properties");
		this.prop.load(this.input);
		
		this.dbHost = prop.getProperty("dbHost");
		this.dbPort = prop.getProperty("dbPort");
		this.dbUsername = prop.getProperty("dbUsername");
		this.dbPassword = prop.getProperty("dbPassword");
		this.dbDriver = "jdbc:sql";
		//InputStreams must be closed after you use it...or else the resource will be occupied 
		this.input.close();
		
		loadPriceMap();
	}
	
	public void loadPriceMap() throws IOException {
		this.input = new FileInputStream("./src/selfStudy/javaAmazonCart/Price.properties");
		Properties priceProp = new Properties();
		priceProp.load(this.input);
		
		Iterator<String> itr = priceProp.stringPropertyNames().iterator();
		
		int i = 1;
		
		while(itr.hasNext()) {
			
			String temp = itr.next();
			priceMap.put(temp, Integer.parseInt(priceProp.getProperty(temp)));
			System.out.println(i++);
		}
		
		System.out.println(priceMap.toString());
		

//		Map is a table that stores Key Value Pairs (One Key to One Value in Pairs)...
//		priceMap.put("cloth-small-zara", Integer.parseInt(prop.getProperty("cloth-small-zara")));
//		priceMap.put("cloth-large-zara", Integer.parseInt(prop.getProperty("cloth-large-zara")));
//		priceMap.put("cloth-small-af", Integer.parseInt(prop.getProperty("cloth-small-af")));
//		priceMap.put("cloth-large-af", Integer.parseInt(prop.getProperty("cloth-large-af")));
//		priceMap.put("cloth-small-northface", Integer.parseInt(prop.getProperty("cloth-small-northface")));
//		priceMap.put("cloth-large-northface", Integer.parseInt(prop.getProperty("cloth-large-northface")));
//		priceMap.put("cloth-small-lv", Integer.parseInt(prop.getProperty("cloth-small-lv")));
//		priceMap.put("cloth-large-lv", Integer.parseInt(prop.getProperty("cloth-large-lv")));
//		priceMap.put("cloth-small-gucci", Integer.parseInt(prop.getProperty("cloth-small-gucci")));
//		priceMap.put("cloth-large-gucci", Integer.parseInt(prop.getProperty("cloth-large-gucci")));
//		priceMap.put("cloth-small-nike", Integer.parseInt(prop.getProperty("cloth-small-nike")));
//		priceMap.put("cloth-large-nike", Integer.parseInt(prop.getProperty("cloth-large-nike")));
//		priceMap.put("cloth-small-addidas", Integer.parseInt(prop.getProperty("cloth-small-addidas")));
//		priceMap.put("cloth-large-addidas", Integer.parseInt(prop.getProperty("cloth-large-addidas")));
//		priceMap.put("cloth-small-champion", Integer.parseInt(prop.getProperty("cloth-small-champion")));
//		priceMap.put("cloth-large-champion", Integer.parseInt(prop.getProperty("cloth-large-champion")));
//		priceMap.put("cloth-small-acnestudio", Integer.parseInt(prop.getProperty("cloth-small-acnestudio")));
//		priceMap.put("cloth-large-acnestudio", Integer.parseInt(prop.getProperty("cloth-large-acnestudio")));
//		
//		priceMap.put("book-paperback-weka", Integer.parseInt(prop.getProperty("book-paperback-weka")));
//		priceMap.put("book-hardcover-weka", Integer.parseInt(prop.getProperty("book-hardcover-weka")));
//		priceMap.put("book-paperback-viking", Integer.parseInt(prop.getProperty("book-paperback-viking")));
//		priceMap.put("book-hardcover-viking", Integer.parseInt(prop.getProperty("book-hardcover-viking")));
//		priceMap.put("book-paperback-plume", Integer.parseInt(prop.getProperty("book-paperback-plume")));
//		priceMap.put("book-hardcover-plume", Integer.parseInt(prop.getProperty("book-hardcover-plume")));
//		priceMap.put("book-paperback-penguin", Integer.parseInt(prop.getProperty("book-paperback-penguin")));
//		priceMap.put("book-hardcover-penguin", Integer.parseInt(prop.getProperty("book-hardcover-penguin")));
//		priceMap.put("book-paperback-pearson", Integer.parseInt(prop.getProperty("book-paperback-pearson")));
//		priceMap.put("book-hardcover-pearson", Integer.parseInt(prop.getProperty("book-hardcover-pearson")));
//		priceMap.put("book-paperback-relx", Integer.parseInt(prop.getProperty("book-paperback-relx")));
//		priceMap.put("book-hardcover-relx", Integer.parseInt(prop.getProperty("book-hardcover-relx")));
//		priceMap.put("book-paperback-informa", Integer.parseInt(prop.getProperty("book-paperback-informa")));
//		priceMap.put("book-hardcover-informa", Integer.parseInt(prop.getProperty("book-hardcover-informa")));
		
		this.input.close();
//		System.out.println(priceMap.toString());

	}
	
	public HashMap<String, Integer> getPriceMap() {
		return this.priceMap;
	}

	
	public String toString() {
		return "RetrievePrice [dbHost=" + dbHost + ", dbPort=" + dbPort + ", dbDriver=" + dbDriver + ", dbUsername="
				+ dbUsername + ", dbPassword=" + dbPassword + "]";
	}
	
	
	
	
}
