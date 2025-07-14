package com.display.patterns;

import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeIntegerInput {

	public String displayText(String s) {
		System.out.println(s);
		return s;
	}
	public int receiveNumber() {
		int number = new Scanner(System.in).nextInt();
		System.out.println("The number you entered is " + number);
		return number;
	}
	public void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		TakeIntegerInput in = new TakeIntegerInput();
		in.displayText("Enter number of depth of stars");
		in.receiveNumber();
	}

}
