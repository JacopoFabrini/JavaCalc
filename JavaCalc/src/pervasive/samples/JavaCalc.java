package pervasive.samples;

import java.util.Scanner;

public class JavaCalc {

	public static void main(String[] args) {
		double n1, n2; // Double è un tipo primitivo e non deve essere creato,
						// scanner invece è di tipo reference e deve essere
						// creato
		String operation; //
		Scanner scannerObject = new Scanner(System.in); // Fa il parsing di un
														// flusso in ingresso

		System.out.println("Enter first number");
		n1 = scannerObject.nextDouble(); // next double prende la stringa e la
											// porta in double

		System.out.println("Enter second number");
		n2 = scannerObject.nextDouble();

		Scanner op = new Scanner(System.in); // creiamo un altro oggetto di tipo
												// scanner
		System.out.println("Enter your operation");
		operation = op.next(); // Qui non avviene alcuna conversione quindi
								// usiamo solo next

		switch (operation) {
		case "+":
			System.out.println("Your answer is " + (n1 + n2));
			break;
		case "-":
			System.out.println("Your answer is " + (n1 - n2));
			break;
		case "*":
			System.out.println("Your answer is " + (n1 * n2));
			break;
		case "/":
			System.out.println("Your answer is " + (n1 / n2));
			break;
		default:
			System.out.println("Wrong operator!");
			break;
		}

	}

}
