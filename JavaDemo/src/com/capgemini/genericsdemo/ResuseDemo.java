package com.capgemini.genericsdemo;

import java.util.ArrayList;
import java.util.List;

class Demo1
{
	public<E>void printListData()
	{
		
	}
	public<E>void printArrayData(List<E> obj1)
	{
		for(E i:obj1)
		{
			System.out.println(i);
		}
	}
}

public class ResuseDemo {
	
	public static void main(String[] args) {
		
		List<Integer>object = new ArrayList<>();
		object.add(1);
		object.add(2);
		object.add(3);
		object.add(4);
		object.add(5);
		
		
		Demo1 d1 = new Demo1();
		d1.printArrayData(object);
		
		List<String>object1 = new ArrayList();
		object1.add("Hii");
		object1.add("Everyone");
		object1.add("COETA");
		object1.add("Students");
		object1.add("TNSIF");

		d1.printArrayData(object1);
		
		List<Float>object2 = new ArrayList<>();
		object2.add(44.66f);
		object2.add(445.77f);

		d1.printArrayData(object2);


	}

}
