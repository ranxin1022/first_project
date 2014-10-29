package xran.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.google.gson.JsonArray;

public class GeoFilterWithJackson {

	public void test(String[] he)
	{
		
	}
	public static void main(String[] args)
	{
		
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		// String convert to object
		//
		String jsonString = "[{\"name\":\"continent\",\"operator\":\"equals\",\"value\":\"EU\"}]";
		String stringList = "[\"sessions\", \"page_view\"]";
		//String jsonString = "{name:continent,operator:equals,value:EU}";
		String jsonList = "[{\"name\":\"continent\",\"operator\":\"equals\",\"value\":\"EU\"},"
				+ "{\"name\":\"country\",\"operator\":\"equals\",\"value\":\"AS\"},"
				+ "{\"name\":\"city\",\"operator\":\"equals\",\"value\":\"AS\"}]";
		String jsonarr = "[\"sessions\", \"apdex\"]";
		String[] array = {"session","page"};
		try {
			//List<Filter> filterList = mapper.readValue(jsonString, new TypeReference<List<Filter>>(){});
			
			List<String> test = mapper.readValue(stringList, new TypeReference<List<String>>(){});
			System.out.println("test:" + test);
			for(String t: test)
			{
				System.out.println(t);
			}
			//System.out.println(filterList.size());
			/*
			Filter f = mapper.readValue(jsonString, Filter.class);
			System.out.println("string value convert to object: "+mapper.writeValueAsString(f));
			System.out.println("filter value: "+ f);
			
			List<Filter> filters = new ArrayList<Filter>();
			filters.add(new Filter("continent", "equals", "EU"));
			filters.add(new Filter("country", "equals", "AS"));
			filters.add(new Filter("city", "equals", "AS"));
			
			String jsonList2 = mapper.writeValueAsString(filters);
			System.out.println("JSON list: " + jsonList2);
			
			*/
			
			List<Filter> filtersResult = mapper.readValue(jsonList, new TypeReference<List<Filter>>(){});
			for(Filter one : filtersResult)
			{
				System.out.println("each filter :" + one);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//System.out.println("string value convert to object: " + mapper.writeValueAsString(jsonString));
		
		// List of filter convert to String
		//
		
		try {
			List<Filter> filtersResult1 = mapper.readValue(jsonList, new TypeReference<List<Filter>>(){});
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		//System.out.println(jsonList);
		
		
		
	}
}
