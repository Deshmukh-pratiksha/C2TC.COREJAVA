package com.tnsif.collectionEx;

import java.util.ArrayList;

public class ArrayListDemo {

		public static void main(String[]args) {
			ArrayList<String>player = new ArrayList<String>();
			
			
			player.add("Dhoni");
			player.add("Rohit");
			player.add("Yuvraj");
			player.add("Virat");
			player.add("Surya");
			
			
			System.out.println(player);
			
			
			//System.out.println(player.remove(1));
			//System.out.println(player.remove());
			
			System.out.println(player);
			player.add("hardik");
			System.out.println(player);
			
			//player.addFirst("pant");
			// player.addLast("KL");
			
			
			System.out.println(player);
			

			player.add(2,"Bumrahhhhh");
			System.out.println(player);
			
			
		   player.set(2, "Bumrah");
		   System.out.println(player);
		   
		   System.out.println(player.indexOf("Hardik"));
		   
		   System.out.println(player.get(2));
			

			
		
	}


}