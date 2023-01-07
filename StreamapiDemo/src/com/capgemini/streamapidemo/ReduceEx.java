package com.capgemini.streamapidemo;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {
		
		//List of positive and negative numbers
		
List<Integer> numberslist=Arrays.asList(4,6,-8,9,22,567,787,-73);


Integer sum=numberslist.stream().reduce(0,(FE,SE)->FE+SE);
System.out.println(sum);
		
	}

}