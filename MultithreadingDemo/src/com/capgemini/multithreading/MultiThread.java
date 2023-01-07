package com.capgemini.multithreading;

/*class Eclipse extends Thread{
		
		public void run()
		{
			System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		}
	}

	class calculator extends Thread
	{
		public void run()
		{
			System.out.println("calculator Thread name is"+ Thread.currentThread().getName());
		}

	}

	class Chrome extends Thread{
		public void run()
		{
			System.out.println("Chrome Thread name is"+ Thread.currentThread().getName());
		}
	}

	class OneNote extends Thread{
		public void run()
		{
			System.out.println("OneNote Thread name is"+ Thread.currentThread().getName());
		}
	}
*/


class Eclipse extends Thread{
	
	public void run()
	{
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is"+ Thread.currentThread().getId());

	}
}

class calculator extends Thread
{
	public void run()
	{
		System.out.println("calculator Thread name is"+ Thread.currentThread().getName());
		System.out.println("calculator Thread ID is"+ Thread.currentThread().getId());

	}

}

class Chrome extends Thread{
	public void run()
	{
		System.out.println("Chrome Thread name is"+ Thread.currentThread().getName());
		System.out.println("Chrome Thread ID is"+ Thread.currentThread().getId());
	}
}

class OneNote extends Thread{
	public void run()
	{
		System.out.println("OneNote Thread name is"+ Thread.currentThread().getName());
		System.out.println("OneNote Thread ID is"+ Thread.currentThread().getId());	}
}

	public class MultiThread {

		
		public static void main(String[] args) {
			Eclipse e=new Eclipse();	
		    e.start();
		    
		    calculator c=new calculator();	
		    c.start();
		
		    Chrome ch=new Chrome();	
		    ch.start();
		    
		    OneNote on=new OneNote();	
		    on.start();
		}

	}