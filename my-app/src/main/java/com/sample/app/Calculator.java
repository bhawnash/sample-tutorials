package com.sample.app;

public class Calculator {
	
	double number1;
	
	double number2;
	
	Calculator(){
		number1=0;
		number2=0;
	}
	
	Calculator(double number1,double number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	public double add(){
		return number1+number2;
	}
	
	public double subtract(){
		if(number1<=number2)
			return number2-number1;
		return number1-number2;
	}
	
	public double multiply(){
		return number1*number2;
	}
	
	public double divide() throws ArithmeticException{
		if(number2 > 0)
			return number1/number2;
		throw new ArithmeticException("Cannot divide a number by zero");
	}
}
