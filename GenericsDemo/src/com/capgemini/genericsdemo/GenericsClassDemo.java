package com.capgemini.genericsdemo;


class Test<T>
{
	private T obj;
	
	public Test(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Test [obj=" + obj + "]";
	}
	
	
	
}

public class GenericsClassDemo {

	public static void main(String[] args) {
		
	Test<Integer>t = new Test<Integer>(1);
	Integer out = t.getObj();
	System.out.println(out);
	

	}

}