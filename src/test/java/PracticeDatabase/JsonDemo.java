package PracticeDatabase;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDemo {
	public static void main(String[] args) throws IOException, ParseException {
	
		JSONParser jsonpath=new JSONParser();
		FileReader filepath=new FileReader(".\\src\\test\\resources\\demo.json");
		
		Object obj=jsonpath.parse(filepath);
		
		//read the data from json
		JSONObject map=(JSONObject)obj;
	System.out.println(map.get("browser"));
	System.out.println(map.get("url"));
	System.out.println(map.get("username"));
	System.out.println(map.get("password"));
	}

}
