package com.exception.bll;

public class DivideEx {
	public int divide(int x,int y) {
		
		try{
			 return x/y;
			}
		
		catch(ArithmeticException e){
				System.out.println(e+"__Cannot divide by zero");
			}	
		
		return y;
		}
		

	}
