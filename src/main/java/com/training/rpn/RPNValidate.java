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
	 * @param input
	 *            the input
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
	 * @param input2
	 *            the input2
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

	
	public boolean checkDataFormat() {
		String pattern = "\b{}";
		String result = input.replaceAll(",", "");
		return false;
	}

	public boolean checkValidInputData() {
		String regex = "[0-9_,_+_-_*_/]+";

		if (input.matches(regex)) {
			return true;
		}
		return false;
	}

	public String checValues(String input) {

		int returnValue = 0;
		String[] tokens = input.split(",");
		String operators = "+-*/^!%";

		Stack<String> stack = new Stack<String>();

		for (String t : tokens) {
			if (!operators.contains(t)) {
				stack.push(t);
			} else {
				double a = Double.valueOf(stack.pop());
				double b = 0;
				int index = operators.indexOf(t);
				switch (index) {
				case 0:
					b= Double.valueOf(stack.pop());
					stack.push(String.valueOf(a + b));
					break;
				case 1:
					b=Double.valueOf(stack.pop());
					stack.push(String.valueOf(b - a));
					break;
				case 2:
					b=Double.valueOf(stack.pop());
					stack.push(String.valueOf(a * b));
					break;
				case 3:
					b=Double.valueOf(stack.pop());
					stack.push(String.valueOf(b / a));
					break;
				case 4:
					b=Double.valueOf(stack.pop());
					stack.push(String.valueOf(Math.pow(b,a)));
					break;
				case 5:
					Double factorial = 1.0;
					for (int i = 1; i <= a; i++)
						factorial *= i;
					stack.push(String.valueOf(factorial));
					break;
				case 6:
					double result = (a) /100;
					stack.push(String.valueOf(result));
					break;
				}
			}
		}

		//returnValue = Integer.valueOf(stack.pop());
		//returnValue = Double.valueOf(stack.pop());

		return stack.pop();

	}

	public static void main(String arg[]) {
		RPNValidate rpn = new RPNValidate("Test");
		//String[] tokens = new String[] { "12", "3", "/", "!" };
		//String[] tokens = new String[] { "5", "1", "2", "+","4","*","+","3","-" };
		//String[] tokens = new String[] { "50","%","2","*" };
		//String[] tokens = new String[] { "3","!","4","5","*","+" };
		String[] tokens = new String[] { "2","3","^","4","5","+","+" };
		//String[] tokens = new String[] { "6","2","*","3","/"};
		//String[] tokens = new String[] { "1","2","3","+","-"};
		

		//String test = rpn.checValues(tokens);
		//System.out.println("TestValue=" + test);
	}

	public int checkValues() {
		// TODO Auto-generated method stub
		return 0;
	}
}
