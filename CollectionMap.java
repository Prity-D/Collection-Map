package com.PrityDemo;
import java.util.HashMap;
public class CollectionMap {

	  public static void main(String[] args) { 
	        
	        String[] sid = {"s1", "s2", "s3", "s4"}; 
	        int[] smarks = {90, 85, 95, 88};

	        
	        HashMap<String, Integer> studentMap = new HashMap<>();

	            for (int i = 0; i < sid.length; i++) {
	            String studentId = sid[i];
	            int studentMark = smarks[i];

	            studentMap.put(studentId, studentMark);
	        }

	        System.out.println("Student Information:");
	        for (String id : studentMap.keySet()) {
	            int mark = studentMap.get(id);
	            System.out.println("Sid: " + id + ", Smarks: " + mark);
	        }
	        System.out.println("Size of the Data: " + studentMap.size());
	    }
	
}
