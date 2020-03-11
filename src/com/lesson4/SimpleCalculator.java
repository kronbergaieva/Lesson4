package com.lesson4;
	/*
	 SimpleCalculator -- define an instantiable class to perform arithmetic operations
	 This example shows how to declare an instantiable class, and in particular:
	 -- how to declare instance variables/ fields
	 -- how to declare setter and getter methods corresponding to the instance variables
	 -- how to declare a method to return a value
	 */
//declare instance class
public class SimpleCalculator {
	//declare instance variables
	private double firstNumber;
	private double secondNumber;
	private double result;
	
	//declare action of our processing method
	public void multiply(){
		result = firstNumber * secondNumber;
			}

	public void devide(){
		result = firstNumber / secondNumber;
	}
	
	public void display(){
		System.out.println("our first number:  "+ firstNumber);
		System.out.println("our second number: "+ secondNumber);
		System.out.println();
	}
	
	//declare setter method to receive a value from the user
	public void setFirstNumber(double number){
				//store the number in the firtNumber ofinstance variable
		firstNumber = number;
	}
		public void setSecondNumber(double num){
			//store the number in the firstNumber of instance variable
				secondNumber = num;
		}			
				public double getResult(){
					return result;

	}

}