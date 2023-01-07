package com.capgemini.streamapidemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {


	public static void main(String[] args) {
//List<Integer>list = List.of(2,4,6,434,578,656,5545);
//System.out.println(list);
		
		
		List<Integer>list = new ArrayList<>();
		
		list.add(1);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(122);
		list.add(16);
		list.add(12);
		list.add(11);
		list.add(81);
		
		
		//without Stream API
		
		List<Integer>ListEven = new ArrayList<>();
		for(Integer i:list)
		{
			if(i % 2 ==0)
			{
				ListEven.add(i);
			}
		}
		
		System.out.println("Original List:" +list);
		System.out.println("Processed List:" +ListEven);
		
		
		//with Stream API
		
		Stream<Integer>stream = list.stream();
		List<Integer>
		
		newList= stream.filter(i->i%2 ==0).collect(Collectors.toList());
		
		List<Integer>
		NewList = stream.filter(i->i%2 ==0).collect(Collectors.toList());
		System.out.println(NewList);
		
		List<Integer>
		NewList1 = list.stream().filter(i->i%2 == 0).collect(Collectors.toList());
		System.out.println(NewList1);
		
		
		System.out.println(list.stream().filter(i-> i%2 ==0).collect(Collectors.toList()));

	}

}