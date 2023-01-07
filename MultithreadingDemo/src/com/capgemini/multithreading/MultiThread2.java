package com.capgemini.multithreading;

public class MultiThread2 {
	

		
		public static void main(String[] args) {
			Eclipse e=new Eclipse();	
		    e.start();
		    
		    calculator c=new calculator();	
		    c.start();
		
		    Chrome ch=new Chrome();	
		    ch.start();
		    
		    OneNote on=new OneNote();	
		    on.start();
		    
		    System.out.println("Main Thread name is"+ Thread.currentThread().getName());
			System.out.println("Main Thread ID is"+ Thread.currentThread().getId());
		}

	}


