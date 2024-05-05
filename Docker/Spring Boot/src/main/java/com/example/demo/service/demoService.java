package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service

public class demoService {

	public String getData(Integer a, Integer b)
{
	        Integer sum = a + b;
	        Integer difference = a - b;
	        Integer product = a * b;
	        Integer quotient = a / b;
	        Integer modulus = a % b;

	        return "Entered numbers are : \n\n" +
	        	   "Num1: " + a  + "  and  Num2: " + b + "\n\n" + 
	        	   "Sum : " + sum + "\n" +
	               "Difference: " + difference + "\n" +
	               "Product: " + product + "\n" +
	               "Division: " + quotient + "\n" +
	               "Modulus: " + modulus;
}
}