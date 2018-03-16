package com.example.java.controller;

import java.util.Scanner;

import com.example.java.bean.*;

/**
* The Calculator program gets 2 numbers from 
* the user and asks for the operation to be
* performed and displays the result to the 
* console. It creates an object of Calculator bean to 
* do the arithmetic operation
* @author  Divakar Loganathan
* @version 1.0
* @since   2018-03-16
*/

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1;
		double number2;
		double result;
		String num1;
		String num2;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 =sc.nextLine();
		number1 = Double.parseDouble(num1);
		System.out.println("Enter the second number");
		num2 = sc.nextLine();
		number2 = Double.parseDouble(num2);
		System.out.println("Please select the operation: \n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide");
		choice = sc.nextInt();
		if(choice==1 | choice==2 |choice==3 | choice==4)
		{
			CalculatorBean cb = new CalculatorBean();
			cb.setValue1(number1);
			cb.setValue2(number2);
			switch(choice)
			{
			case 1: 
				result = cb.add();
				System.out.println("The result of adding "+number1+" and "+number2+" is:"+result);
				break;
			case 2: 
				result = cb.subtract();
				System.out.println("The result of subtracting "+number2+" from "+number1+" is:"+result);
				break;
			case 3: 
				result = cb.multiply();
				System.out.println("The result of multiplying "+number1+" with "+number2+" is:"+result);
				break;
			case 4: 
				result = cb.division();
				System.out.println("The result of dividing "+number1+" by "+number2+" is:"+result);
				break;
			}
		}
		else
			System.out.println("Sorry you have entered an invalid selection :(");
		sc.close();
	}

}
