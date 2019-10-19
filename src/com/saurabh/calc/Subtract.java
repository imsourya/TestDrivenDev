/*
Team : GRG Dev
Author : Saurabh Kumar
Start Date:
Description:

*/
package com.saurabh.calc;

public class Subtract extends BinaryExpression {

	public Subtract(Constant left,Constant right) 
	{
		super(left,right);
	}
	
	@Override
	public double getValue()
	{
		return this.left.getValue() - this.right.getValue();
	}

}
