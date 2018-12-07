//Apparently you must import the input method to retrieve information from user/keyboard
import java.util.Scanner;


public class Calculator {
	public Calculator() {}
	public double add(double a, double b) {
		return a + b;
	}
	
	public double subtract(double a, double b) {
		return a - b;
	}
	
	public double multiply(double a, double b) {
		return a * b;
	}
	
	public double divide(double a, double b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner input = new Scanner(System.in);
		double a,b,d;
		char c;
		//get first number
		System.out.println("Please enter the first number");
		a = input.nextDouble();
		//get second number
		System.out.println("Please enter the second number");
		b = input.nextDouble();
		//Ask user what type of math they want performed
		System.out.println("Please enter + to add, - to subtract, * to multiply and / to divide");
		c = input.next().charAt(0);
		//figure out which math operation to use based on user's input.
		
		if (c == '+') {
			d = calc.add(a, b);
		} else if (c == '-') {
			d = calc.subtract(a, b);		
		} else if (c == '*') {
			d = calc.multiply(a, b);
		} else if (c == '/') {
			d = calc.divide(a, b);
		} else { 
			System.out.println("Invalid character");
			d = 0;
		}
		
		System.out.println(d);
		
		
		
	}

}
