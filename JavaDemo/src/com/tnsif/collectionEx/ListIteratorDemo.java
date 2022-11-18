package com.tnsif.collectionEx;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
	
	public class ListIteratorDemo {

		
		void display(LinkedList<String>list) {
			
			ListIterator<String> it=list.listIterator();
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
			System.out.println("**********************");
            System.out.println(player.size());
            System.out.println(player.contains("Hardik"));
            player.
			
			ListIteratorDemo im=new ListIteratorDemo();
			
			player.sort(null);
			im.display(player);
			System.out.println("**********************");
			
			Collections.reverse(player);
			im.display(player);
		
		}
	}



