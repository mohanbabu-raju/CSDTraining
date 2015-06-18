package com.test.rpn;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.rpn.RPNFormatter;
import com.training.rpn.RPNValidate;

// TODO: Auto-generated Javadoc
/**
 * The Class AddRPN.
 */
public class AddRPN {

		
	/**
	 * Test invalid expression.
	 */
	@Test
	public void testInvalidExpression()
	{
		// No of operator is one less than the operands
		// Minimum one operator and two Operand should be available
		String number ="2,2,3,+";
		RPNValidate validate = new RPNValidate(number);
		boolean statusFlag = validate.checkExpression();
		System.out.println("flag:::"+statusFlag);
		assertFalse(statusFlag);
	}

	/**
	 * Test valid expression.
	 */
	@Test
	public void testValidExpression()
	{
		// No of operator is one less than the operands
		// Minimum one operator and two Operand should be available
		String number ="2,2,3,+,-";
		RPNValidate validate = new RPNValidate(number);
		assertTrue(validate.checkExpression());
	}
	
	/**
	 * Test in valid data type.
	 */
	@Test
	public void testInValidDataType()
	{
		//check for digits + operator positive
		String number ="a,+";
		RPNValidate validate = new RPNValidate(number);
		int statusFlag = validate.checkValues();
		assertEquals(0, statusFlag);
	}
	
	/**
	 * Test calculate.
	 */
	@Test
	public void testCalculate()
	{
		//check for digits + operator positive
		String number ="1,2,3,+,-";
		RPNValidate validate = new RPNValidate(number);
		//int result = validate.calculateValues();
		//assertEquals(-4, result);
	}
	
	
	
	@Test 
	public void testValidDataFormat()
	{
		String number ="12,4,5,+,*";
		RPNValidate validate = new RPNValidate(number);
		//Check for delimiter
		boolean statusFlag = validate.checkValidInputData();
		assertTrue(statusFlag);
	}
	
	@Test 
	public void testInValidDataFormat()
	{
		String number ="12,4,5,a,b,+";
		RPNValidate validate = new RPNValidate(number);
		//Check for delimiter
		boolean statusFlag = validate.checkValidInputData();
		assertFalse(statusFlag);
	}
	
//	public void testOperatorPrecedence()
//	{
//		String number ="";
//		RPNFormatter validate = new RPNFormatter(number);
//		//Check for Operator precedence - operators has to be at last
//		int statusFlag = validate.checOperatorPrecedence();
//		assertEquals(0, statusFlag);
//	}
	
	/**
	 * Test valid data type.
	 */
//	@Test
//	public void testValidDataType()
//	{
//		//check for digits + operator positive
//		String number ="2,2,+";
//		RPNValidate validate = new RPNValidate(number);
//		int statusFlag = validate.checValues();
//		assertEquals(1, statusFlag);
//	}
	
}

