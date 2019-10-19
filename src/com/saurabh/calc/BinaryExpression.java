/*
Team : GRG Dev
Author : Saurabh Kumar
Start Date:
Description:

*/
package com.saurabh.calc;

public class BinaryExpression implements Expression {

	protected Constant left;
	protected Constant right;

	public BinaryExpression(Constant left, Constant right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public double getValue() 
	{
		return 0;
	}

}
