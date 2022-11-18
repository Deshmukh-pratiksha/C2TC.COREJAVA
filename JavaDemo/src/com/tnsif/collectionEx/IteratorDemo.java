package com.tnsif.collectionEx;

import java.util.LinkedList;

import java.util.Iterator;

public class IteratorDemo {
	
	void display(LinkedList<String>list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext()) 
		{
		  System.out.println("Player name is:"+it.next());
		}
	}

	public static void main(String[]args) {
		LinkedList<String> player = new LinkedList<String>();
		
		
		player.add("Dhoni");
		player.add("Rohit");
		player.add("Yuvraj");
		player.add("Virat");
		player.add("Surya");
		
		
		System.out.println(player);
		IteratorDemo im=new IteratorDemo();
		im.display(player);
	
	}
}
