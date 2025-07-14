package com.display.patterns;

public class DecreasingTriangle {

	public static void main(String[] args) {
		TakeIntegerInput in = new TakeIntegerInput();
		in.displayText("Enter the depth of stars");
		int depth = in.receiveNumber();
		if (depth > 0) {
			for (int i = 1; i <= depth; i++) {
				for (int j = 1; j <= depth + 1 - i; j++) {
					System.out.print("*" + " ");
				}
				System.out.println();
			}
		}
	}

}
