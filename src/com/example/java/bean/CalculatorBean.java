package com.example.java.bean;
/**
 * The CalculatorBean class is a bean object class
 * for the calculator, it has 3 variables value1, value2
 * and result to perform the arithmetic operations
 * 
 * @author Divakar Loganathan
 * @version 1.0
 * @since 2018-03-16
 *
 */
public class CalculatorBean {

private double value1;
private double value2;
private double result;

public double getValue1() {
	return value1;
}
public void setValue1(double value1) {
	this.value1 = value1;
}
public double getValue2() {
	return value2;
}
public void setValue2(double value2) {
	this.value2 = value2;
}

/**
 * This method is used to add two double value. 
 * @param value1 This is the first parameter to add method
 * @param value2 This is the second parameter to add method
 * @return result This variable returns the sum of value1 and value2.
 */

public double add()
{
	result = value1 + value2;
	return result;
}

/**
 * This method is used to subtract two double value. 
 * @param value1 This is the first parameter to add method
 * @param value2 This is the second parameter to add method
 * @return result This variable returns the difference of value1 and value2.
 */

public double subtract()
{
	result = value1 - value2;
	return result;
}

/**
 * This method is used to multiply two double value. 
 * @param value1 This is the first parameter to add method
 * @param value2 This is the second parameter to add method
 * @return result This variable returns the multiplied value of value1 and value2.
 */

public double multiply()
{
	result = value1 * value2;
	return result;
}

/**
 * This method is used to divide two double value. 
 * @param value1 This is the first parameter to add method
 * @param value2 This is the second parameter to add method
 * @return result This variable returns the divided result of value1 and value2.
 */

public double division()
{
	result = value1 / value2;
	return result;
}

}
