package com.capgemini.javaset;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
import java.util.TreeSet;

	public class HashSetDemo1 {

		public static void main(String[] args) {
			
				
			TreeSet<String> num=new TreeSet<String>();
			
			for (int i=30;i>0;i--)
			{
			num.add("AB"+i);
			 
			}
			for( String i:num)
			{
				System.out.println(i);
			}
			    
		}

	}
