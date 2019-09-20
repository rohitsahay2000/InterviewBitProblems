package com.rohit.interviewbit;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
	
	 public int evalRPN(ArrayList<String> A) {
	 
		 Stack<Integer> operandStack = new Stack<>();
		 
		 int evaluatedNumber=0;
		 
		 for(String str : A) {
			 
			 if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
				 
				 int operand2 = operandStack.pop();
				 int operand1 = operandStack.pop();
				 
				 if(str.equals("+")) {
					 evaluatedNumber=operand1+operand2;
				 }
				 else if (str.equals("-")) {
					 evaluatedNumber=operand1-operand2;
				 }
				 else if (str.equals("*")) {
					 evaluatedNumber=operand1*operand2;
				 }				 
				 else {
					 evaluatedNumber=operand1/operand2;
				 }
				 operandStack.push(evaluatedNumber);
			 }
			 
			 else {
				 operandStack.push(Integer.parseInt(str));
			 }		 
		 }	 
		 return operandStack.pop();
	 
	 }
	
	
}
