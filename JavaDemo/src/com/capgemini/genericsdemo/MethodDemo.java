package com.capgemini.genericsdemo;

class Demo<K,V>

{
	private K key;
	private V value;
	
	public Demo(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Demo [key=" + key + ", value=" + value + "]";
	}
	
	public<E,N>void print(E element, N number)
	{
		System.out.println("Elements"+element+"Number:"+number);
	}
	
	
	
}


public class MethodDemo {
public static void main(String[] args) {
	Demo<Integer,String>d=new
			Demo<Integer,String>(1,"pallavi");
		System.out.println("Key:"+d.getKey()+ "Value:"+ d.getValue());
		
		d.print(5788.90f, "Damini");
	
}
}
