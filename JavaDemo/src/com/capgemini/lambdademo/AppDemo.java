package com.capgemini.lambdademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data
{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
	
}

public class AppDemo {

	public static void main(String[] args) {
		List<Data>list = new ArrayList<>();
		list.add(new Data("Bharti"));
		list.add(new Data("Damini"));
		list.add(new Data("Aaradhya"));
		list.add(new Data("Varsha"));
		list.add(new Data("pearl"));
		list.add(new Data("Mrunmai"));
		
		
		Collections.sort(list,(Data o1,Data o2)->{return o1.getName().compareTo(o2.getName());});
		
		for(Data data:list)
		{
			System.out.println(data.getName());
		}
	}

}
