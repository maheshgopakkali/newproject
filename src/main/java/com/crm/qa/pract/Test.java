package com.crm.qa.pract;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.util.Scanner;

public class Test {
	
	
public static Map main(String[] args) {
	
	 String s="mahesh";
	 
	 Map m=new HashMap();
	
	 
	 char[] ch = s.toCharArray();
	 
	 for (Character c: ch) {
		 
		 if(m.containsKey(c)) {
			 m.put(c, m.get(c));
		 }
		 else
		 {
			 m.put(c, 1);
		 }
		 
		for(Map.Entry mp: m.entrySet()) {
			
		}
		 
	 }
	 
	 
	
	
	
	
}

}
