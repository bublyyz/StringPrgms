package com.strings.prgms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class OccurenceusingMap {

	public static void main(String[] args) {
		
		String str="I love my India India India India";
		String[] words=str.split(" ");
		
		HashMap<String,Integer> hm=new HashMap();
		
		for(String s:words) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		
		Set<String> keys=hm.keySet();
		for(String key:keys) { 
			//if(hm.get(key)>1) {
			System.out.println(key+"-"+hm.get(key));
		}
			
	}
	}



