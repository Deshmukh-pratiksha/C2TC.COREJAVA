package com.capgemini.genericsdemo;

class Data_1<K extends String,V extends String>
{
	private K key;
	private V value;
	
	

public Data_1(K key, V value) {
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
	return "Data_1 [key=" + key + ", value=" + value + "]";
}


public<E extends String,N extends Integer>void display(E element, N number)
{
	System.out.println("Element:" +element+" "+"Number is"+number);
}
}


public class BoundedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_1<String,String> obj =new
		Data_1<String,String>("Sam","abc");

		obj.display("Sahib",24);
	}

}
