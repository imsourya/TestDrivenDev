/*
Team : GRG Dev
Author : Saurabh Kumar
Start Date:
Description:

 */
package com.saurabh.calc;

public class Constant implements Expression {

	private double value;

	public Constant(double value) 
	{
		this.value= value;
	}

	@Override
	public double getValue() 
	{
		return this.value;
	}

}
