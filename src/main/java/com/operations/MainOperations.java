package com.operations;

public class MainOperations {

	public static int factorial(int current, int pr) {
		if(current == 1 || current == 0) {
			return pr;
		}
		
		if(current < 0) {
			return -1;
		}

		return factorial(current - 1, pr * current);
	}
	
}
