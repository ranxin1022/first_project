package xran.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GeoLocation {

	
	public static void main(String[] args)
	{
		Gson gson = new Gson();
		Filter filter = new Filter();
		filter.setName("continent");
		filter.setOperator("equals");
		filter.setValue("EU");
		
		String filterJson = gson.toJson(filter);
		System.out.println("object filter convert to Json == " + filterJson );
	
		// String convert to object
		//
		String jsonString = "{\"name\":\"continent\",\"Operr\":\"equals\",\"value\":\"EU\", \"test\":\"haha\"}";
		Filter result = gson.fromJson(jsonString, Filter.class);
		System.out.println("string value convert to object: " + result);
		
		// List of filter convert to String
		//
		List<Filter> filters = new ArrayList<Filter>();
		filters.add(new Filter("continent", "equals", "EU"));
		filters.add(new Filter("country", "equals", "AS"));
		filters.add(new Filter("city", "equals", "AS"));
		
		String convertToString = gson.toJson(filters);
		System.out.println("list of fitler convert to String: " + convertToString);
		
		
		String jsonList = "[{\"name\":\"continent\",\"operator\":\"equals\",\"value\":\"EU\"},"
						+ "{\"name\":\"country\",\"operator\":\"equals\",\"value\":\"AS\"},"
						+ "{\"name\":\"city\",\"Operator\":\"equals\",\"value\":\"AS\"}]";
		
		System.out.println(jsonList);
		
		List<Filter> filterLists = gson.fromJson(jsonList, new TypeToken<List<Filter>>(){}.getType());
		
		for(Filter filterVal : filterLists)
		{
			System.out.println(filterVal);
		}
		
	}
	
}
