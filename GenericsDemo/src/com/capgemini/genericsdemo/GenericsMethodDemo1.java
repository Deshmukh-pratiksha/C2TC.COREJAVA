package com.capgemini.genericsdemo;

class Datas<K,V>
{
	private K key;
	private V value;
	
	
	public Datas(K key, V value) {
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
		return "Datas [key=" + key + ", value=" + value + "]";
	}
	
	public<E,N>void display(E element, N number){
		
		System.out.println("Element:"+element+""+" Number is"+number);
	}
}



public class GenericsMethodDemo1 {

	public static void main(String[]args) {
		
		Datas<Integer,String>obj = new
		Datas<Integer,String>(10,"Pratiksha");
		
		System.out.println("Key is"+obj.getKey()+" Value is "+obj.getValue());
		obj.display(12,"Pallavi");
	}
}