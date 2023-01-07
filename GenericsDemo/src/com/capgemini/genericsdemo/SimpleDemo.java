package com.capgemini.genericsdemo;

class Data
{
	private float str;
	
	public Data(float str) {
		this.str = str;
	}
	public float getStr() {
		return str;
	}
}

public class SimpleDemo {
	
	public static void main(String[] agrs) {
		Data obj = new Data(11.5f);
		float out = obj.getStr();
		System.out.println(out);
	}
	

}
