package com.capgemini.hashmapdemo;

import java.util.HashMap;

	public class HashMapEx {

		public static void main(String[] args) {

			
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			
			hm.put(10, "Shreya");
			hm.put(11, "Sharavri");
			hm.put(12, "Sarvashri");
			hm.put(13, "Janhavi");
			hm.put(14, "Vaibhav");
			//hm.put(null, "Nayna");
			hm.put(null, null);
			hm.put(14, "Nayna");
			hm.put(15, null);
			
		System.out.println(hm);
		
		
		System.out.println(hm.size());
		System.out.println(hm.get(14));
		System.out.println(hm.remove(12));
		System.out.println(hm);
		System.out.println(hm.containsValue("Sarvashri"));
		System.out.println(hm.containsKey(12));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		}
}