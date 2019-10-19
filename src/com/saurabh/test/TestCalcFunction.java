package com.saurabh.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.saurabh.calc.Constant;
import com.saurabh.calc.Divide;
import com.saurabh.calc.Expression;
import com.saurabh.calc.Adder;
import com.saurabh.calc.Multiply;
import com.saurabh.calc.Subtract;

/*
Team : GRG Dev
Author : Saurabh Kumar
Start Date:
Description:

 */

public class TestCalcFunction {

	
	
	@Test
	public void testExp() {
		Expression e = new Constant(3.0);
		assertEquals(e.getValue(), 3.0, 0.0);
		System.out.println("1");
	}
	
	@Test
	public void testAdder()
	{
		Expression e = new Adder(new Constant(320), new Constant(100));
		assertEquals(e.getValue(), 420,0.0);
		System.out.println("2");
	}
	
	@Test
	public void testSubtract()
	{
		Expression e = new Subtract(new Constant(320), new Constant(100));
		assertEquals(e.getValue(), 220 ,0.0);
		System.out.println("3");
	}
	
	@Test
	public void testDivide()
	{
		Expression e = new Divide(new Constant(320), new Constant(100));
		assertEquals(e.getValue(), 3.2 ,0.0001);
		System.out.println("4");
	}
	
	@Test
	public void testMultiply()
	{
		Expression e = new Multiply(new Constant(34.32), new Constant(30));
		assertEquals(e.getValue(), 1029.6 ,0.01);
		System.out.println("5");
	}
	
	@Test
	public void testExpression()
	{
		// Testing : (3*5)+((7*3)-(5*2))/(13+5+2)
		Expression e = new Divide(new Constant(new Adder(
				
				new Constant(new Multiply(new Constant(3), new Constant(5)).getValue()), 
				
				new Constant(new Subtract(
						new Constant(new Multiply(new Constant(7), new Constant(3)).getValue()),
						
						new Constant(new Multiply(new Constant(5), new Constant(2)).getValue())).getValue())).getValue()),
				
				new Constant(new Adder(new Constant(13), new Constant(new Adder(new Constant(5), new Constant(2)).getValue())).getValue()));

		System.out.println("6");
		assertEquals(e.getValue(),11.3,10);
	}
}
