package com.ibm.cloudoe.samples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Search {

	public static HashMap<String, String> map = new HashMap <String, String>();
	
	public Search()
	{
		super();
		populate();
	}
	
	public static  void populate ()
	{
		map.put("1000", "Rahul@infosys.com");
		map.put("1001", "Vikram@infosys.com");
		map.put("1002", "Kiran@infosys.com");
		map.put("1003", "Ankit@infosys.com");
		map.put("1004", "Navneet@infosys.com");
		map.put("1005", "Raj@infosys.com");
		map.put("1006", "Sujit@infosys.com");
		map.put("1007", "Amit@infosys.com");
		map.put("1008", "Prabhat@infosys.com");
		map.put("1009", "Dipika@infosys.com");
		map.put("1010", "Shilpa@infosys.com");
		
		
	}
	
	public static String  searchByEmpID(String s)
	{
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    if(entry.getKey().equalsIgnoreCase(s))
		    {
		    	
		    	return entry.getValue();
		    }
		}
		return null;
		
	}
	public static String  searchByEmailID(String s)
	{
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    if(entry.getValue().equalsIgnoreCase(s))
		    {
		    	return entry.getKey();
		    }
		}
		return null;
		
	}

	
	
	public static  void addValue (String i, String s)
	{
		map.put(i, s);
	
	}
}


