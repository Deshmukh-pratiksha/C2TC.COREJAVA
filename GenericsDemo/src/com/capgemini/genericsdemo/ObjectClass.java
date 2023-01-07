package com.capgemini.genericsdemo;

class Data1{
	private Object str;
	
	public Data1(Object str) {
		this.str = str;
	}
	
	public Object getStr() {
		return str;
	}
	
	@Override
	public String toString() {
		return "Data 1 [str=" + str + "]";
	}

}

public class ObjectClass {
	
	public static void main(String[] args) {
		Data1 obj1=new Data1(1);
		Integer out = (Integer)obj1.getStr();
		System.out.println(out);
	}

	
}