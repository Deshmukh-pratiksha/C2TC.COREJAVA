package com.capgemini.junittesingdemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class AssertDemo {

	@Test
	public void simple()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);
	}
	
   @Test
	public void simple1()
	{
		int result=1;
		int expected=2;
		assertEquals(result,expected);
	}
	
	
	@Disabled
	@Test
	public void simple2()
	{
		int result=1;
		int expected=3;
		assertEquals(result,expected);
	}
	@Test
	public void simple3()
	{
		int result=1;
		int expected=4;
		assertEquals(result,expected);
	}
}