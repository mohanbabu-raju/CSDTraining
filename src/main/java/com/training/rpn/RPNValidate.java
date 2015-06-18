package com.training.rpn;

import java.util.ArrayList;
import java.util.Stack;

// TODO: Auto-generated Javadoc
/**
 * The Class RPNValidate.
 */
public class RPNValidate {

	/** The input. */
	String input = null;
	
	/** The operand value. */
	ArrayList<String> operandValue = new ArrayList();
	
	/** The operator value. */
	ArrayList<String> operatorValue = new ArrayList();

	/**
	 * Instantiates a new RPN validate.
	 *
	 * @param input the input
	 */
	public RPNValidate(String input) {
		this.input = input;
	}

	/**
	 * Check expression.
	 *
	 * @return the int
	 */
	public boolean checkExpression() {
			return validateOperatorOperand(input);
	}

	/**
	 * Validate operator operand.
	 *
	 * @param input2 the input2
	 * @return the int
	 */
	private boolean validateOperatorOperand(String input2) {

		String data[] = input2.split(",");
		int operatorCount = 0;
		int operandCount = 0;
		boolean statusFlag = false;
		for (String value : data) {
			try {
				Integer.parseInt(value);
				operandValue.add(value);
				operandCount++;
			} catch (NumberFormatException NFE) {
				operatorValue.add(value);
				operatorCount++;
			}
		}
		if (operandCount > 0 && operatorCount > 0) {
			int status = operandCount - operatorCount;
			if (status == 1)
				statusFlag = true;
		}
		
		return statusFlag;
	}

	/**
	 * Test valid data type.
	 *
	 * @param input2 the input2
	 * @return the int
	 */
//	private int testValidDataType(String input2) {
//
//		String data[] = input2.split(",");
//		int operatorCount = 0;
//		int operandCount = 0;
//		int statusFlag = 0;
//		for (String value : data) {
//			try {
//				int number = Integer.parseInt(value);
//				operandValue.add(value);
//				operandCount++;
//
//			} catch (NumberFormatException NFE) {
//					operatorValue.add(value);
//					operatorCount++;
//			}
//		}
//		if (operandCount > 0 && operatorCount > 0) {
//			int status = operandCount - operatorCount;
//			if (status == 1)
//				statusFlag = 1;
//		}
//		return statusFlag;
//	}
	


	/**
	 * Calculate values.
	 *
	 * @return the int
	 */
	public int calculateValues() {
		int result = 0;

		if (checkExpression()) {

			for (String operator : operatorValue) {
				int operandLength, operatorLength = 0;
				operandLength = operandValue.size();
				if (operandLength > 1) {
					String value1 = operandValue.get(operandLength - 1);
					String value2 = operandValue.get(operandLength - 2);
					if(operator.equals("+"))
					result = Integer.parseInt(value2)
							+ Integer.parseInt(value1);
					else if(operator.equals("-"))
						result = Integer.parseInt(value2)
						- Integer.parseInt(value1);
					else if(operator.equals("*"))
						result = Integer.parseInt(value2)
						* Integer.parseInt(value1);
					else if(operator.equals("/"))
						result = Integer.parseInt(value2)
						/ Integer.parseInt(value1);
				//	String operand = operandValue.toString();

					operandValue.remove(operandLength - 1);
					operandValue.remove(operandLength - 2);
					operandValue.add(String.valueOf(result));

				}
			}
			System.out.println("Result::" + operandValue.toString());
			System.out.println("Result::" + result);

		}
		return result;
	}
	
	public boolean checkDataFormat(){
		String pattern = "\b{}";
		String result = input.replaceAll(",", "");
		return false;
	}
	
	public boolean checkValidInputData(){
		 String regex = "[0-9_,_+_-_*_/]+";
		 
		if(input.matches(regex)){
			return true;
		}
		return false;
	}

	public int checValues(String[] tokens) {
			 
	        int returnValue = 0;
	 
	        String operators = "+-*/";
	 
	        Stack<String> stack = new Stack<String>();
	 
	        for(String t : tokens){
	            if(!operators.contains(t)){
	                stack.push(t);
	            }else{
	                int a = Integer.valueOf(stack.pop());
	                int b = Integer.valueOf(stack.pop());
	                int index = operators.indexOf(t);
	                switch(index){
	                    case 0:
	                        stack.push(String.valueOf(a+b));
	                        break;
	                    case 1:
	                        stack.push(String.valueOf(b-a));
	                        break;
	                    case 2:
	                        stack.push(String.valueOf(a*b));
	                        break;
	                    case 3:
	                        stack.push(String.valueOf(b/a));
	                        break;
	                }
	            }
	        }
	 
	        returnValue = Integer.valueOf(stack.pop());
	 
	        return returnValue;
	 
	    }
	public static void main(String arg[])
	{
		RPNValidate rpn = new RPNValidate("Test");
		String[] tokens = new String[] { "5", "1", "2", "+", "4","*","+","3","-"};
		
		int test = rpn.checValues(tokens);
		System.out.println("TestValue="+test);
	}

	public int checkValues() {
		// TODO Auto-generated method stub
		return 0;
	}
}
